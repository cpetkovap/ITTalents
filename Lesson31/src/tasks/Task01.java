package tasks;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task01
 */
@WebServlet("/Task01")
public class Task01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task01() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void buildResponse(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		response.setHeader("Pragma", "No-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-cache");

		// valuees
		String from = request.getParameter("value1");
		double fromDouble;
		try {
			fromDouble = Double.parseDouble(from);
		} catch (NumberFormatException e) {
			response.getWriter().println("<p>Incorrect Input</p>");
			return;
		}

		// System.out.println(from);
		String metricFrom = request.getParameter("metricFrom");
		String metricTo = request.getParameter("metricTo");
		// System.out.println(metricFrom);
		double result = -1;

		switch (metricTo) {
		case "meter":
			result = fromDouble * transferToMeter(metricFrom);
			break;
		case "centimeter":
			result = fromDouble * transferToMeter(metricFrom) / 0.01;
			break;
		case "kilometer":
			result = fromDouble * transferToMeter(metricFrom) / 1000;
			break;
		case "foot":
			result = fromDouble * transferToMeter(metricFrom) / 0.3048;
			break;
		case "inch":
			result = fromDouble * transferToMeter(metricFrom) / 0.0254;
			break;
		case "yard":
			result = fromDouble * transferToMeter(metricFrom) / 0.9144;
			break;
		case "mile":
			result = fromDouble * transferToMeter(metricFrom) / 1609.344;
			break;
		default:
			break;
		}

		response.getWriter().println(
				"<p>" + fromDouble + " " + metricFrom + " = " + result + " "
						+ metricTo + "</p>");

	}

	double transferToMeter(String metric) {
		double result = -1;
		switch (metric) {
		case "meter":
			result = 1;
			break;
		case "centimeter":
			result = 0.01;
			break;
		case "kilometer":
			result = 1000;
			break;
		case "foot":
			result = 0.3048;
			break;
		case "inch":
			result = 0.0254;
			break;
		case "yard":
			result = 0.9144;
			break;
		case "mile":
			result = 1609.344;
			break;
		}
		return result;

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
