<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.wechat.service.NewsSaveService" %>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.wechat.vo.Newssave"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

ServletContext ctx = getServletConfig().getServletContext();
BeanFactory factory = (BeanFactory)WebApplicationContextUtils.getWebApplicationContext(ctx);
NewsSaveService ns = (NewsSaveService)factory.getBean("NewsSaveService");
List nl = ns.findByFbbzType(true,0);
Newssave n = nl.size()==0? new Newssave() : (Newssave)nl.get(0);
String title = n.getTitle() == null? "" : n.getTitle();
String author = n.getAuthor() == null? "" : n.getAuthor();
String content = n.getContent() == null? "" : n.getContent();
//List<Newssave> ll = nService.findByFbbzType(false,1);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>新闻中心</title>
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
  </head>
  
  <body>
  	<div data-role="page" id="page">
		<div data-role="header" id="header">
			<h1><span>唐山市政务服务中心</span></h1>
		</div>
		<div data-role="content">
			<div id="content">
				<div class="title">
					<span>唐山市政府新闻中心</span>
				</div>
				<div class="content">
					<h2><%=title%></h2>
					<p class="subtitle"><%=author %></p>
					<div style="width:50%;position:relative;left:25%;"><p><img src="images/leader.jpg" width="100%"></p></div>
					<div class="mainbody">
						<p class="mainbody"><%=content %></p>
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
