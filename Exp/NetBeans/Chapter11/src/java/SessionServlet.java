import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SessionServlet extends HttpServlet { 
  public void doGet (HttpServletRequest request,HttpServletResponse response)
                                            throws ServletException, IOException
  {
      // Get the user's session
      HttpSession session = request.getSession(true);
      String scl = (String)session.getAttribute("name1");
      // If the user has no SomeClass object, create a new one
      if (scl == null) {
          scl = new String();
          session.setAttribute("name1", scl);
      }
      //...
    }
}
