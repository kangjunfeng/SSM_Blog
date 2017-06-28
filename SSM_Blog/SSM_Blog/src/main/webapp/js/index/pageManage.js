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
			var s="";
			$.each(data.blogList,function(index,item){
				 s+="<tr>" +
				 		"<td>"+item.title+"</td>" +
				 		"<td>"+item.created_time+"</td>" +
				 		"<td>"+item.pageview+"</td>" +
				 		"<td>"+item.categories+"</td>" +
				 		"<td>"+item.status+"</td>" +
				 	"</tr>";
			})
			$("#insideTable").append(s);
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){									
			alert("XMLHttpRequest.status="+XMLHttpRequest.status+"\nXMLHttpRequest.readyState="+XMLHttpRequest.readyState+"\ntextStatus="+textStatus);	
		}
	});
})


//			alert(JSON.stringify(data));