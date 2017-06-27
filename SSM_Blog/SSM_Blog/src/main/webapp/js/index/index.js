$(document).ready(function(){
	$.ajax({
		url : "getAllBlog",// 跳转到 action  
		data : {
			userID : 1
		},
		type : "post",
		cache : false,
		dataType : "json",
		success : function(data) {
			alert("success");
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){									
			alert("XMLHttpRequest.status="+XMLHttpRequest.status+"\nXMLHttpRequest.readyState="+XMLHttpRequest.readyState+"\ntextStatus="+textStatus);	
		}
	});
})