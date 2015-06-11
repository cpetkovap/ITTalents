package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Task03
 */
@WebServlet("/Task03")
public class Task03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	File gif ;	
//	FileInputStream in;
//    OutputStream out;
    
	
//	@Override
//	public void init() throws ServletException {
//		gif = new File(getServletContext().getRealPath(
//				"WEB-INF" + File.separator + "img" + File.separator
//						+ "logo.gif"));
//
//		try {
//			in = new FileInputStream(gif);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Task03() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doResponse(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/gif");
		// tova ako ne raboti => ne sym s windows
		// File gif = new File("WebContent/WEB-INF/img/logo.gif");

		// prozrenie : taka shte raboti :D
		File gif = new File(getServletContext().getRealPath(
				"WEB-INF" + File.separator + "img" + File.separator
						+ "logo.gif"));

		FileInputStream in = new FileInputStream(gif);
//		HttpSession ses = request.getSession();
//		ses.setAttribute("img", in);
		OutputStream out = response.getOutputStream();
//		int read = 0;
//		out = response.getOutputStream();
		int read= 0;
		while (read != -1) {
			read = in.read();
//			read = (int)(((FileInputStream) ses.getAttribute("img")).read());
			out.write(read);
		}
		in.close();
		out.close();
		

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doResponse(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		super.destroy();
//		try {
//			in.close();
//			out.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

}
