function fileloadon() {
    $("#msg").html("");    
    $("#_fileForm").ajaxSubmit({
            type: "post",
            url: "htgl/coverUpload.jsp",
            success: function (data1) {
        	var remsg = data1.split("file=");
        	alert(remsg[0]);
        	alert(remsg[1])
        	$("#msg").html(remsg[0]); 
        	$("#filemsg").val(remsg[1]);
            },
            error: function (msg) {
            	$("#msg").html("文件上传失败");  
            }
        });
     return false;
}
