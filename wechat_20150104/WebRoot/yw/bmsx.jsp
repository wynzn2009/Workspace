<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.wechat.vo.Dw"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="com.ApplicationContextUtils"%>
<%@page import="com.wechat.service.DwService"%>
<%@page import="com.wechat.vo.Dw"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String appendPath = "servlet/sxSearch?pageIndex=1&perPage=10";

ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
DwService dwService = (DwService)ctx.getBean("DwService");
List<Dw> dwList = dwService.findByBeloingto("13020000");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>部门事项</title>
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
			<h1><span>&nbsp;唐山市政务服务中心</span></h1>
		</div>
		<div data-role="content">
			<div id="content">
				<div class="title">
					<span>部门事项</span>
				</div>
				<div class="content">
				<%Dw temp0 = dwList.get(0);
				  Dw temp1 = dwList.get(1);
				  String dwName0 = temp0.getDwfullname();
				  String dwName1 = temp1.getDwfullname();%>
					<ul>
						<li><a href=<%= appendPath %> rel="external">全部类别</a></li>
						<li><a href=<%= appendPath + "&dwname=" + dwName0%> rel="external"><%=dwName0 %></a></li>
						<li><a href=<%= appendPath + "&dwname=" + dwName1%> rel="external"><%=dwName1 %></a></li>
					</ul>
				<%for (int i = 2; i < dwList.size(); i = i +3){%>
					<ul>
						<li><a href=<%= appendPath + "&dwname=" + dwList.get(i).getDwfullname()%> rel="external"><%=dwList.get(i).getDwfullname()%></a></li>
						<li><a href=<%= appendPath + "&dwname=" + dwList.get(i+1).getDwfullname()%> rel="external"><%=dwList.get(i+1).getDwfullname()%></a></li>
						<li><a href=<%= appendPath + "&dwname=" + dwList.get(i+2).getDwfullname()%> rel="external"><%=dwList.get(i+2).getDwfullname()%></a></li>
					</ul>
				<%} %>		
				</div>
			</div>
		</div>
		<div data-role="footer">
			<div id="footer"><span>技术支持：北京邮电大学 @2014</span></div>
		</div>
	</div>
</body>
</html>
