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
 * Servlet implementation class Task02
 */
@WebServlet("/Task02")
public class Task02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task02() {
		super();
		// TODO Auto-generated constructor stub
	}

	//varqnt 1 : s ideqta vsichko da e nakup;
	//pri nalichie na vreme do predavaneto shte go razdelq i v otdelni servleti
	protected void buildResponse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//tova ne sym sigurna izobshto kak raboti i dali raboti
		response.setHeader("Pragma", "No-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-cache");
		
		PersonInfo pi = null;
		Address ad = null;
		University un = null;
		//Person p1 = new Person(null, null, null); 
		HttpSession ses = request.getSession();
		if (request.getParameter("act").equals("AddAddress")) {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String age = request.getParameter("age");
			int ageInt = Integer.parseInt(age);
			pi = new PersonInfo(firstName, lastName, ageInt);
			ses.setAttribute("personalInfo", pi.toString());
			//System.out.println(1);
			//System.out.println(pi);
			//p1.setPersonInfo(pi);
			response.sendRedirect("Task02_Address.html");
			return;
		} else if (request.getParameter("act").equals("AddUniversity")) {
			String country = request.getParameter("country");
			String town = request.getParameter("town");
			String street = request.getParameter("street");
			ad = new Address(country, town, street);
			ses.setAttribute("address", ad.toString());
			//p1.setAddress(ad);
			//System.out.println(ad);
			//System.out.println(2);
			response.sendRedirect("Task02_University.html");
			return;
		} else if (request.getParameter("act").equals("Finish")) {
			String universityName = request.getParameter("university");
			String faculty = request.getParameter("faculty");
			String specialty = request.getParameter("specialty");
			//System.out.println(3);
		    un = new University(universityName, faculty, specialty);
		    ses.setAttribute("university", un.toString());
		    //System.out.println(un);
		    //p1.setUniversity(un);
		}
		//System.out.println(4);
		//Person p2 = new Person(pi, ad, un);
		//System.out.println(p1.toString());
		
	
	
	PrintWriter pw = response.getWriter();
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
