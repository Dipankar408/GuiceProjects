<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" import="com.entity.mng.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Persistence/find" method="post">
Name:<input type="text" name="name">
User ID:<input type="text" name="id"> 
Age:<input type="text" name="age"><br><br>
<input type="submit">
</form>
</body>
</html>