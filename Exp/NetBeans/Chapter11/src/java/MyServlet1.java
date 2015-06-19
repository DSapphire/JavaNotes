import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class MyServlet1 extends HttpServlet 
{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
                throws ServletException, IOException {
        res.setContentType("text/html");
        RequestDispatcher summary = getServletContext().getRequestDispatcher(
          "/MyServlet2");         
        if (summary != null)
        {
            try {
                summary.include(req, res);
            } 
            catch (IOException e) {   } 
            catch (ServletException e) {   }
        }
        else if (summary == null) 
        {
            PrintWriter out = res.getWriter();
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Error</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<BIG>Summary is Null</BIG>");
            out.println("</BODY></HTML>");
        }
    }
}
