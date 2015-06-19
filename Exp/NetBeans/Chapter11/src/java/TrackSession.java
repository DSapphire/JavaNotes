import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.net.*; 
import java.util.*;

public class TrackSession extends HttpServlet {
  public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
      	String heading;
	Integer count;
	response.setContentType("text/html");
	HttpSession session = request.getSession(true);
	count =(Integer)session.getAttribute("count");
	if (count == null) 
        {
            count = new Integer(0);
            heading = "First visiting";
	} 
	else
        {
            heading = "Welcome Back";
            count = new Integer(count.intValue() + 1);
	}
	session.setAttribute("count", count);
	PrintWriter out = response.getWriter();
	String docType = "<!DOCTYRP HTML PUBLIC \"- //W3C//DTD HTML 4.0" 
		+ "Transitional //EN\">\n";
	out.println(docType +
            "<BODY BGCOLOR=\"#FDF5E6\">\n" +
            "<H1 ALIGN=\"CENTER\">" + heading + "</H1>\n" +
            "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
            "<TR BGCOLOR=\"#FFAD00\">\n" +
            " <TH>NAME<TH>VALUE\n" +
            "<TR>\n" +
            " <TD>ID:\n" +
            " <TD>" + session.getId() + "\n" +
            "<TR>\n" +
            " <TD>Creation Time:\n" +
            " <TD>" +
            new Date(session.getCreationTime()) + "\n" +
            "<TR>\n" +
            "<TD>Last Access Time:\n" +
            "<TD>" +
            new Date(session.getLastAccessedTime()) + "\n" +
            "<TR>\n" +
            " <TD>Count:\n" +
            " <TD>" + count + "\n" +
            "</TABLE>\n" +
            "</BODY></HTML>");
    }
	/** doPost方法直接调用doGet */
    public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException 
    {
        doGet(request, response);
    }
}