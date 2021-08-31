<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<style>
body
{
	margin: 0;
	padding: 0;
	font-family: sans-serif;
}
.container
{
	width: 100%;
	height: 100vh;
	background-image: url(/pages/papp_bgrnd.jpg);
	background-size: cover;
	background-position: center;
}
.navbar
{
	width: 88%;
	margin: auto;
	padding: 15px 10px;
	display: flex;
	align-items: center;
	justify-content: space-between;
}
.logo
{
	width: 160px;
	height: 100px;
	cursor: pointer;
	background: transparent;
	margin-left: -60px;
	margin-top: 4px;
}
.navbar ul li
{
	list-style: none;
	display: inline-block;
	margin: 0 20px;
}
.navbar ul li a
{
	text-decoration: none;
	color: #000000;
	font-size: 20px;
}
.navbar ul li a:hover
{
	color: red;
}
.content
{
	width: 100%;
	position: absolute;
	top: 25%;
}
.content h1
{
	float: left;
	margin-left: 10px;
	font-size: 70px;
	color: #ffffff;
	
}
</style>
<body>
<div class="container">
	<div class="navbar">
	<img src="/pages/phone_logo.jpg" class="logo">
	<ul>
	
	<li><a href="/register"> Add Contact </a></li>
	<li><a href="/allContacts"> View Contact </a></li>
	</ul>
	</div>
	
	<div class="content">
	<h1><center><font color=black> WELCOME <br> TO <br> PHONE BOOK </font></center></h1>
	</div>
</div>
</body>
</html>