<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Task2</title>
</head>
<body>
	<form action="Task2_Input.jsp" method="post">
		<input type="text" name="value" /> <input type="submit" value="Add">
	</form>
	<%
		ArrayList<Integer> items = (ArrayList<Integer>) session
				.getAttribute("items");
		if (items == null) {
			items = new ArrayList();
			session.setAttribute("items", items);
		}
		
		if (items.size() < 5) {
			if (request.getParameter("value") != null) {
				try {
					int value = Integer.parseInt(request
							.getParameter("value"));
					items.add(value);
					out.print("You add " + items.size() + " numbers");
				} catch (NumberFormatException e) {
					out.println("Invalid input");
				}
			}
	
		}
		
		if(items.size() == 5){
			%>
			<jsp:forward page="Task2_Output.jsp">

				<jsp:param name="value1" value= "<%=items.get(0) %>" />
				<jsp:param name="value2" value= "<%=items.get(1) %>" />
				<jsp:param name="value3" value= "<%=items.get(2) %>" />
				<jsp:param name="value4" value= "<%=items.get(3) %>" />
				<jsp:param name="value5" value= "<%=items.get(4) %>" />
				
			</jsp:forward>

			<%
		}
	%>
</body>
</html>