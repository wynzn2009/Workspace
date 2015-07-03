var req;
function validate(){
	var username = document.getElementById("user");
	//var userpsw = document.getElementById("psw");
	
	var url = "servlet/loginServlet? id=" + escape(username.Value);
	if(window.XMLHttpRequest){
		req = new XMLHttpRequest();
	}else if(window.ActiveXObject){
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	req.open("POST", url, true)
	req.onreadystatechange = callback;
	req.send(null);
	
	function callback(){
		if(req.readState == 4 && req.status ==200){
			var check = req.responseText;
			show(check);
		}
	}
	
	function show(){
		if(str == "OK"){
			var show = "<font>ok</font>";
			document.getElementById("info").innerHTML = show;
		}else if(str == "NO"){ 
			var show = "<font>no</font>";
			document.getElementById("info").innerHTML = show;
		}
	}
}