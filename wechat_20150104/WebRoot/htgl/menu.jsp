<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="menu.MenuManager" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		
	<script language="JavaScript">
		function submitMenu(){
			document.getElementById("tip").value="loading...";
		}
	</script>

  </head>
  
  <body>
    This is my JSP page. <br>
  <form action="<%=path%>/servlet/Validwx" method="post">
   <button onclick="submitMenu()">提交菜单</button>
   <input type="text" id="tip">
   </form>
  </body>
</html>
