<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import = "com.wechat.service.*" %>   
<%@ page import = "com.wechat.vo.*" %> 
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "org.springframework.beans.factory.BeanFactory" %>
<%@ page import = "org.apache.log4j.*,java.util.*,java.text.*,javax.xml.parsers.*,org.w3c.dom.*,org.springframework.web.context.support.WebApplicationContextUtils" %>
<%
request.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%! Logger log = Logger.getLogger(this.getClass()); %> 
<% 
ServletContext ctx = getServletConfig().getServletContext(); 
BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getWebApplicationContext(ctx);
NewsSaveService nss = (NewsSaveService)factory.getBean("NewsSaveService");
List<Newssave> nslist = nss.findByFbbzType(false,0);
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新闻历史</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
	<link rel="stylesheet" type="text/css" href="css/ht_frame.css"/>
	<link rel="stylesheet" type="text/css" href="css/table.css"/>
	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/jPages.min.js"></script></head>
    <script>
    	$(document).ready(function(){
    		$("div.holder").jPages({  
				containerID : "itemContainer",  
				previous : "上一页",  
				next : "下一页",  
				perPage : 20,  
				delay : 100  
			});  
    	});
    </script>
  </head>
  
  <body>
	<div id="content">
		<div class="con-box">
			<div class="content-block" id="content-block1">
				<h3 class="title">新闻历史</h3>
				<div class="block-inner">
					<div class="holder"></div>
					<table border = "1px"> 
					<thead>
						<tr> 
						<th width = "52%">标题</th>
						<th width = "26%">发布时间</th>
						<th width = "22%">作者</th> 
						</tr> 
					</thead>
					<tbody id="itemContainer">
						<% 
						for(int i = 0; i <nslist.size() ; i++){ 
							if(i<10){
							Newssave tmp = nslist.get(i); 
							%> 
							<tr> 
							<td class = "td content">
								<a href = <%="htgl/xwxq.jsp?id=" + tmp.getId() %> rel="external">
									<% out.println(tmp.getTitle()); %>
								</a>
							</td> 
							<td align = "center" class = "td content"> 
							<% 
			                String time = String.valueOf(tmp.getTime());
							String[] timearr = time.split(" ");
							out.println(timearr[0]); 
							%> 
							</td> 
							<td align = "center" class = "td content"> 
							<% out.println(tmp.getAuthor()); %> 
							</td> 
							</tr> 
							<%		 
							}	
						} 
						%> 
					</tbody>
					 </table>
				 </div>
			</div>
		</div>
	</div>
  </body>
</html>
