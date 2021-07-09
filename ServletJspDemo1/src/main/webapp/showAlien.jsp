<%@page import= "com.adithya.web.model.Alien" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alien Show</title>
</head>
<body bgcolor="cyan">

<%
 	Alien a1 = (Alien)request.getAttribute("alien");
	out.println(a1);
%>

</body>
</html>