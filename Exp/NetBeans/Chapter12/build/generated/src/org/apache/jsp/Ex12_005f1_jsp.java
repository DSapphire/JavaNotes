package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex12_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


   int continuousSum(int n)
   {
       int sum=0;
	   for(int i=1;i<=n;i++)
	   {
	    sum=sum+i;
	   }
	   return sum;
    }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write('\n');

    String str=request.getParameter("number");
    if(str==null) str="10";
    int r=Integer.parseInt(str);

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>计算连续和</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>请输入一个自然数</h1>\n");
      out.write("<!-- HTML表单 -->\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("  <input type=\"text\" name=\"number\" value=");
      out.print(str);
      out.write(">\n");
      out.write("  <input type=\"submit\" name=\"Submit\" value=\"计算\">\n");
      out.write("</form>      \t\t\n");
      out.write('\n');
      out.print( r );
      out.write("的连续和是");
      out.print(continuousSum(r) );
      out.write("\n");
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
