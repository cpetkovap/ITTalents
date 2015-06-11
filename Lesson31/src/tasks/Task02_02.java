package tasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Task02_02
 */
@WebServlet("/Task02_02")
public class Task02_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task02_02() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void buildResponse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession ses = request.getSession();

		String country = request.getParameter("country");
		String town = request.getParameter("town");
		String street = request.getParameter("street");
		Address ad = new Address(country, town, street);
		ses.setAttribute("address", ad);

		response.sendRedirect("Task02_University1.html");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
