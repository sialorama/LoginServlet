<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bienvenue</title>
</head>
<body>
<center>
<h1>Bojour, <%= request.getParameter("name") %>!</h1>
<p><h1>Bienvenu dans notre eShop</h1></p>
<a href="logout.jsp">Logout</a>
</center>
</body>
</html>
