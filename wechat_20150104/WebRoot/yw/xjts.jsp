<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<%@ page import="com.wechat.vo.Tsxx" %>
<%@ page import="com.wechat.dao.TsxxDAO" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String str = (String)request.getAttribute("warm");
String cxmm = (String)request.getAttribute("cxmm");
String flag = (String)session.getAttribute("flag");


%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新建投诉</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.3"/>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	body{
		margin:0;
	}
	#header{
		font-size: 24px;
		font-weight: normal;
		text-align: center;
		background-color: #f0f0f0;
		color: rgb(51,51,51);
		margin: 0 0 3px 0;
		padding: 5px 0 1px 0;
		border-bottom: 2px solid #68b800;
	}
	#container{
		margin:10px;
		border:1px solid #68b800;
		min-height:600px;
	}
	.title{
		margin:0px;
		display:block;
		padding:10px;
		background-color:#f0f0f0;
	}
	.warn{
		color:#FF0000;
	}
	.form{
		text-align:center;
	}
	.input{
		margin:10px;
		width:180px;
		height:30px;
		border:1px solid #68b800;
		text-align:center;
	}
	#warn{
		margin-bottom:10px;
		text-align:center;
		color:#ff0000;
		font-size:small;
	}
	#btn1{
		margin-right:20px;
		width: 40%;
		height: 30px;
		font-size: 16px;
		background-color: #62af01;
		border: #559801;
		color: #fff;
		border-radius: 5px;
	}
	#btn2{
		margin-left:20px;
		width: 40%;
		height: 30px;
		font-size: 16px;
		background-color: #62af01;
		border: #559801;
		color: #fff;
		border-radius: 5px;
	}
	#btn_group{
		text-align:center;
		margin-bottom:20px;
	}
	#bottom{
		text-align:center;
	}
	#atten{
		margin-top:10px;
		border:1px solid #ffffff;
		width:80%;
		height:40%;
		color:#ff0000;
		text-align:center;
		font-size:16px;
	}
	</style>
	<script>
	window.onload = visited();
	/*表单提交之前验证是否为空 */
	function validate(){
		if(document.form.yzm.value==""){
			alert("验证码不可以为空！！！");
			return false;
		}
		if(document.form.bdw.value==""){
			alert("被投诉人单位不可以为空！！！ ");
			return false;
		}
		if(document.form.bxm.value==""){
			alert("被投诉人姓名不可以为空！！！");
			return false;
		}
		if(document.form.bjb.value==""){
			alert("被投诉人级别不可以为空！！！");
			return false;
		}
		if(document.form.bdq.value==""){
			alert("被投诉人地区不可以为空！！！");
			return false;
		}
		if(document.form.wtlb.value==""){
			alert("问题类别不可以为空！！！");
			return false;
		}
		if(document.form.zywt.value==""){
			alert("主要问题不可以为空！！！");
			return false;
		}
		
		return true;
	}
	
	
	
	</script>
  </head>
  
  <body>
  <form id="form"name="form" method="get" action="<%=path %>/servlet/Xjts" onsubmit="return validate()">
    <div id="header">在线投诉</div>
    <% if(str!=null){
    	out.println("<div id='bottom' name='bottom'><textarea id='atten' readOnly>请务必记住您的投诉办件流水号："+str
    	+"和查询密码："+cxmm+"您可以在12小时以后根据流水号和查询密码在投诉反馈查询投诉状态！</textarea></div>");
    }%>
    <div id="container">
    	<div id="jbrxx"><p class="title">举报人信息</p>
    	<div class="form" id="">
    			查询人姓名：<input type="text" class="input" id="tsrxm" name="tsrxm"/>
    		</div>
    		<div id="warn">（非必填项）</div>
    		
    		<div class="form" id="">
    			查询密码：<input type="text" class="input" id="yzm" name="yzm"/>
    		</div>
    		<div id="warn">查询密码用于提交投诉办件后对办件反馈进行查询</div>
    		
    	</div>
    	<div id="bjbrxx"><p class="title">被举报人信息</p>
    		<div class="form" id="">
    			单位：<input type="text" class="input" id="bdw" name="bdw" />
    		</div>
    		
    		<div class="form" id="">
    			姓名：<input type="text" class="input" id="bxm" name="bxm"/>
    		</div>
    		<div class="form" id="">
    			级别：<input type="text" class="input" id="bjb" name="bjb"/>
    		</div>
    		<div class="form" id="">
    			地区：<input type="text" class="input" id="bdq" name="bdq"/>
    		</div>
    	</div>
    	<div id="jbnr"><p class="title">举报内容</p>
    		<div class="form" id="">
    			问题类别：<input type="text" class="input" id="wtlb" name="wtlb"/>
    		</div>
    		<div class="form" id="">
    			主要问题：<input type="text" class="input" id="zywt" name="zywt"/>
    		</div>
    	</div>
    	<div id="btn_group"><input id="btn1" name="submit" type="submit" value="提交" /><input id="btn2" type="button" value="取消" onclick=""/></div>
    	
    </div>
    </form>
  </body>
</html>
