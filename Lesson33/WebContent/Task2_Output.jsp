<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task2</title>
</head>
<body>
	<%
		int value1 = Integer.parseInt(request.getParameter("value1"));
		int value2 = Integer.parseInt(request.getParameter("value2"));
		int value3 = Integer.parseInt(request.getParameter("value3"));
		int value4 = Integer.parseInt(request.getParameter("value4"));
		int value5 = Integer.parseInt(request.getParameter("value5"));
	%>
	<%=value1 + " + " + value2 + " + " + value3 + " + " + value4 + " + "
					+ value5 + " = "
					+ (value1 + value2 + value3 + value4 + value5)%>
</body>
</html>