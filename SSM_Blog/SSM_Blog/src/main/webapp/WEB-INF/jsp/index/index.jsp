<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 	
%> 
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/index/index.css">
<script type="text/javascript" src="js/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/index/index.js"></script>
<title>Index</title>
</head>
<body>
    <div class="main">
        <!-- topLeft -->
        <div class ="topLeft">
            <div class="logo">
                <div class="logoBox"><img class="logoImg" src="images/unicorn.png"/></div>
                <div class="logoTitle">My blog</div>
            </div>
        </div>

        <!-- topRight -->
        <div class = topRight>

        </div>

        <!-- bottom letf -->
        <div class = bottomLeft>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/panel.png"/></div>
                <div class="navTitle"><a href="#">仪表盘</a></div>
            </div>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/write.png"/></div>
                <div class="navTitle"><a href="#">发布文字</a></div>
            </div>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/list.png"/></div>
                <div class="navTitle"><a href="#">文章管理</a></div>
            </div>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/page.png"/></div>
                <div class="navTitle"><a href="#">页面管理</a></div>
            </div>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/chat.png"/></div>
                <div class="navTitle"><a href="#">评论管理</a></div>
            </div>
            <div class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/tag.png"/></div>
                <div class="navTitle"><a href="#">标签/分类</a></div>
            </div>
        </div>

        <!-- bottom letf -->
        <div class = bottomRight>

        </div>
    </div>
    
</body>
</html>