import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;

public class AccessCounts extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
                                  throws ServletException, IOException{
        String cookieName, numString;
        cookieName = "numString";
        numString = "1";

        Cookie[] cks = req.getCookies();
        if (cks != null)
        {
            for (int i=0; i<cks.length; i++)
            {
                Cookie tempCk = cks[i];
                if(cookieName.equals(tempCk.getName()))
                    numString = tempCk.getValue();
            }
        }
        int num = 0;
        try{
            num = Integer.parseInt(numString);
        }
        catch(NumberFormatException e)
        {}
        Cookie myCookie = new Cookie("numString",String.valueOf(num+1));
        myCookie.setMaxAge(60*60*24);
        res.addCookie(myCookie);
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String title = "User Access Count ";
        String docType = "<!DOCTYRP HTML PUBLIC \"- //W3C//DTD HTML 4.0" + 
                       "Transitional //EN\">\n";
        out.println(docType+
                  "<html>\n"+
                  "<head><title>" + title + "</title></head>"+
                  "<body>\n"+
                  "<h1> Access Count is: " + num + " </h1>"+
                  "</body></html>");
    }
}
