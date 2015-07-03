//菜单栏插件 公共函数：sideBar,appendSideItem
//通过sideBar函数初始化菜单栏，将菜单栏需要的背景图位置传递进来，$("#sidebar").sideBar({picUrl:"../js/sidebar/images/"});
//通过appendSideItem来添加菜单，菜单结构以json格式传进来
//菜单格式：item:{menuname:name,
//              	bgurl:url,
//					submenus:[{url:url,subname:name},{url:url,subname:name}]
//				}
(function($){
	var settings = {};
	//初始化菜单栏
	$.fn.sideBar = function(options) {
		//默认参数
		var picUrl = (function(){
			var url = "";
			$("link").each(function(index, el) {
				if($(this).attr('href').search(/sidebar.css/)!=-1){
					url = $(this).attr('href').replace("css/sidebar.css","images/");
				}
			});
			return url;
		})();
		var defaults = {
			picUrl:picUrl // sidebar/images文件夹所处工程位置
		};
		settings = $.extend(defaults, options || {});
		return this;
	};
	//添加菜单
	$.fn.appendSideItem = function(item){
		if(settings.picUrl ===""){
			alert("请初始化菜单栏!");
			return false;
		}
		var sideItem = createSideItem(item);
		this.append(sideItem);
	};
	var createSideItem = function(item){
		/*<div class="side-item">
			<div class="side-menu" style="background:url() 0 ..">
				<div class="menu-expandable">
					<a href="javascript:void(0)">新闻中心</a>
				</div>
			</div>
			<div class="submenus" style="display:none;">
				<ul>
					<li>发布新闻</li>
				</ul>
			</div>
		</div>*/
		var sideitem = $("<div>").addClass('side-item');
		var sidemenu = $("<div>").addClass('side-menu').css({background:"url("+settings.picUrl+item.bgurl+") 0 center no-repeat"});
		var menu = $("<div>").addClass('menu-expandable');
		var a = $("<a>").attr("href","javascript:void(0)").html(item.menuname);
		a.appendTo(menu);
		menu.appendTo(sidemenu);
		sidemenu.appendTo(sideitem);
		if(!item.submenus||item.submenus === {}){
			return sideitem;
		}

		var submenus = $("<div>").addClass('submenus').css('display', 'none');;
		var ul = $("<ul>");
		for(var i =0;i<item.submenus.length;i++){
			var a = $("<a>").attr("href",item.submenus[i].url).html(item.submenus[i].subname);
			$("<li>").append(a).appendTo(ul);
		}
		ul.appendTo(submenus);
		submenus.appendTo(sideitem);
		return sideitem;
	};
})(jQuery);
jQuery(function($){
	//菜单切换效果
	$(".sidebar").on("click",".side-menu a",function(){
		var speed = 250;
		var sidemenu = $(this).parent().parent();
		sidemenu.next().stop(true);
		sidemenu.addClass('inselected');
		var needinvalidmenu = $(".side-menu,.active");
		if(needinvalidmenu.length>0){
			needinvalidmenu.not(".inselected");
			needinvalidmenu.removeClass('active');
			needinvalidmenu.next().slideUp(speed);
		}
		sidemenu.removeClass('inselected');
		if(sidemenu.next(".submenus").css("display")==="block"){
			sidemenu.addClass('active');
		}
		if(sidemenu.hasClass('active')){
			sidemenu.removeClass('active');
			sidemenu.next(".submenus").slideUp(speed);
		}else{
			sidemenu.addClass('active');
			sidemenu.next(".submenus").slideDown(speed);
		}
	});
	//子菜单点击刷新内容区
});