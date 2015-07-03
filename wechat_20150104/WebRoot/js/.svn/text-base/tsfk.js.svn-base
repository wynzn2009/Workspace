
document.write("<script type='text/javascript' src='js/json2.js'></script>");

function showFkym(serialNum, idNum){	
		var xmlhttp;
		if(serialNum == "" || idNum == ""){
			document.getElementById("ajax").innerHTML = "";
		}
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
		}
		else{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		
		xmlhttp.open("GET", "servlet/tsfkSearch?serialNum=" + serialNum + "&idNum=" + idNum, true);
		xmlhttp.send();
		xmlhttp.onreadystatechange = function (){
			if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
				var json = JSON.parse(xmlhttp.responseText); 
				var flag = json["投诉办件状态"];
				if(flag == 1){
				var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 10; width: 96%;' border = '1px' >";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td width = '20%'>投诉办件流水号</td>";
				htmlText = htmlText + "<td colspan = '3'>" + json["投诉办件流水号"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td td width = '20%'>投诉事项名称</td>";
				htmlText = htmlText + "<td>" + json["投诉事项名称"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td td width = '20%'>投诉渠道名称</td>";
				htmlText = htmlText + "<td>" + json["投诉渠道名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉人姓名</td>";
				htmlText = htmlText + "<td>" + json["投诉人姓名"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>投诉人单位名称</td>";
				htmlText = htmlText + "<td>" + json["投诉人单位名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉人单位名称</td>";
				htmlText = htmlText + "<td>" + json["投诉人单位名称"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>投诉人联系地址</td>";
				htmlText = htmlText + "<td>" + json["投诉人联系地址"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉人联系电话</td>";
				htmlText = htmlText + "<td>" + json["投诉人联系电话"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>投诉人邮政编码</td>";
				htmlText = htmlText + "<td>" + json["投诉人邮政编码"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉人电子邮件</td>";
				htmlText = htmlText + "<td>" + json["投诉人电子邮件"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>被投诉部门名称</td>";
				htmlText = htmlText + "<td>" + json["被投诉部门名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>被投诉人员姓名</td>";
				htmlText = htmlText + "<td>" + json["被投诉人员姓名"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>被投诉办件流水号</td>";
				htmlText = htmlText + "<td>" + json["被投诉办件流水号"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>希望处理部门名称</td>";
				htmlText = htmlText + "<td>" + json["希望处理部门名称"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>投诉标题</td>";
				htmlText = htmlText + "<td>" + json["投诉标题"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉内容</td>";
				htmlText = htmlText + "<td>" + json["投诉内容"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>问题发生日期</td>";
				htmlText = htmlText + "<td>" + json["问题发生日期"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉提交日期</td>";
				htmlText = htmlText + "<td>" + json["投诉提交日期"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>接受投诉部门名称</td>";
				htmlText = htmlText + "<td>" + json["接受投诉部门名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>接受投诉岗位名称</td>";
				htmlText = htmlText + "<td>" + json["接受投诉岗位名称"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>投诉接受人姓名</td>";
				htmlText = htmlText + "<td>" + json["投诉接受人姓名"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>投诉接受日期</td>";
				htmlText = htmlText + "<td>" + json["投诉接受日期"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>承诺处理时限</td>";
				htmlText = htmlText + "<td>" + json["承诺处理时限"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>实际处理部门名称</td>";
				htmlText = htmlText + "<td>" + json["实际处理部门名称"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>实际处理岗位名称</td>";
				htmlText = htmlText + "<td>" + json["实际处理岗位名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>实际处理人姓名</td>";
				htmlText = htmlText + "<td>" + json["实际处理人姓名"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>办件状态</td>";
				htmlText = htmlText + "<td>" + json["办件状态"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td>处理结果结论</td>";
				htmlText = htmlText + "<td>" + json["处理结果结论"] + "</td>";
				/*htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";*/
				htmlText = htmlText + "<td>处理日期</td>";
				htmlText = htmlText + "<td>" + json["处理日期"] + "</td>";
				htmlText = htmlText + "</tr>";
				
			    htmlText = htmlText + "</table>";
			    document.getElementById("ajax").style.display="block";
				document.getElementById("ajax").innerHTML = htmlText;
				}else if(flag == 2){
					var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 10; width: 96%;' border = '1px' >";
					htmlText = htmlText + "<tr>";
					htmlText = htmlText + "<td width = '20%'>投诉办件流水号</td>";
					htmlText = htmlText + "<td colspan = '3'>" + json["投诉办件流水号"] + "</td>";
					htmlText = htmlText + "</tr>";
					htmlText = htmlText + "<tr>";
					htmlText = htmlText + "<td td width = '20%'>投诉人姓名</td>";
					htmlText = htmlText + "<td>" + json["投诉人姓名"] + "</td>";
					htmlText = htmlText + "<tr>";
					htmlText = htmlText + "<td width = '20%'>状态</td>";
					htmlText = htmlText + "<td colspan = '3'>您提交的投诉办件暂未流转到办公人员系统中，请稍后查询。</td>";
					htmlText = htmlText + "</tr>";
					htmlText = htmlText + "</table>";
				    document.getElementById("ajax").style.display="block";
					document.getElementById("ajax").innerHTML = htmlText;
				}else{
					var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 10; width: 96%;' border = '1px' >";
					htmlText = htmlText + "<tr>";
					htmlText = htmlText + "<td width = '20%'>提示</td>";
					htmlText = htmlText + "<td colspan = '3'>" + json["提示"] + "</td>";
					htmlText = htmlText + "</tr>";
					htmlText = htmlText + "</table>";
				    document.getElementById("ajax").style.display="block";
					document.getElementById("ajax").innerHTML = htmlText;
				}
			}
		};
	}