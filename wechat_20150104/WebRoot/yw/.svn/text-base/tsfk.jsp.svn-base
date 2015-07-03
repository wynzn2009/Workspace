<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String serialNumString = "请输入办件流水号";
String idNumString = "请输入验证码";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>投诉反馈</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
	<link rel="stylesheet" href="css/publicContentshow.css"/>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
	<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
	<script type="text/javascript" src="js/tsfk.js"></script>
  </head>
  
  <body>
  <div data-role="page" id="page">
		<div data-role="header" id="header">
			<h1><span>唐山市政务服务中心</span></h1>
		</div>
		<div data-role="content">
			<div id="content">
				<div class="title">
					<span>投诉反馈</span>
				</div>
				<div class="content">
			  		<div class = "mainbody">
			  			<h2>投诉反馈查询</h2>
				 		<input type = "text" name = "serialNum" id = "serialNum" placeholder = "<%= serialNumString %>" required>
				 		<input type = "text" name = "idNum" id = "idNum" placeholder = "<%= idNumString %>" required>
			    		<input type = "button" name = "submit" id ="submit" value = "提交查询" size = "10" onclick = "showFkym(serialNum.value,idNum.value);">
				    </div>
				    <div id = "ajax" style="display:none;">
				    </div>
				</div>
			</div>
		</div>
		<div data-role="footer" id="footer">
			<div id="footer"><span>技术支持：北京邮电大学 @2014</span></div>
		</div>
	</div>	
  </body>
</html>
