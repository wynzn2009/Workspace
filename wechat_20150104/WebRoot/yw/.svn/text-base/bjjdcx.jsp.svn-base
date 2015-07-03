<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.io.*" %>
<%@page import="java.io.IOException.*"%>
<%@page import="java.net.URLEncoder"%> 
<%@page import="org.apache.log4j.*,java.util.*,java.text.*,javax.xml.parsers.*,org.w3c.dom.*,org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="org.hibernate.criterion.DetachedCriteria"%>
<%@page import="org.hibernate.criterion.*"%>
<%@page import="com.wechat.vo.*" %>
<%@page import="com.wechat.dao.*"%>
<%! Logger log = Logger.getLogger(this.getClass()); %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" charset="UTF-8">
<head>
<title>办件进度查询</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache,must-revalidate">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="办件进度,高级查询,多条件查询">
<meta http-equiv="description" content="多个条件筛选办件">
<link rel="stylesheet" type="text/css" href="../css/bjjdcx.css"/>
<script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="../js/bjjdcx.js"></script>
</head>

<body>
<h1>办件进度查询</h1>
<div id="container">
	<div id="content">
		<form  class="form-wedget">
			<div class="form-group">
				<div class="group-input">
					<img src="../images/jian.png" class="img-class"/>
					<div class="input-class"><input type="text" id="cxbjlsh" name="cxbjlsh" placeholder="办件流水号"/></div>
				</div>
				<label class="group-label">
					<font style="color:red;">*</font>
				</label>
			</div>    
			<div>可填写办件流水号的不完整形式，例如办件13020000201309090007，可填写20130909进行查询</div>
			<!-- <div class="form-group">
				<div class="group-input">
					<img src="../images/shi.png" class="img-class"/>
					<div class="input-class"><input type="text" id="cxsxmc" placeholder="办件日期"/></div>
				</div>
				<label class="group-label"></label>
			</div>
			<div>日期格式：如2014年1月1日为20140101</div> -->
			<div class="form-group">
				<div class="group-input">
					<img src="../images/ming.png" class="img-class"/>
					<div class="input-class"><input type="text" id="cxsqz" name="cxsqz" placeholder="单位名称/个人姓名(必填项)"/></div>
				</div>
				<label class="group-label">
					<font style="color:red;">*</font>
				</label>
			</div>
			<div class="form-group">
				<div class="group-input">
					<img src="../images/lian.png" class="img-class"/>
					<div class="input-class"><input type="text" id="cxphone" name="cxphone" placeholder="联系方式(必填项)"/></div>
				</div>
				<label class="group-label">
					<font style="color:red;">*</font>
				</label>
			</div>
			<div class="form-submit">
				<input id="searchBtn" type="button" value="开始查询" onclick = "search(cxbjlsh.value,cxsqz.value,cxphone.value);"/>
			</div>
			<div class="form-error"></div>
		</form>
		<div id="showresult">
	    </div>
	    <div>注意：请正确填写发起办件时填写的相关信息</div>
	    <div id = "ajax" style="display:none;"> </div>
		
</div>
</div>

</body>
</html>