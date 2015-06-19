import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
         throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE> MY second Servlet </TITLE></HEAD>");
        out.println("<BODY>");
        out.println(" <table border=2> <tr> <td> name </td><td> Bush 	</td>");
        out.println("<td> Sex </td> <td> Male </td></tr><tr><td>City</td>");
        out.println("<td>NewYork</td> <td>Country</td><td>U. S. A </td>	</tr>");
        out.println("</BODY><HTML>");
    }
}
