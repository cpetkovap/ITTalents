<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.util.Map.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task2</title>
</head>
<body>
<h1>Task2</h1>
<form action="Task2.jsp" method="POST">
<input type="text" name="value">
<input type="submit" label = "Add Value">
</form>
<%

	TreeMap<String, Integer> map = (TreeMap<String, Integer>) session.getAttribute("map");
	if(map == null)
	{
		map = new TreeMap<String, Integer>();
		session.setAttribute("map", map);
	}
	String item = request.getParameter("value");
	if(item != null && item != "")
	{
		if(map.containsKey(item))
			map.put(item, ((Integer)map.get(item))+1);
		else
			map.put(item, 1);
	}
%>

<%
for(Object e : map.entrySet()) {
	Map.Entry entry = (Entry) e;%>
	<h1><%=entry.getKey()%>  : <%=entry.getValue() %></h1>
<%
}
%>
</body>
</html>