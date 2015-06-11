package tasks;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task2
 */
@WebServlet("/Task2")
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Writer r =response.getWriter();
		r.append("<style type = \"text/css\">"
				+ "table{ border : 2px solid black; border-collapse : collapse}"
				+ "td{ border : 1px solid black}"
				+ "</style>");
		r.append("<table>");
		for(int i = 1 ; i <= 1000; i++){
			r.append("<tr>");
			r.append("<td>");
			r.append("" + i);
			r.append("</td>");
			r.append("<td>");
			r.append("" + Math.sqrt((double) i ));
			r.append("</td>");
			r.append("</tr>");
		}
		r.append("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
