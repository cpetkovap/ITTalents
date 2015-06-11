package tasks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Task02_03
 */
@WebServlet("/Task02_03")
public class Task02_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	public Task02_03() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void buildResponse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession ses = request.getSession();

		String universityName = request.getParameter("university");
		String faculty = request.getParameter("faculty");
		String specialty = request.getParameter("specialty");
		University un = new University(universityName, faculty, specialty);
		ses.setAttribute("university", un);
		PrintWriter pw = response.getWriter();
		pw.println("<p>Result:</p>");
		pw.println(ses.getAttribute("personalInfo"));
		pw.println(ses.getAttribute("address"));
		pw.println(ses.getAttribute("university"));
		pw.close();
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
