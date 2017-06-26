$(document).ready(function() {
	$("#loginBtn").click(function(){
		$.ajax({
				url : "submitLogin",// 跳转到 action  
				data : {
					username : $("#username").val(),
					password : $("#password").val(),
				},
				type : "post",
				cache : false,
				dataType : "json",
				success : function(data) {
					 alert(JSON.stringify(data));
				},
				error:function(XMLHttpRequest, textStatus, errorThrown){									
					alert("XMLHttpRequest.status="+XMLHttpRequest.status+"\nXMLHttpRequest.readyState="+XMLHttpRequest.readyState+"\ntextStatus="+textStatus);	
				}
			});
	});
})