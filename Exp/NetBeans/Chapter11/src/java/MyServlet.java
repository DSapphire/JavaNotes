import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException  {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<HTML>");
            out.println("<HEAD><TITLE>My First Servlet</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<B> First Servlet </B>");
            out.println("</BODY></HTML>");
	}
}
