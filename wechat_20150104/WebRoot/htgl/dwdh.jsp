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
    
    <title>单位电话</title>
    
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
			var tel = $("#duty option:selected").val();
			$("#tel").val(tel=="null"?"暂未录入":tel);
			$("#hidden").val($("#duty option:selected").text());
			
			$("#newtel").focus(function(){
				$("#warning").text("");
			});
			
			$("#duty").change(function(){
				var tel = $(this).find("option:selected").val();
				$("#tel").val(tel=="null"?"暂未录入":tel);
				$("#hidden").val($(this).find("option:selected").text());
			});
			
			$("#btn1").click(function(){
				if($("#newtel").val() == ""){
					$("#warning").text("请输入要添加的内容！");
					return false;
				}
				$.ajax({
					type:'GET',
					url:'<%=path%>'+"/servlet/Dw",
					data:"newtel="+$("#newtel").val()+"&hidden="+$("#hidden").val(),
					success:function(data){
						if(data=="ok"){
							$("#tel").val($("#newtel").val());
							$("#duty option:selected").val($("#newtel").val());
							$("#newtel").val("");
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
			<h3 class="title">单位电话</h3>
			<div class="block-inner">
				<div class="form-content">
					<div class="line">
					<label for="duty">请选择单位名称：</label>
						<select id="duty" >
						<%for(int i = 0; i < ll.size(); i++){Dw temp = ll.get(i);%>
						<option value=
						<%=temp.getDwtelphone()%>><%=temp.getDwfullname()%>
						</option>
						<%}%>
						</select>    
					</div>
					<input type="hidden" name="hidden" id="hidden"/>
					<div class = "line"><label for="tel">现电话：</label><input id="tel" name="tel" disabled></div>
					<div class = "line"><label for="newtel">新电话：</label><input id="newtel" name="newtel"></div>
					<div class = "line">
					  	<input id="btn1" name="submit" type="submit" value="提交" />
					  	<input id="btn2" type="button" value="取消" onclick="document.getElementById('newtel').value='';"/>
					</div>
					<div class = "line">
						<span id = "warning" style="text-align:center;display:block;"></span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
