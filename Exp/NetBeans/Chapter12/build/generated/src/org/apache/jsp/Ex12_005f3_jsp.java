package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex12_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>使用JavaBean</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   ");
      myBeans.EmployeeBean employee = null;
      synchronized (_jspx_page_context) {
        employee = (myBeans.EmployeeBean) _jspx_page_context.getAttribute("employee", PageContext.PAGE_SCOPE);
        if (employee == null){
          employee = new myBeans.EmployeeBean();
          _jspx_page_context.setAttribute("employee", employee, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("   <H2>初始值：</h2>   \n");
      out.write("   <P>名字是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getName())));
      out.write(" </P>\n");
      out.write("   <p>编号是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getId())));
      out.write(" </p>\n");
      out.write("   <p>是否男性？");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).isMale())));
      out.write(" </p>\n");
      out.write("   <p>工资是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getSalary())));
      out.write("元 </p>\n");
      out.write("   <p>职务是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getOccupation())));
      out.write(" </p> \n");
      out.write("   \n");
      out.write("   <H2>修改后：</h2>  \n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("employee"), "name", "超杰", null, null, false);
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("employee"), "id", "1", null, null, false);
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("employee"), "male", "true", null, null, false);
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("employee"), "salary", "6000", null, null, false);
      out.write("\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("employee"), "occupation", "Manager", null, null, false);
      out.write("\n");
      out.write("   <P>名字是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getName())));
      out.write(" </P>\n");
      out.write("   <p>编号是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getId())));
      out.write(" </p>\n");
      out.write("   <p>是否男性？");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).isMale())));
      out.write(" </p>\n");
      out.write("   <p>工资是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getSalary())));
      out.write("元 </p>\n");
      out.write("   <p>职务是：");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((myBeans.EmployeeBean)_jspx_page_context.findAttribute("employee")).getOccupation())));
      out.write(" </p> \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
