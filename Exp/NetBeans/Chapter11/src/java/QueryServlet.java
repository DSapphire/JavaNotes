/*
 * QueryServlet.java
 *
 * Created on 2006年4月19日, 下午6:25
 */

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author C.L.C  Alpha
 * @version
 */
public class QueryServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException  {
        res.setContentType("text/html;charset=UTF-8");
        String queryBookValue=req.getParameter("Book");
        PrintWriter out = res.getWriter();
        out.println("The book you wanted is:"+queryBookValue);
        out.close();
    }
}