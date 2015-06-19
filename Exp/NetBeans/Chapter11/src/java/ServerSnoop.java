import java.io.*;
import java.util.*;
import javax.servlet.*;
public class ServerSnoop extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) 
        throws ServletException, IOException 
    {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        out.println("req.getServerName() output: " + req.getServerName());
        out.println("req.getServerPort() output: " + req.getServerPort());
        out.println("getServletContext().getServerInfo() output: " +
        getServletContext().getServerInfo());
        out.println("getServletContext().getAttribute(\"attribute\") output: " +
        getServletContext().getAttribute("attribute"));
    }
}