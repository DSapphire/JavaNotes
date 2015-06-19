package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Shopping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>欢迎光临网络书店</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>网络书店\n");
      out.write("</h1>\n");
      out.write("<table width=\"706\" border=\"1\">\n");
      out.write("    <tr align=\"center\" valign=\"middle\" bgcolor=\"#CCCCCC\">\n");
      out.write("        <th width=\"180\" scope=\"col\">书名</th>\n");
      out.write("        <th width=\"131\" scope=\"col\">作者</th>\n");
      out.write("        <th width=\"122\" scope=\"col\">出版社</th>\n");
      out.write("        <th width=\"85\" scope=\"col\">价格</th>\n");
      out.write("        <th width=\"65\" scope=\"col\">数量</th>\n");
      out.write("        <th width=\"83\" scope=\"col\">&nbsp;</th>\n");
      out.write("    </tr>\n");
      out.write("    <form name=\"shoppingForm\" method=\"post\" action=\"/Chapter12/ShoppingServlet\">\n");
      out.write("    <tr align=\"center\" valign=\"middle\">\n");
      out.write("        <td>Java编程思想</td>\n");
      out.write("        <td> 侯捷</td>\n");
      out.write("        <td>机械工业出版社</td>\n");
      out.write("        <td>99</td>    \n");
      out.write("        <td><input type=\"textfield\" name=\"quantity\" value=\"1\" size=\"3\"> </td>\n");
      out.write("        <td><input type=\"submit\" name=\"Submit\" value=\"购买\"></td>    \n");
      out.write("    </tr>\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"Java编程思想\">\n");
      out.write("        <input type=\"hidden\" name=\"author\" value=\"侯捷\">\n");
      out.write("        <input type=\"hidden\" name=\"publisher\" value=\"机械\">\n");
      out.write("        <input type=\"hidden\" name=\"price\" value=\"99\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"ADD\">\n");
      out.write("    </form>\n");
      out.write("    <form name=\"shoppingForm\" method=\"post\" action=\"/Chapter12/ShoppingServlet\">\n");
      out.write("    <tr align=\"center\" valign=\"middle\">\n");
      out.write("        <td>Java Applet编程实例</td>\n");
      out.write("        <td>何梅</td>\n");
      out.write("        <td>清华大学出版社</td>\n");
      out.write("        <td>36</td>  \n");
      out.write("        <td><input type=\"textfield\" name=\"quantity\" value=\"1\" size=\"3\"> </td>\n");
      out.write("        <td><input type=\"submit\" name=\"Submit\" value=\"购买\"></td>    \n");
      out.write("    </tr>\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"Java Applet编程实例\">\n");
      out.write("\t<input type=\"hidden\" name=\"author\" value=\"何梅\">\n");
      out.write("\t<input type=\"hidden\" name=\"publisher\" value=\"清华\">\n");
      out.write("\t<input type=\"hidden\" name=\"price\" value=\"36\">\n");
      out.write("\t<input type=\"hidden\" name=\"action\" value=\"ADD\">\n");
      out.write("    </form>\n");
      out.write("    <form name=\"shoppingForm\" method=\"post\" action=\"/Chapter12/ShoppingServlet\">\n");
      out.write("    <tr align=\"center\" valign=\"middle\">\n");
      out.write("        <td>JSP基础教程</td>\n");
      out.write("        <td>耿祥义</td>\n");
      out.write("        <td>清华大学出版社</td>\n");
      out.write("        <td>22</td>\n");
      out.write("        <td><input type=\"textfield\" name=\"quantity\" value=\"1\" size=\"3\"> </td>\n");
      out.write("        <td><input type=\"submit\" name=\"Submit\" value=\"购买\"></td>    \n");
      out.write("    </tr>\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"JSP基础教程\">\n");
      out.write("        <input type=\"hidden\" name=\"author\" value=\"耿祥\">\n");
      out.write("        <input type=\"hidden\" name=\"publisher\" value=\"清华\">\n");
      out.write("        <input type=\"hidden\" name=\"price\" value=\"22\">\n");
      out.write("        <input type=\"hidden\" name=\"action\" value=\"ADD\">\n");
      out.write("    </form>\n");
      out.write("    <form name=\"shoppingForm\" method=\"post\" action=\"/Chapter12/ShoppingServlet\">\n");
      out.write("    <tr align=\"center\" valign=\"middle\">\n");
      out.write("        <td>JSP高级开发与应用</td>\n");
      out.write("        <td>David</td>\n");
      out.write("        <td>科学出版社</td>\n");
      out.write("        <td>42</td>\n");
      out.write("        <td><input type=\"textfield\" name=\"quantity\" value=\"1\" size=\"3\"> </td>\n");
      out.write("        <td><input type=\"submit\" name=\"Submit\" value=\"购买\"></td>    \n");
      out.write("    </tr>\n");
      out.write("        <input type=\"hidden\" name=\"name\" value=\"JSP高级开发与应用\">\n");
      out.write("\t<input type=\"hidden\" name=\"author\" value=\"David\">\n");
      out.write("\t<input type=\"hidden\" name=\"publisher\" value=\"科学\">\n");
      out.write("\t<input type=\"hidden\" name=\"price\" value=\"42\">\n");
      out.write("\t<input type=\"hidden\" name=\"action\" value=\"ADD\">\n");
      out.write("    </form>  \n");
      out.write("</table>\n");
      out.write("<form name=\"checkoutForm\" method=\"post\" action=\"/Chapter12/ShoppingServlet\">\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"结帐\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"CHECKOUT\">\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
