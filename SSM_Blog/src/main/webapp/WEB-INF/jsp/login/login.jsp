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
<link type="text/css"	rel="stylesheet"  href="css/login/login.css" />
<script type="text/javascript" src="js/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/login/login.js"></script>
<title>login</title>
</head>
<body>
    <div class="centerDiv">
        <div class="midheader">
            <p class="midLabel">Login table</p>
        </div>
        <div class="midBody">
            <input id="username" class="username" type="text" value="" placeholder="请输入用户名"><br/>
            <div class="cutLine"></div>
            <input id="password" class="password" type="password" value="" placeholder="请输入密码"><br/>
            <div class="cutLine"></div>
            <button  id ="loginBtn" class="loginBtn">登录</button>
        </div>
    </div>
</body>
</html>