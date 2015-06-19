package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import myBeans.BookBean;

public final class Checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>结帐信息</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>结帐信息</h1>\n");
      out.write("<table>\n");
      out.write("<tr align=\"center\" valign=\"middle\" bgcolor=\"#CCCCCC\">\n");
      out.write("    <th width=\"180\" scope=\"col\">书名</th>\n");
      out.write("    <th width=\"131\" scope=\"col\">作者</th>\n");
      out.write("    <th width=\"122\" scope=\"col\">出版社</th>\n");
      out.write("    <th width=\"85\" scope=\"col\">价格</th>\n");
      out.write("    <th width=\"65\" scope=\"col\">数量</th>\n");
      out.write("</tr>\n");
 
  Vector buyList=(Vector)session.getAttribute("shoppingcart");
  for(int i=0;i<buyList.size();i++)
  {
    BookBean aBook=(BookBean)buyList.elementAt(i);

      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <th width=\"180\" scope=\"col\">");
      out.print( aBook.getName() );
      out.write("</th>\n");
      out.write("    <th width=\"131\" scope=\"col\">");
      out.print( aBook.getAuthor() );
      out.write("</th>\n");
      out.write("    <th width=\"122\" scope=\"col\">");
      out.print( aBook.getPublisher() );
      out.write("</th>\n");
      out.write("    <th width=\"85\" scope=\"col\">");
      out.print( aBook.getPrice() );
      out.write("</th>\n");
      out.write("    <th width=\"65\" scope=\"col\">");
      out.print( aBook.getQuantity() );
      out.write("</th>\n");
      out.write("  </tr>\n");

  }

      out.write("\t\n");
      out.write("</table>\n");
      out.write("<h2>总金额为：");
      out.print( session.getAttribute("amount") );
      out.write("\n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"/Chapter12/Shopping.jsp\">\n");
      out.write("  <input type=\"submit\" name=\"Submit2\" value=\"继续购物\">\n");
      out.write("</form>\n");
      out.write("<p>&nbsp;</p>\n");
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
