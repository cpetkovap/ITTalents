package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/CheckUserExist")
public class CheckUserExist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String line = request.getReader().readLine();
		//System.out.println(line);
		HashMap<String, String> existingUsers = ((HashMap) getServletConfig()
				.getServletContext().getAttribute("users"));
		if (existingUsers != null) {
			//System.out.println(1);
			for (String person : existingUsers.keySet()) {
				if (line.equals(person)) {
					response.getWriter().append("exist");
				} else {
					response.getWriter().append("don`t exist");
				}
			}
		}else{
			//System.out.println(2);
			response.getWriter().append("don`t exist");
		}

	}

}
