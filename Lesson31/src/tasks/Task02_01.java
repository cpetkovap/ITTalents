package tasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Task02_01
 */
@WebServlet("/Task02_01")
public class Task02_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task02_01() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void buildResponse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession ses = request.getSession();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		int ageInt = Integer.parseInt(age);
		PersonInfo pi = new PersonInfo(firstName, lastName, ageInt);
		ses.setAttribute("personalInfo", pi);

		response.sendRedirect("Task02_Address1.html");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		buildResponse(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
