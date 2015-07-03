<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>业务详情</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css">
	<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
	
	<script type="text/javascript">
	
	//on("pageinit","#pageone",..)pageinit导致一次触控滑动多次执行
		$(document).ready(function(){
			$("div#pageone").live("swipeleft",function(){   //page1到page2
				window.location.hash="pagetwo";
			});
		});
		$(document).ready(function(){ //page2到page3
			$("div#pagetwo").live("swipeleft",function(){
				window.location.hash="pagethree";
			});
		});
		$(document).ready(function(){ //page2到page1
			$("div#pagetwo").live("swiperight",function(){
				window.location.hash="pageone";
			});
		});
		$(document).ready(function(){ //page3到page2
			$("div#pagethree").live("swiperight",function(){
				window.location.hash="pagetwo";
			});
		});
	
	
	</script>
	
	<style type="text/css">
		#pageone li{
		}
	</style>
  </head>
  
  <body>
	 <div data-role="page" id="pageone">
	    <div data-role="header" data-position="fixed">
	    <h1><span style="font-size:30px">唐山市电子监控系统</span></h1>
	    	<div data-role="navbar">
	    		<ul>
	    			<li><a href="#" class="ui-state-persist" data-icon="grid"><span style="font-size:50px">事&nbsp;项&nbsp;列&nbsp;表</span></a></li>
	    			<li><a href="#pagetwo" data-icon="home" data-transition="slide"><span style="font-size:50px">业&nbsp;务&nbsp;办&nbsp;理</span></a></li>
	    			<li><a href="#pagethree" data-icon="search"><span style="font-size:50px">业&nbsp;务&nbsp;查&nbsp;询</span></a></li>
	    		</ul>
	    	</div>
	    </div>
	    <div data-role="content">
	     	<p>this is page one 事项列表</p>
	    </div>
	    <div data-role="footer" data-position="fixed">
	    	<span style="font-size:30px">footer</span>
	    </div>
	 </div>
	 
	 <div data-role="page" id="pagetwo">
	    <div data-role="header" data-position="fixed">
	    <h1><span style="font-size:30px">唐山市电子监控系统</span></h1>
	    	<div data-role="navbar">
	    		<ul>
	    			<li><a href="#pageone" data-icon="grid" data-transition="slide"><span style="font-size:25px">事项列表</span></a></li>
	    			<li><a href="#" class="ui-state-persist" data-icon="home"><span style="font-size:25px">业务办理</span></a></li>
	    			<li><a href="#pagethree" data-icon="search" data-transition="slide"><span style="font-size:25px">业务查询</span></a></li>
	    		</ul>
	    	</div>
	    </div>
	    <div data-role="content">
	     	this is page two 业务办理
	    </div>
	    <div data-role="footer" data-position="fixed">
	    	<span style="font-size:30px">footer</span>
	    </div>
	 </div>
	 
	 <div data-role="page" id="pagethree">
	    <div data-role="header" data-position="fixed">
	    <h1><span style="font-size:30px">唐山市电子监控系统</span></h1>
	    	<div data-role="navbar">
	    		<ul>
	    			<li><a href="#pageone" data-icon="grid"><span style="font-size:25px">事项列表</span></a></li>
	    			<li><a href="#pagetwo" data-icon="home" data-transition="slide"><span style="font-size:25px">业务办理</span></a></li>
	    			<li><a href="#" class="ui-state-persist" data-icon="search"><span style="font-size:25px">业务查询</span></a></li>
	    		</ul>
	    	</div>
	    </div>
	    <div data-role="content">
	     	this is pagethree 业务查询
	    </div>
	    <div data-role="footer" data-position="fixed">
	    	<span style="font-size:30px">footer</span>
	    </div>
	 </div>
  </body>
</html>
