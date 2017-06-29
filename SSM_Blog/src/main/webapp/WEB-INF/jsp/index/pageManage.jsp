<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 	
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/index/pageManage.css">
<script type="text/javascript" src="js/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/index/pageManage.js"></script>
</head>
<body>
	<div class="title">页面管理</div>
	<div class="table">
	    <table id="insideTable" class="insideTable" rules="all">
	        <tr class="tableHead">
	            <th class="m_title">文章标题</th>
	            <th class="m_time">发布时间</th>
	            <th class="m_pageview">浏览量</th>
	            <th class="m_category">所属分类</th>
	            <th class="m_status">发布状态</th>
	            <th class="m_operation">操作</th>
	        </tr>
	    </table>
	</div>
	<div id="bottomPage" class="bottom">
	</div>
</body>
</html>