<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.wechat.service.*"%>
<%@ page import="com.wechat.vo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page
	import="org.apache.log4j.*,java.util.*,java.text.*,javax.xml.parsers.*,org.w3c.dom.*,org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page import="org.springframework.beans.factory.BeanFactory"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String ggId = request.getParameter("id");
%>
<% 
ServletContext ctx = getServletConfig().getServletContext(); 
BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx);
NewsSaveService nss = (NewsSaveService)factory.getBean("NewsSaveService");
Newssave wxgg = nss.findById(Long.parseLong(ggId));
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>公告详情</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link rel="stylesheet" type="text/css" href="css/ht_frame.css" />
		<link rel="stylesheet" type="text/css" href="css/contentshow.css" />
		<link rel="stylesheet" type="text/css" href="css/table.css" />
	</head>

	<body>
		<div class="con-box">
			<div class="content-block" id="content-block1">
				<h3 class="title">
					公告历史>>公告详情
				</h3>
				<div class="block-inner">
					<div class="line" style="overflow-y: scroll; height: 80%;">
						<table border="1px">
							<tr>
								<td class="td title">
									标题
								</td>
								<td class="td content"><%= wxgg.getTitle()%></td>
							</tr>
							<tr>
								<td class="td title">
									时间
								</td>
								<td class="td content"><%= wxgg.getTime() %></td>
							</tr>
							<tr>
								<td class="td title">
									作者
								</td>
								<td class="td content"><%= wxgg.getAuthor()%></td>
							</tr>
							<tr>
								<td class="td title">
									封面
								</td>
								<td class="td content">
									<img alt="" src="<%= wxgg.getCover() %>">
								</td>
							</tr>
							<tr>
								<td class="td title">
									内容
								</td>
								<td class="td content"><%= wxgg.getContent() %></td>
							</tr>
						</table>
					</div>
					<div class="ine">
						<input type="button" value="返回"
							style="float: right; position: relative; left: 0%;"
							onclick="window.history.back();" />
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
