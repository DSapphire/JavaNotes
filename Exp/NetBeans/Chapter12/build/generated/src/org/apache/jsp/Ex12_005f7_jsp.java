package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex12_005f7_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/example.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_testTag_example_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_testTag_example_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_testTag_example_nobody.release();
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
      out.write("    \n");
      out.write("    <title>使用标签");
      if (_jspx_meth_testTag_example_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <H1>");
      if (_jspx_meth_testTag_example_1(_jspx_page_context))
        return;
      out.write("</H1>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_testTag_example_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:example
    tags.ExampleTag _jspx_th_testTag_example_0 = (tags.ExampleTag) _jspx_tagPool_testTag_example_nobody.get(tags.ExampleTag.class);
    _jspx_th_testTag_example_0.setPageContext(_jspx_page_context);
    _jspx_th_testTag_example_0.setParent(null);
    int _jspx_eval_testTag_example_0 = _jspx_th_testTag_example_0.doStartTag();
    if (_jspx_th_testTag_example_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_example_nobody.reuse(_jspx_th_testTag_example_0);
    return false;
  }

  private boolean _jspx_meth_testTag_example_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:example
    tags.ExampleTag _jspx_th_testTag_example_1 = (tags.ExampleTag) _jspx_tagPool_testTag_example_nobody.get(tags.ExampleTag.class);
    _jspx_th_testTag_example_1.setPageContext(_jspx_page_context);
    _jspx_th_testTag_example_1.setParent(null);
    int _jspx_eval_testTag_example_1 = _jspx_th_testTag_example_1.doStartTag();
    if (_jspx_th_testTag_example_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_example_nobody.reuse(_jspx_th_testTag_example_1);
    return false;
  }
}