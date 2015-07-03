//新闻发布页面调用的js文件
jQuery(function($){//该函数等同于window.onload
	
	$("#js_preview").on("click","button",function(){             //预览
		console.log(artiUtils.isFilled());
		console.log(artiUtils.getEmptyItem());
		if(!artiUtils.isFilled()){
			alert(artiUtils.getEmptyItem()[0].message);
			return false;
		}
		var title = $(".js_title").val();
		title = artiUtils.buildtitle(title);
		var author = $(".js_author").val()=="" ? "唐山政务服务中心":$(".js_author").val();
		author = artiUtils.buildsubtitle(author,"新闻来源");
		var time = new Date().toLocaleString();
		time = artiUtils.buildsubtitle(time,"投稿时间");
		var content = ue_news.getContent();
		$("#js_article").children().remove();
		$("#js_article").append(title);
		$("#js_article").append(author);
		$("#js_article").append(time);
		$("#js_article").append(content);
	});
	$("#js_save").on("click","button",function(){         //保存
		//alert($(this).html());
		saveall1();
	});

	$("#js_release").on("click","button",function(){           //保存并发布
		//alert($(this).html());
		saveall2();
	});	
	
	function saveall1(){
		console.log(artiUtils.isFilled());
		console.log(artiUtils.getEmptyItem());
		if(!artiUtils.isFilled()){
			alert(artiUtils.getEmptyItem()[0].message);
			return false;
		}
		var title = $(".js_title").val();
		var author = $(".js_author").val()=="" ? "唐山政务服务中心":$(".js_author").val();
		var time = new Date().toLocaleString();
		var cover = $("#filemsg").val()=="" ? "":$("#filemsg").val();
		var content = ue_news.getContent();
		var type="0";
		var fbbz="false";
		//alert(title);
	    //alert(author);
		//alert(time);
		//alert(cover);
		//alert(content);
		$.post("../servlet/NewsSave",{tit:title,aut:author,cov:cover,con:content,typ:type,fbb:fbbz},function(data){
			var result = data;
			alert(result);
		});
	}
	function saveall2(){
		console.log(artiUtils.isFilled());
		console.log(artiUtils.getEmptyItem());
		if(!artiUtils.isFilled()){
			alert(artiUtils.getEmptyItem()[0].message);
			return false;
		}
		var title = $(".js_title").val();
		var author = $(".js_author").val()=="" ? "唐山政务服务中心":$(".js_author").val();
		var time = new Date().toLocaleString();
		var cover = $("#filemsg").val()=="" ? "":$("#filemsg").val();
		var content = ue_news.getContent();
		var type="0";
		var fbbz="true";
		
		$.post("../servlet/NewsSave",{tit:title,aut:author,cov:cover,con:content,typ:type,fbb:fbbz},function(data){
			var result = data;
			alert(result);
		});
	}
});

//用于生成文章的闭包工具类，如包裹标题，包裹作者等等操作
(function($){
	var artiUtils = window.artiUtils = {
		buildtitle: function(content){
			var title = $("<h2>").html(content);
			return title;
		},
		buildsubtitle:function(content,type){
			var subtitle = $("<h3>").html(type+": "+content);
			return subtitle;
		},
		isFilled:function(){
			var emptyItemArr = artiUtils.getEmptyItem();
			return emptyItemArr.length===0 ? true:false;
		},
		getEmptyItem:function(){
			var emptyItemArr = [];
			!$(".js_title").val() && emptyItemArr.push({name:"js_title",property:"class",message:"标题为空,请填写标题"}); 
			//如有其他必填项，在此添加

			return emptyItemArr;
		}
	};
})(jQuery);