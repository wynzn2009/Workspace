<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.ServletContext" %>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<style type="text/css">
input[type='submit'],input[type='button']{
	border: none;
	background-color: #0066CC;
	cursor: pointer;
	color: white;
	font-size: 16px;
	border-radius: 3px;
	padding: 5px 10px;
	margin: 40px 8px;
	position: relative;

}
</style>
	<head runat="server">
	    <base href="<%=basePath%>">
	    
	    <title>新闻发布</title>
	    	<meta http-equiv="pragma" content="no-cache">
	     <meta http-equiv="cache-control" content="no-cache">
	     <meta http-equiv="expires" content="0">    
	     <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	     <meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/ht_frame.css"/>
		<link rel="stylesheet" type="text/css" href="css/wxshow.css">
		<link rel="stylesheet" type="text/css" href="../wechat/js/sidebar/css/sidebar.css">
		<script type="text/javascript" src='../wechat/js/jquery-1.8.2.min.js'></script>
	    <script type="text/javascript" src="../wechat/js/sidebar/sidebar.js"></script>
	   <!-- <script type="text/javascript" src="../wechat/js/news-release.js"></script>  -->
	    <script type="text/javascript" src="../wechat/js/jquery.form.js" ></script>
	    <script type="text/javascript" src="../wechat/js/fileload.js" ></script>
	</head>
  <script>
		$(document).ready(function(){
			$("#btn1").click(function(){
				if($("#title").val() == ""){
					alert("请输入标题");
					return false;
				}
				if($("#article").val() == ""){
					alert("请输入具体地址");
					return false;
				}
				
				$.ajax({
					type:'POST',
					url:'<%=path%>'+"/servlet/NewsSave",
					data:"tit="+$("#title").val()+"&aut="+$("#author").val()+"&con="+$("#article").val()+"&cov="+$("#filemsg").val()+"&fbb=ture"+"&typ=2",
					success:function(data){
						if(data){
							alert("提交成功");
							$("#title").val("");
							$("#author").val("");
							$("#article").val("");
						}else{
							$("#title").val("");
							$("#author").val("");
							$("#article").val("");
							alert("提交失败");

						}
					}
				});
			});
	   }); 
	   
	   $(document).ready(function(){
	      $("#btn2").click(function(){
	         $("#title").val("");
	         $("#author").val("");
	         $("#article").val("");
	      });
	  });
  </script>
	<body>
		<div class="con-box">
			<div class="content-block" id="content-block1">
				<h3 class="title">大厅导航</h3>
				<div class="block-editor">
					<div class="inner">
						<div class="ptm-edit-item">
							<label class="ptm-label">标题</label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input js_title" id="title"></div>
						</div>
						<div class="ptm-edit-item">
							<label class="ptm-label">作者<span class="tips">(选填)</span></label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input js_author" id=author></div>
						</div>
						<div class="ptm-edit-item">
							<label class="ptm-label">具体地址</label>
							<div class="ptm-inputbox"><input type="text" class="ptm-input js_article" id="article"></div>
						</div>
						<div class="ptm-edit-item">
							<form id='_fileForm' enctype='multipart/form-data'>
                            <table cellspacing="0" cellpadding="3" style="margin:0 auto; margin-top:5px;">
                            <tr>
                            <td class="tdt tdl">请选择文件：</td>
                            <td class="tdt tdl"><input class="ptm-input js_cover" type="file" name="filepath" id="filepath"/></td>
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
					<div class = "line" align="center">
					  	<input id="btn1" name="submit" type="submit" value="提交" />
					  	<input id="btn2" type="button" value="取消" />
					</div>
					</div>	
				</div>
				<!-- <div class="block-preview">
					<div id="js_article" class="wxshow"></div>
				</div>
				<div style="clear:both;"></div -->

			</div>
		</div>
	</body>
</html>
