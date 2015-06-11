package tasks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JSONArray arr = new JSONArray();;
	File file; 
	StringBuilder sb;
	boolean result = true;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		file = new File(getServletContext().getRealPath("file.txt"));
		sb = new StringBuilder();
		super.init();
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				int b = 0;
				while (b != -1) {
					b = fis.read();
					if (b != -1) {
						sb.append((char) b);
					}
				}
				Object o = new Object();
				o = JSONValue.parse(sb.toString());
				arr = (JSONArray) o;
				// System.out.println(jsarr.toString());

				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		User user = new User(name, pass);

		User checkUser = null;
		Iterator it = arr.iterator();
		while (it.hasNext()) {
			JSONObject curr = (JSONObject) it.next();
			String usn = (String) curr.get("username");
			String pas = (String) curr.get("password");
			checkUser = new User(usn, pas);
			if (user.equals(checkUser)) {
				System.out.println("Exists!!!");
				result = false;
				break;
			}
		}

		if (result) {
			JSONObject obj = new JSONObject();

			obj.put("username", user.getName());
			obj.put("password", user.getPass());
			System.out.println(obj);
			arr.add(obj);
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(file, false)));
			out.println(arr.toJSONString());
			out.flush();
			out.close();
			
			response.sendRedirect("index.html");

		}else{
			response.getWriter().append("<h3>You can not add this person</h3>");
			response.getWriter().append("<a href = \"index.html\"> Click here to go to the home page</a>");
		}
	}

}
