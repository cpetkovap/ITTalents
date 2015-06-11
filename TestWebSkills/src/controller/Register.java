package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String info = request.getReader().readLine();
		// System.out.println(info);

		JSONParser parser = new JSONParser();
		JSONObject obj;
		String name = null;
		String pass = null;
		try {

			obj = (JSONObject) parser.parse(info);
			name = obj.get("name").toString();
			pass = obj.get("pass").toString();
			// System.out.println(name + "..." + pass);

			if (getServletConfig().getServletContext().getAttribute("users") == null) {
				// System.out.println(1);
				HashMap<String, String> users = new HashMap<String, String>();
				if (name != null && pass != null) {
					users.put(name, pass);
				}
				getServletConfig().getServletContext().setAttribute("users",
						users);
			} else {
				// System.out.println(2);
				if (name != null && pass != null) {
					((HashMap) getServletConfig().getServletContext()
							.getAttribute("users")).put(name, pass);
				}
			}
			// HashMap<String, String> st = (HashMap<String, String>)
			// getServletConfig().getServletContext().getAttribute("users");
			// for(String s :st.keySet()){
			// System.out.println(s);
			// }
			// System.out.println(3);
			response.getWriter().write("success");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().write("not success");
		}

	}

}
