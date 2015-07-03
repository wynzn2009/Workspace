<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>编辑页面</title>	
	<link rel="stylesheet" type="text/css" href="../css/ht_frame.css">
	<link rel="stylesheet" type="text/css" href="../css/wxshow.css">
	<link rel="stylesheet" type="text/css" href="../js/sidebar/css/sidebar.css">
	<script type="text/javascript" src='../js/jquery-1.10.2.min.js'></script>
	<script type="text/javascript" src="../js/sidebar/sidebar.js"></script>
	<script type="text/javascript" src="../js/news-release.js"></script>
  </head>
  
  <body>
    <div class="ht-box">
	<div class="topbanner-box">banner</div>
	<div class="con-box">
		<div class="side-box">
			<div class="sidebar" id="mainsidebar">
				<!--自定义菜单栏-->
				<script type="text/javascript">
					jQuery(function(){
						$("#mainsidebar").sideBar();
						var item = {menuname:"新闻中心", bgurl:"backbt1.png", 
									submenus:[{url:"javascript:void(0)",subname:"发布新闻"},{url:"javascript:void(0)",subname:"新闻历史"}]};
						$("#mainsidebar").appendSideItem(item);
						var item = {menuname:"公告中心", bgurl:"backbt2.png", 
									submenus:[{url:"javascript:void(0)",subname:"发布公告"},{url:"javascript:void(0)",subname:"公告历史"}]};
						$("#mainsidebar").appendSideItem(item);
						$(".side-menu a").first().trigger('click');
					});
				</script>
			</div>
		</div>
		<div class="content-box">
			<div class="content-block">
				<h3 class="title">内容区自身标题--发布新闻</h3>
				<div class="block-editor">
					<div class="inner">
						<div class="ptm-edit-item">
							<label class="ptm-label">标题</label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input js_title"></div>
						</div>
						<div class="ptm-edit-item">
							<label class="ptm-label">作者<span class="tips">(选填)</span></label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input js_author"></div>
						</div>
						<div class="ptm-edit-item">
							<label class="ptm-label">封面<span class="tips">(用于微信内显示，不会显示在内容区)</span></label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input"></div>
						</div>
						<div class="ptm-edit-item">
							<label class="ptm-label">正文<span class="tips js_auto_tips"></span></label>
							<div class="ptm-ueditor">
							    <!-- 加载编辑器的容器 -->
							    <script id="js_ueditor" type="text/plain" style="min-height:250px;"></script>
							    <!-- 配置文件 -->
							    <script type="text/javascript" src="../js/ueditor/ueditor.config.js"></script>
							    <!-- 编辑器源码文件 -->
							    <script type="text/javascript" src="../js/ueditor/ueditor.all.min.js"></script>
							    <!-- 实例化编辑器 -->
							    <script type="text/javascript">
							        var ue_news = UE.getEditor('js_ueditor');
							    </script>
							</div>
						</div>
						<div class="toolarea">
							<span id="js_preview" class="btn btn-default"><button>预览</button></span>
							<span id="js_save" class="btn btn-primary"><button>保存</button></span>
							<span id="js_release" class="btn btn-primary"><button>保存并发布</button></span>
						</div>
					</div>
					
				</div>
				<div class="block-preview">
					<div id="js_article" class="wxshow"></div>
				</div>
				<div style="clear:both;"></div>
			</div>
		</div>
		<div style="clear:both;"></div>
	</div>
	<div class="footer-box">footer</div>
</div>
</body>
  </body>
</html>
