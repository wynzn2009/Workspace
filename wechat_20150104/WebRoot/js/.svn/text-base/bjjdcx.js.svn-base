
document.write("<script type='text/javascript' src='js/json2.js'></script>");

function search(cxbjlsh,cxsqz, cxphone){	
		var xmlhttp;
		if(cxsqz == "" || cxphone == ""||cxbjlsh == ""){
			document.getElementById("ajax").innerHTML = "";
		}
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
		}
		else{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		
		xmlhttp.open("GET", "../servlet/bjSearch?cxbjlsh=" + cxbjlsh + "&cxsqz=" + cxsqz + "&cxphone=" + cxphone, true);
		xmlhttp.send();
		xmlhttp.onreadystatechange = function (){
			console.log("readysate:" + xmlhttp.readyState);
			console.log("status:" + xmlhttp.status);
			if(xmlhttp.readyState == 4 && xmlhttp.status == 200){console.log("readysate:" + xmlhttp.readyState);
			console.log("status:" + xmlhttp.status);
				var json = JSON.parse(xmlhttp.responseText); 
				var flag = json["flag"];
				if(flag == 1){
				var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 7; width: 96%;' border = '1px' >";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td width = '20%'>办件流水号</td>";
				htmlText = htmlText + "<td colspan = '1'>" + json["办件流水号"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td width = '20%'>事项名称</td>";
				htmlText = htmlText + "<td colspan = '1'>" + json["事项名称"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td width = '20%'>处理时间</td>";
				htmlText = htmlText + "<td colspan = '1'>" + json["最后处理时间"] + "</td>";
				htmlText = htmlText + "</tr>";
				htmlText = htmlText + "<tr>";
				htmlText = htmlText + "<td width = '20%'>处理步骤</td>";
				htmlText = htmlText + "<td colspan = '1'>" + json["处理步骤"] + "</td>";
				htmlText = htmlText + "</tr>";
			    htmlText = htmlText + "</table>";
			    
			    document.getElementById("ajax").style.display="block";
				document.getElementById("ajax").innerHTML = htmlText;
				}else if(flag == 3){
					var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 7; width: 96%;' border = '1px' >";
					
						htmlText = htmlText + "<tr>";
						htmlText = htmlText + "<td colspan = '1'>" + json["error"] + "</td>";
						htmlText = htmlText + "</tr>";
					
				    htmlText = htmlText + "</table>";
				    
				    document.getElementById("ajax").style.display="block";
					document.getElementById("ajax").innerHTML = htmlText;
				}else{
					var htmlText = "<table style = 'margin: 1% 2%;  border-collapse: collapse; font-size: 7; width: 96%;' border = '1px' >";
					for(var i in json){
						htmlText = htmlText + "<tr>";
						htmlText = htmlText + "<td colspan = '1'>" + i +"</td>";
						htmlText = htmlText + "<td colspan = '1'>" + json[i] + "</td>";
						htmlText = htmlText + "</tr>";
					}
				    htmlText = htmlText + "</table>";
				    
				    document.getElementById("ajax").style.display="block";
					document.getElementById("ajax").innerHTML = htmlText;
				}
			}
		};
	}