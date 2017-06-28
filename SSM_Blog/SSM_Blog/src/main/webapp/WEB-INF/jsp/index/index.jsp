<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath(); 
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 	
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/index/index.css">
<script type="text/javascript" src="js/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/index/index.js"></script>
<title>index</title>
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

        <!-- bottom left -->
        <div class = bottomLeft>
            <div id="nav1" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/panel.png"/></div>
                <div class="navTitle"><a>仪表盘</a></div>
            </div>
            <div id="nav2" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/write.png"/></div>
                <div class="navTitle"><a>发布文字</a></div>
            </div>
            <div id="nav3" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/list.png"/></div>
                <div class="navTitle"><a>文章管理</a></div>
            </div>
            <div id="nav4" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/page.png"/></div>
                <div class="navTitle"><a>页面管理</a></div>
            </div>
            <div id="nav5" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/chat.png"/></div>
                <div class="navTitle"><a>评论管理</a></div>
            </div>
            <div id="nav6" class="nav">
                <div class="navImgBox"><img class="navImg" src="images/nav/tag.png"/></div>
                <div class="navTitle"><a>标签/分类</a></div>
            </div>
        </div>

        <!-- bottom letf -->
        <div id ="rightContent" class = "bottomRight">
		
        </div>
    </div>
    
</body>
</html>