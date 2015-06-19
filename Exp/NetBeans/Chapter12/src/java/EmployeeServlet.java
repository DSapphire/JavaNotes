import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EmployeeServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        HttpSession session=request.getSession ();
        myBeans.EmployeeBean bean=(myBeans.EmployeeBean)session.getAttribute ("employee");
        if(bean==null)
        {
            bean=new myBeans.EmployeeBean();
            session.setAttribute("employee",bean);
        }
        String name=request.getParameter ("name");		
        String id=request.getParameter ("id");
        bean.setName(name);
        bean.setId(Integer.parseInt (id));
        String address="/ShowEmployee.jsp";
        RequestDispatcher dispatcher=request.getRequestDispatcher(address);
        dispatcher.forward(request,response);
    }}