<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.wechat.dao.DwDAO" %>
<%@ page import="com.wechat.vo.Dw" %>
<%@ page import="javax.servlet.ServletContext" %>
<%@page import="org.springframework.beans.factory.BeanFactory"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="com.wechat.service.DwService"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

ServletContext ctx = getServletConfig().getServletContext();
BeanFactory factory = (BeanFactory)WebApplicationContextUtils.getWebApplicationContext(ctx);
DwService ds  = (DwService)factory.getBean("DwService");
String beloingto = "13020000";
ArrayList<Dw> ll = ds.findByBeloingto(beloingto);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>单位简介</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/ht_frame.css"/>
	<link rel="stylesheet" type="text/css" href="css/contentshow.css"/>
	<script type="text/javascript" src='js/jquery-1.8.2.min.js'></script>
	<script>
		$(document).ready(function(){
			var intro = $("#duty option:selected").val();
			$("#intro").val(intro=="null"?"暂未录入":intro);
			$("#hidden").val($("#duty option:selected").text());
			
			$("#newintro").focus(function(){
				$("#warning").text("");
			});
			
			$("#duty").change(function(){
				var intro = $(this).find("option:selected").val();
				$("#intro").val(intro=="null"?"暂未录入":intro);
				$("#hidden").val($(this).find("option:selected").text());
			});
			
			$("#btn1").click(function(){
				if($("#newintro").val() == ""){
					$("#warning").text("请输入要添加的内容！");
					return false;
				}
				$.ajax({
					type:'POST',
					url:'<%=path%>'+"/servlet/Dw",
					data:"newintro="+$("#newintro").val()+"&hidden="+$("#hidden").val(),
					success:function(data){
						if(data=="ok"){
							$("#intro").val($("#newintro").val());
							$("#duty option:selected").val($("#newintro").val());
							$("#newintro").val("");
							$("#warning").text("修改成功");
						}else{
							$("#newtel").val("");
							$("#warning").text("修改失败");
						};
					}
				});
			});
		});
	</script>

  </head>
  
  <body>
	  <div class="con-box">
		<div class="content-block" id="content-block1">
			<h3 class="title">单位简介</h3>
			<div class="block-inner">
   				<div class="form-content">
				 	<div class="line">
				 		<label for="duty">请选择单位名称：</label>
					 	<select id="duty" onchange="gwchange()">
					 		<%for(int i = 0; i < ll.size(); i++){
					    		Dw temp = ll.get(i);%>
					    		<option value=<%=temp.getDwjj()%>><%=temp.getDwfullname()%></option>
					    	<%	} %>
					    </select>    
				    </div>
				    <div class="line">
				    <input type="hidden" name="hidden" id="hidden"/>
				 	</div>
				 	<div class="line">
				    	<label for="intro" style="float:left;">现单位简介：</label>
				    	<textarea id="intro" name="intro" rows="10" cols="40" disabled></textarea>
				    </div>
				    <div class="line">
				    	<label for="newintro" style="float:left;">新单位简介：</label>
				    	<textarea id="newintro" name="newintro" rows="10" cols="40"></textarea>
				    </div>
				    <div class="line">
				    	<input id="btn1" name="submit" type="submit" value="提交" />
				    	<input id="btn2" type="button" value="取消" onclick="document.getElementById('newintro').value='';"/>
				    </div>
				    <div class = "line" style="text-align:center">
						<span id = "warning"></span>
					</div>
			    </div>
			</div>
		</div>
	</div>
  </body>
</html>
