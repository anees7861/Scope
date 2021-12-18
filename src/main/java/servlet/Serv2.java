package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
/* to be registered in web.xml*/
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name = getInitParameter("nm"); // this will only work with serv1 as its scope is until there
//		
//		PrintWriter pw = response.getWriter();
//		pw.println("Hello " + name);
		
		String name = getServletContext().getInitParameter("WebsiteName"); // thsi will work in both serv
		
		PrintWriter pw = response.getWriter();
		pw.println("Hello " + name);

	}

	
}
