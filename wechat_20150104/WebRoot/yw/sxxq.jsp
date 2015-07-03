<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import = "com.wechat.service.*" %>   
<%@ page import = "com.wechat.vo.*" %> 
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "org.apache.log4j.*,java.util.*,java.text.*,javax.xml.parsers.*,org.w3c.dom.*,org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import = "org.springframework.beans.factory.BeanFactory" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dwId = request.getParameter("sxbm");
%>
<%! Logger log = Logger.getLogger(this.getClass()); %> 
<%!	
	private String toString(Integer i) {
		// TODO Auto-generated method stub
		return i == null ? "" : i.toString();
	}
	
	private String toString(String str){
		return  str == null ? "" : str.toString() ;
	}
 %>
<% 
ServletContext ctx = getServletConfig().getServletContext(); 
BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx);
SxJbxxService servJb = (SxJbxxService)factory.getBean("SxJbxxService");
SxYjxxService servYj = (SxYjxxService)factory.getBean("SxYjxxService");
SxJbxx sxInfo = servJb.findById(dwId); 
ArrayList<SxYjxx> list = servYj.findBySxbm(dwId);
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
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
			<div class="title">事项详情</div>
			<div class="content">
			<table border = "1px">
				<tr><th>事项名称</th><td><%= toString(sxInfo.getSxmc()) %></td></tr>
				<tr><th>承办单位名称</th><td><%= toString(sxInfo.getCbjgmc()) %></td></tr>
				<tr><th>事项类别</th><td><%= toString(sxInfo.getSxlbmc()) %></td></tr>
				<tr><th>权力类型</th><td><%= toString(sxInfo.getQllxmc()) %></td></tr>
				<tr><th>承诺时限</th><td><%= toString(sxInfo.getCnsx()) %></td></tr>
				<tr><th>事项前置条件</th><td><%= toString(sxInfo.getSxqztj()) %></td></tr>
				</table>
				<table border = "1px">
				<tr><th>联系人姓名</th><td><%= toString(sxInfo.getLxrxm()) %></td></tr>
				<tr><th>手机号码</th><td><%= toString(sxInfo.getLxrsjhm()) %></td></tr>
				<tr><th>传真</th><td><%= toString(sxInfo.getLxrcz()) %></td></tr>
				<tr><th>邮政编码</th><td><%= toString(sxInfo.getLxryzbm()) %></td></tr>
				<tr><th>地址</th><td><%= toString(sxInfo.getLxdz()) %></td></tr>
				<tr><th>电子邮件</th><td><%= toString(sxInfo.getLxrdzyj()) %></td></tr>
				<tr><th>投诉电话</th><td><%= toString(sxInfo.getTsdh()) %></td></tr>
				</table> 
				<table border = "1px">
				<tr> 
					<th width = "52%">要件名称</th>
					<th width = "12%">要件描述</th>
					<th width = "12%">要件类别</th> 
					</tr> 
					<% 
					for(int i = 0; i < list.size(); i++){ 
						SxYjxx tmp = list.get(i); 
					%> 
					<tr> 
					<td>
						<% out.println(toString(tmp.getYjmc())); %>
					</td> 
					<td align = "center"> 
					<% out.println(toString(tmp.getYjms())); %> 
					</td> 
					<td align = "center"> 
					<% out.println(toString(tmp.getYjlx())); %> 
					</td> 
					</tr> 
					<%		 
					} 
					 %> 
				</table>
			</div>
		</div>
	</div>
	<div data-role="footer">
	    <div id="footer"><span>技术支持：北京邮电大学 @2014</span></div>
	</div>  
</div>
</body>
</html>
