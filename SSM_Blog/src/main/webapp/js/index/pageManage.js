$(document).ready(function(){
	var pageNum = getPageNum();
	$.ajax({
		url : "getPartBlogContent",// 跳转到 action  
		data : {
			userID  : 1 ,
			currentPage:1,
			pageSize:pageNum
		},
		type : "post",
		cache : false,
		dataType : "json",
		success : function(data) {
			//blog data
			var s="";
			$.each(data.blogList,function(index,item){
				 s+="<tr class='tableDetail'>" +
				 		"<td>"+item.title+"</td>" +
				 		"<td>"+item.created_time+"</td>" +
				 		"<td>"+item.pageview+"</td>" +
				 		"<td>"+item.categories+"</td>" +
				 		"<td>"+item.status+"</td>" +
				 		"<td>"+1+"</td>" +
				 	"</tr>";
			})
			$("#insideTable").append(s);
			
			//page num
			var pageNum =data.pageNum;
			var pageHtml="<a class='pageNav' href=''>首页</a>";
			for(var i =1;i<=pageNum;i++){
				pageHtml+=	"<a class='pageNav' href=''>" +
								i +
							"</a>"
			}
			pageHtml+="<a class='pageNav'  href=''>尾页</a>"
			$("#bottomPage").append(pageHtml);
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){									
			alert("XMLHttpRequest.status="+XMLHttpRequest.status+"\nXMLHttpRequest.readyState="+XMLHttpRequest.readyState+"\ntextStatus="+textStatus);	
		}
	});
})

function getPageNum(){
	var height =$(window).height();
	var pageNum  = Math.floor(height*0.8/35)-1;
	return pageNum;
}


//			alert(JSON.stringify(data));