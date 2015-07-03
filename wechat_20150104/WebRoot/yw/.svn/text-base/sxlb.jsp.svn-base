<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//单位微信显示序号
String dw = "";
String dwNoStr = request.getParameter("dwNo")==null?"":(String)request.getParameter("dwNo");
int dwNo;
if(dwNoStr.equals("")){
	dwNo = 0;
}else{
	dwNo = Integer.valueOf(dwNoStr);
}
switch(dwNo){
	case 0:break;
	case 1:dw = "工商局" ;break;
	case 2:dw = "安监局" ;break;
	case 3:dw = "城管局" ;break;
	case 4:dw = "住建局" ;break;
	case 5:dw =	"财政局" ;break;
	case 6:dw =	"民政局" ;break;
	case 7:dw =	"公信局" ;break;
	case 8:dw =	"食药监局" ;break;
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><%=dw%>事项列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="事项,列表,单位">
	<meta http-equiv="description" content="事项列表">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1><%=dw%>事项列表</h1> <br>
  </body>
</html>
