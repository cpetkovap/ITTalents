package tasks;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	File file;
	JSONParser parser;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		file = new File(getServletContext().getRealPath("file.txt"));
	    parser = new JSONParser();
	}
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String pass = request.getParameter("password");

		FileReader s = new FileReader(file);
		Object obj;
		boolean result = false;
		try {
			obj = parser.parse(s);
//			JSONObject jsonObject = (JSONObject) obj;
//			if (jsonObject.get("username").equals(name) && jsonObject.get("password").equals(pass)) {
//				result = true;
//			}
			
			JSONArray array = (JSONArray) obj;
						
			for (Iterator i = array.iterator(); i.hasNext();) {
				JSONObject objArr = (JSONObject) i.next();
				if (objArr.get("username").equals(name) && objArr.get("password").equals(pass)) {
					result = true;
				}
			}
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.close();
		
		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("MainServlet");
		} else {
			response.sendRedirect("InvalidLogin.html");
		}

	}

}
