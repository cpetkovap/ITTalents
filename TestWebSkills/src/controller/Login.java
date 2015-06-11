package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String line = request.getReader().readLine();
		// System.out.println(line);

		JSONParser parser = new JSONParser();
		try {
			
			JSONObject obj = (JSONObject) parser.parse(line);
			String username = obj.get("name").toString();
			String password = obj.get("pass").toString();

			HashMap<String, String> existingUsers = ((HashMap) getServletConfig()
					.getServletContext().getAttribute("users"));
			if (existingUsers != null) {

//				for (String s : existingUsers.keySet()) {
//					System.out.println(s);
//				}

				for (Entry<String, String> person : existingUsers.entrySet()) {
					if (username.equals(person.getKey()) && password.equals(person.getValue())) {
						HttpSession sess = request.getSession();
						sess.setAttribute("user", person.getKey());
						response.getWriter().write("success login");
						// response.sendRedirect("Home.jsp");
					} else {

					}
				}

			} else {
				
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
