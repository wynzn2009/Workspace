<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String userId = (String)session.getAttribute("userId");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改个人信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/ht_frame.css"/>
	<link rel="stylesheet" type="text/css" href="css/contentshow.css"/>
	<script type="text/javascript" src='js/jquery-1.8.2.min.js'></script>
	
<script type="text/javascript">
	function check(){
		var newPsw1 = document.getElementById("new_psw").value;
		var newPsw2 = document.getElementById("new_psw2").value;
		if(newPsw1 != newPsw2){
			alert("两次输入的新密码不一致，请重新输入！");
			return false;
			}else{
			return true;}
	}
</script>
	
  </head>
  
  <body> 
  	<div class="con-box">
		<div class="content-block" id="content-block1">
			<h3 class="title">个人信息</h3>
			<div class="block-inner">
			    <form name="form" method="post" action="servlet/userInfo" onsubmit="return check()">
			    	<div class="form-content">
						<div class="line">
							<label for="user_id">用户账号：</label><input  name="user_id" readOnly="true" value="<%=userId %>">
						</div>
						<div class="line">
							<label for="old_psw">请输入旧密码：</label><input type="password" name="old_psw"/>
						</div>
						<div class="line">
							<label for="new_psw">请输入新密码：</label><input type="password" name="new_psw" id="new_psw"/>
						</div>
						<div class="line">
							<label for="new_psw2">请再次输入新密码：</label><input type="password" name="new_psw2" id="new_psw2"/>
						</div>
						<div class="line">
							<input id="btn1" name="submit" type="submit" value="提交" />
				    		<input id="btn2" type="button" value="取消" onclick="document.getElementById('new_psw').value='';"/>
						</div>
					</div> 
			    </form>
			</div>
		</div>
	</div>
  </body>
</html>
