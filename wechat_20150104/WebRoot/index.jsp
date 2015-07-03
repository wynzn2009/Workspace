<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.security.*" %>
<%@ page import="Test.TestData" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.or/TR/html4/losse.dtd">

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<style>
	.login_left{
		width: 61%;
		float: left;
	}
	
	.login_right{
		width: 31%;
		float: left;
	}
	
	.login_box{
		background-color: white;
		width: 100%;
		border-radius: 10px;
		margin: 2%;
	}
	
	.login_title{
		padding-bottom: 10px;
		text-align: center;
		color: #ECF5FF;
	}
	
	.login_body{
		padding: 15px;
	}
	
	.login_name{
		margin: 15px auto;
		background: url("images/login_name.jpg") no-repeat;
		width: 320px;
		height: 60px;
	}
	
	.login_password{
		margin: 15px auto;
		background: url("images/login_pw.jpg") no-repeat;
		width: 320px;
		height: 60px;
	}
	
	.login_button{
		margin: 15px auto;
		width: 320px;
		height: 57px;
	}
	
	.login_span{
		height: 15px;
		clear: both;
	}
	
	.footer{
		color: #ECF5FF;
		text-align: center;
		font-size: 16px;
		height: 30px;
	}
	
	body{
		background: url("images/backgroundimg.jpg") no-repeat;
		overflow-x: hidden;
		margin: 0 auto;
	}
	
	input[type='text'],input[type='password']{
		border: none;
		padding: 0 auto;
		margin: 10px 5px 5px 60px;
		width: 250px;
		height: 40px;
		font-size: 16px;
		clear: both;	
	}
	
	input[type='submit']{
		border: none;
		background-color: #0066CC;
		cursor: pointer;
		width: 320px;
		height: 50px;
		color: white;
		font-size: 25px;
		border-radius: 5px;
	}
	
	.warning{
		color: red;
		font-size: 12px;
		text-align: center;
	}
	
	.placeholder{
		color: grey;
	}
	</style>
	<script type="text/javascript" src='js/jquery-1.8.2.min.js'></script>
	<script>
		$(document).ready(function(){	
			if( !('placeholder' in document.createElement('input')) ){ 
				 $('input[placeholder]').each(function(){    
				      var that = $(this),    
				      text= that.attr('placeholder');    
				      if(that.val()===""){
				       that.val(text).addClass('placeholder');    
				      } 
			       
				     that.focus(function(){
				      	  var that = $(this); 
					      text= that.attr('placeholder');
				      	  if(that.val()===text){    
				              that.val("").removeClass('placeholder');    
				          }
				          if(that.attr("defaultValue")==text){
				          	  that.prev().css("display","block");
				          	  that.remove();
				          }
				      }); 
				      
	  				 that.blur(function(){
	  				 	var that = $(this),    
					      text= that.attr('placeholder');
				        if(that.val()===""){    
				          that.val(text).addClass('placeholder');    
				        }    
				      }); 
				        
				      $("#btn").click(function(){
				      		if($("#user").val()===$("#user").attr("placeholder")){
				      			$("#warning").text("用户名不能为空").addClass("warning");
				      			return false;
				      		}
				      		if($("#psw").val()===$("#psw").attr("placeholder")){
				      			$("#warning").text("密码不能为空").addClass("warning");
				      			return false;
				      		}	
				      		return true;
				      });
			      }); 
			  }
			var par = <%= request.getParameter("redirectflag")%>;
			if(par != null){
				if(par == 1){
					alert("用户未登录，请先登录");
				}else{
					alert("用户名密码错误！请重新输入！");
				}
			}
		
			$("#user,#psw").focus(function(){
				$("#warning").removeClass("warning").addClass("warning").html("");
			});

			$("#user").blur(function(){
				if($("#user").val() == ""){
					$("#warning").append("用户名不能为空");
				}
			});
			
			$("#psw").blur(function(){
				if($("#psw").val() == ""){
					$("#warning").append("密码不能为空");
				}
			});
			
			
		});
	</script>
  </head>
  
  <body>
	<div style="height:100px"></div>
	<div class="content">
		<div class = "login_left">
		  	<div class = "login_title">
		  		<br/>
		  		<span style="font-size:35px">唐山市政府服务中心</span>
		  		<br/>
		  		<hr style="border:1px hard grey; margin:20px;"/>
		  		<br/>
			  	<span style="font-size:25px">微信后台管理平台</span>
			  	<br/>
			  	<img src="images/wechat.png" width="30%"></img>
			</div>
		</div>
		<div class="login_right">
		  	<div class="login_box">
		  		<div class="login_body">
				    <form name="form" method="post" action="servlet/loginServlet" > 
				    	<div class="login_name"><input type="text" id="user" name="user" placeholder="请输入用户名"></div>
				    	<div class="login_password"><input type="password" id="psw" name="psw" placeholder="请输入密码"></div>
				    	<div class="login_span" id="warning"></div>
				    	<div class="login_button"><input type="submit" value="提   交" name="tj" id="btn"/></div>
				    	<br/>
				    	<div class="warning"></div>
				    </form>
			    </div>
		    </div>
	    </div>
    </div>
    <div class="login_span"></div>
    <div class="footer" align="center">技术支持：北京邮电大学 @2014</div>
  </body>
</html>
