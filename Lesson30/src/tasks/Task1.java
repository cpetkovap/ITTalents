package tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.IntConsumer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task1
 */
@WebServlet("/Task1")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int count = 0;
	private int userCount;
	File f = new File("file.txt");;
	Scanner sc;
	FileWriter ps;
	private int persistantCounter;
	private ServletConfig config;
	private String initCount;
	private int initCountToInt;
	private int helpInit;

	@Override
	public void init() throws ServletException {
		config = getServletConfig();
		initCount = config.getInitParameter("countInitValue");
		helpInit = Integer.parseInt(initCount);
	}

	public Task1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		response.getWriter().println(
				"This page is seen for " + (++count)
						+ " times since last reboot :)<br/>");

		// response.getWriter().println(initCount );
		initCountToInt = Integer.parseInt(initCount);
		response.getWriter().println(
				"Init parameter is " + (initCountToInt) + " ; ");

		response.getWriter().println(
				"Init parameter++ after reboot : " + (++helpInit) + " :)<br/>");

		sc = new Scanner(f);
		persistantCounter = Integer.parseInt(sc.nextLine());
		sc.close();
		response.getWriter().println(
				"This page is seen for " + (++persistantCounter)
						+ " times :)<br/>");
		ps = new FileWriter(f, false);
		ps.write(new Integer(persistantCounter).toString());
		ps.flush();
		ps.close();
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
