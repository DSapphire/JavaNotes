package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>在session中传递变量</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      myBeans.EmployeeBean employee = null;
      synchronized (session) {
        employee = (myBeans.EmployeeBean) _jspx_page_context.getAttribute("employee", PageContext.SESSION_SCOPE);
        if (employee == null){
          throw new java.lang.InstantiationException("bean employee not found within scope");
        }
      }
      out.write("\n");
      out.write("<H2>\n");
      out.write("员工姓名：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getName())));
      out.write("\n");
      out.write("<br>员工编号：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getId())));
      out.write("\n");
      out.write("</H2>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
