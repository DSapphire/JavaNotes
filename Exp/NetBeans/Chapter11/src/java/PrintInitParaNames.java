import java.io.*;
import java.util.*;
import javax.servlet.*;
public class PrintInitParaNames extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        out.println("Init Parameters As Following:");
        Enumeration enum1 = getInitParameterNames();
        while (enum1.hasMoreElements()) {
            String name = (String) enum1.nextElement();
            out.println(name+ ": " + getInitParameter(name));
        }
     }
}
