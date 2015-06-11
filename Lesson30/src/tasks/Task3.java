package tasks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task3
 */
@WebServlet("/Task3")
public class Task3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String valueA = request.getParameter("valueA");
		String valueB = request.getParameter("valueB");
		if (valueA != "" && valueB != "") {
			try{
				int a = Integer.parseInt(valueA);
				int b = Integer.parseInt(valueB);			
				pw.println("<p>Result = " + (a + b) + "</p>");
				pw.println("<a href = \"Task3HTML.html\">Back</a>");
			}catch(NumberFormatException e){
				pw.println("<p>You have to add integer values</p>");
				pw.println("<a href = \"Task3HTML.html\">Back</a>");
			}
		}else{
			pw.println("<p>You have to add sth</p>");
			pw.println("<a href = \"Task3HTML.html\">Back</a>");
		}
		

	}

}
