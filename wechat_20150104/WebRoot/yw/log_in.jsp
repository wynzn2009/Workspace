<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String usernameString = "请输入用户";
String passwordString = "请输入密码";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>登录</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%= path %>/css/log_in.css"/>
  </head>
  
  <body>
  	<div class = "container">
  		<h1>登录账户</h1>
  		<div class = "input">
	  		<form method = "post">	
	  			<div style = "height: 10%; width: 100%;"></div>	
	  			<table>
	  			<tr>
		  			<td class = "table img">
		  				<img src="./images/username.png"></img>
		  			</td>
		  			<td class = "table input">
		  				<input type = "text" name = "username" id = "username" placeholder = "<%= usernameString %>" >
		  			</td>
	  			</tr>
	  			<tr height =  "10px;">
	  				<td colspan = "2"></td>
	  			</tr>
	  			<tr>
		  			<td class = "table img">
		  				<img src="./images/password.png"></img>
		  			</td>
		  			<td class = "table input">
		  				<input type = "password" name = "password" id = "password" placeholder = "<%= passwordString %>" >
		  			</td>
	  			</tr>
			    </table>
			    <div style = "height: 4%; width: 100%"></div>	
			    <input type = "submit" name = "login" id ="login" value = "登录" size = "10" >
		    </form>
	    </div>
	    <footer>
	     	@2014 BUPT
	    </footer>
    </div>
  </body>
</html>
