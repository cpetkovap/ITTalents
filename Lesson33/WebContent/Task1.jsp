<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task1</title>
</head>
<body>
<%
	synchronized(application){
	if(application.getAttribute("count") == null){
		int count = 1;
		application.setAttribute("count", count);
	}else{
		if(session.isNew()){
			int count = (Integer) application.getAttribute("count") + 1;
			application.setAttribute("count", count);
		}
	}
	out.println("Num of users = " + application.getAttribute("count").toString());
	}
%>
</body>
</html>