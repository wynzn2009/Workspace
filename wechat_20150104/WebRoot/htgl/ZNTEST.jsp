<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.wechat.vo.*"%>
<%@page import="com.wechat.service.*"%>
<%@page import="org.apache.log4j.*, 
    java.net.*, 
    java.util.*, 
    org.springframework.beans.factory.BeanFactory, 
    org.springframework.web.context.support.WebApplicationContextUtils" 
    %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 ServletContext ctx = getServletConfig().getServletContext();
  BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx);
BjService service = null;
BjJbxx vo = new BjJbxx();
String a = "1";
vo.setBbbz(a);
vo.setSjhm(a);
vo.setYxtsbz(a);
try {
	service = (BjService) factory.getBean("BjService");
  } catch (Exception e) {
  }
  
List list = service.findLcclxxbyBjlsh("W13020000201412050020");
int aa = list.size();

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ZNTEST.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <br>
  </body>
</html>
