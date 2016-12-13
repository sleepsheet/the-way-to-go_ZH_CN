<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="com.test.helloworld.entity.HelloWorld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getHelloworldByService</title>
</head>
<body>
	<%
		//HelloWorld hello = new HelloWorld();
		String hello = (String)session.getAttribute("hello");
		out.println("<h2>"+hello+"</h2>");
	%>
</body>
</html>