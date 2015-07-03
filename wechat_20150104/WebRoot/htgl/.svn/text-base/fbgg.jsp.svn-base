<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>发布公告</title>
    <link rel="stylesheet" type="text/css" href="css/ht_frame.css"/>
	<link rel="stylesheet" type="text/css" href="css/wxshow.css">
	<link rel="stylesheet" type="text/css" href="../wechat/js/sidebar/css/sidebar.css">
	<script type="text/javascript" src='js/jquery-1.8.2.min.js'></script>
	<script type="text/javascript" src="js/sidebar/sidebar.js"></script>
	<script type="text/javascript" src="js/gonggao-release.js"></script>
	<script type="text/javascript" src="js/jquery.form.js" ></script>
	<script type="text/javascript" src="js/fileload.js" ></script>
</head>
  
<body>
  	<div class="con-box">
		<div class="content-block" id="content-block1">
		<h3 class="title">发布公告</h3>
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
						<form id='_fileForm' enctype='multipart/form-data'>
		                         <table cellspacing="0" cellpadding="3" style="margin:0 auto; margin-top:20px;">
		                         <tr>
		                         <td class="tdt tdl">请选择文件：</td>
		                         <td class="tdt tdl"><input class="ptm-input js_cover" type="file" name="filepath" id="filepath" /></td>
		                         <td class="tdt tdl tdr"><input type="button" onclick="fileloadon()" value="上传"/></td>
		                         </tr>
		                         <tr> 
		                         <td class="tdt tdl tdr" colspan='3'style='text-align:center;'>
		                         <div id="msg">&nbsp;</div>
		                         <div id="filemsg" style="display:none;"></div>
		                         </td> 
		                         </tr>
		                         </table>
		                         </form>
					</div>
					<div class="ptm-edit-item">
						<label class="ptm-label">正文<span class="tips js_auto_tips"></span></label>
						<div class="ptm-ueditor">
						    <!-- 加载编辑器的容器 -->
						    <div id="js_ueditor" style="height:150px"></div>
						    <!-- 配置文件 -->
						    <script type="text/javascript" src="js/ueditor/ueditor.config.js"></script>
						    <!-- 编辑器源码文件 -->
						    <script type="text/javascript" src="js/ueditor/ueditor.all.min.js"></script>
						    <!-- 实例化编辑器 -->
						    <script type="text/javascript">
						        var ue_news = UE.getEditor('js_ueditor');
						    </script>
						</div>
					</div>
					<div class="toolarea">
						<span id="js_preview" class="btn btn-primary"><button>预览</button></span>
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
</body>
</html>
