<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
request.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String dwname = request.getParameter("name");
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>${param.dwname }事项列表</title>
    
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
	<script type="text/javascript" src="<%=path %>/js/jquery-1.8.2.min.js"></script>
	
	<script>
		$(document).ready(function(){
			$("a.pageTurn:eq(${pageIndex})").css("color","red");
			var pageNum = ${pageNum};
			var pageIndex = ${pageIndex};
			var pageView = 1;
			if(pageIndex == 1){
				$("#previous").prop("href","#");
			}else if(pageIndex == pageNum){
				$("#next").prop("href","#");
			};
			$("a[href='#']").css("color","grey");
			/*if(pageNum > 2+2*pageView+3){
				if(!((pageIndex+1)<(pageNum-pageView) && (pageIndex-1)>(pageView+1))){
					pageIndex = parseInt(pageNum/2);
				}
				var str1 = "a.pageTurn:lt("+(pageIndex-1)+"):gt("+(pageView+1)+")";
				$(str1).hide();
				str1 = "a.pageTurn:lt("+(pageNum-1)+"):gt("+(pageIndex+1)+")";
				$(str1).hide();
				$("a.pageTurn:hidden:first").before("<span>...</span>");
				$("a.pageTurn:hidden:last").after("<span>...</span>");
			};*/
			if(pageIndex == 1) $("a.pageTurn:first").prop("href","#").attr("disabled","true");
			else if(pageIndex == pageNum) $("a.pageTurn:last").prop("href","#");
			if(pageNum > 1+2*pageView ){
				if(pageIndex > pageNum-pageView) $("a.pageTurn:lt("+(pageNum-2*pageView)+"):gt(1)").hide();
				else if(pageIndex > pageNum-2*pageView) $("a.pageTurn:lt("+(pageIndex-pageView)+"):gt(1)").hide();
				else if(pageIndex > 2*pageView) $("a.pageTurn:lt("+pageNum+"):gt("+(pageIndex+pageView)+"),a.pageTurn:lt("+(pageIndex-pageView)+"):gt(1)").hide();
		        else if(pageIndex > pageView+1) $("a.pageTurn:lt("+pageNum+"):gt("+(pageIndex+pageView)+")").hide();
		        else $("a.pageTurn:lt("+pageNum+"):gt("+(1+2*pageView)+")").hide();
		    	$("a.pageTurn:hidden:first,a.pageTurn:hidden:last").before("<span class='pageturn'>...</span>");
			};
			
			$("#goButton").click(function(){
				var goPage = 0;
				try{
					goPage = parseInt($("#goBox").val());
				}catch(e){
					return false;
				};
				if(goPage > ${pageNum} || goPage == 0 ){return false;}
				else{
					window.location.href="servlet/sxSearch?${param.dwname==null?param.dwname:'&dwname='}${param.dwname }&pageIndex="+goPage+"&perPage=${perPage}";
				}
			});
		});
	</script>
  </head>
  
  <body>
  	<div data-role="page" id="page">
		<div data-role="header" id="header">
			<h1><span>唐山市政务服务中心</span></h1>
		</div>
		<div data-role="content">
			<div id="content">
				<div class="title">
					<span>
						${param.dwname==null?'所有局':param.dwname }事项列表
					</span>
				</div>
				<div class="content">
					<div class="holder">
						<a id="previous" class="pageTurn" href="servlet/sxSearch?${param.dwname==null?param.dwname:'&dwname='}${param.dwname }&pageIndex=${pageIndex-1}&perPage=${perPage}" data-ajax="false">前一页</a>
						<c:forEach var="i" begin="1" end="${pageNum}" step="1">
							<a class="pageTurn" href="servlet/sxSearch?${param.dwname==null?param.dwname:'&dwname='}${param.dwname }&pageIndex=${i}&perPage=${perPage}" data-ajax="false">${i}</a>
						</c:forEach>
						<a id="next" class="pageTurn" href="servlet/sxSearch?${param.dwname==null?param.dwname:'&dwname='}${param.dwname }&pageIndex=${pageIndex+1}&perPage=${perPage}" data-ajax="false">后一页</a>
						<input type="text" id="goBox" style="width:30px;display:inline-block;" data-role='none' >
						<input type="button" id="goButton" value="跳转" style="width:40px;display:inline-block;" data-role='none' >
					</div>
					<table border = "1px"> 
						<thead>
							<tr> 
								<th width = "52%">事项名称</th><th width = "12%">承办单位</th><th width = "12%">事项类别</th> <th width = "12%">权力类型</th><th width = "12%">承诺时限</th> 
							</tr> 
						</thead>
						<tbody id="itemContainer">
						 <c:forEach items="${list}" var="item">
							<tr>
								<td><a href = 'yw/sxxq.jsp?sxbm=${item.sxbm}' rel="external">${item.sxmc}</a></td>
								<td align = "center">${item.cbjgmc}</td>
								<td align = "center">${item.sxlbmc}</td>
								<td align = "center">${item.qllxmc}</td>
								<td align = "center">${item.cnsx}</td>
							</tr>
						</c:forEach>
						</tbody>
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
