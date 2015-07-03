<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.ServletContext" %>
<%@ page import="com.wechat.vo.Dw" %>
<%@ page import="com.wechat.dao.DwDAO" %>
<%@ page import="com.wechat.service.DwService" %>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

ServletContext ctx = getServletConfig().getServletContext();
BeanFactory factory = (BeanFactory)WebApplicationContextUtils.getWebApplicationContext(ctx);
DwService ds = (DwService)factory.getBean("DwService");
String beloingto = "13020000";
ArrayList<Dw> ll = ds.findByBeloingto(beloingto);

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>联系电话</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
	<link rel="stylesheet" type="text/css" href="css/publicContentshow.css"/>
	<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-1.8.2.min.js"></script>
  </head>
  
  <body>
	<div data-role="page" id="page">
		<div data-role="header" id="header">
			<h1><span>唐山市政务服务中心</span></h1>
		</div>
		<div data-role="content">
			<div id="content">
				<div class="title">
					<span>
						联系电话
					</span>
				</div>

	    		<ul>
	    			<%
	    			for(int i=0;i<ll.size();i++){
	    			Dw temp = ll.get(i);
	    			String tel = temp.getDwtelphone()==null?"暂未录入":temp.getDwtelphone();
	    			 %>	
	    			<li style="width:96%"><%=temp.getDwfullname()%><br>  TEL:<span style="color:blue;"><%=tel%></span></li>
	    			<%} %>
	    			
	    		</ul>
		    </div>
		</div>
		<div data-role="footer">
			<div id="footer"><span>技术支持：北京邮电大学 @2014</span></div>
		</div>
    </div>
  </body>
</html>
