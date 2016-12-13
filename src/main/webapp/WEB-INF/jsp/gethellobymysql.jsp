<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="com.test.helloworld.entity.HelloWorld,com.test.helloworld.entity.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getHelloworldByMySQL</title>
</head>
<body>
	<%
		//HelloWorld hello = new HelloWorld();
		User user = new User();
		user = (User)session.getAttribute("user");
		out.print("<h2>"+user.getContent()+"</h2>");
	%>
</body>
</html>