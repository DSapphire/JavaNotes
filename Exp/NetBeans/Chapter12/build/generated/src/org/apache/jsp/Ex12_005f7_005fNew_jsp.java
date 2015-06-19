package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex12_005f7_005fNew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/NewExample.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_testTag_newexample_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_testTag_newexample_range_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_testTag_newexample_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_testTag_newexample_range_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_testTag_newexample_nobody.release();
    _jspx_tagPool_testTag_newexample_range_nobody.release();
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
      if (_jspx_meth_testTag_newexample_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <UL>\n");
      out.write("        <Br>使用默认范围：");
      if (_jspx_meth_testTag_newexample_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <Br>1000以内：");
      if (_jspx_meth_testTag_newexample_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <Br>10000以内：");
      if (_jspx_meth_testTag_newexample_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </UL>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_testTag_newexample_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:newexample
    tags.NewExampleTag _jspx_th_testTag_newexample_0 = (tags.NewExampleTag) _jspx_tagPool_testTag_newexample_nobody.get(tags.NewExampleTag.class);
    _jspx_th_testTag_newexample_0.setPageContext(_jspx_page_context);
    _jspx_th_testTag_newexample_0.setParent(null);
    int _jspx_eval_testTag_newexample_0 = _jspx_th_testTag_newexample_0.doStartTag();
    if (_jspx_th_testTag_newexample_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_newexample_nobody.reuse(_jspx_th_testTag_newexample_0);
    return false;
  }

  private boolean _jspx_meth_testTag_newexample_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:newexample
    tags.NewExampleTag _jspx_th_testTag_newexample_1 = (tags.NewExampleTag) _jspx_tagPool_testTag_newexample_nobody.get(tags.NewExampleTag.class);
    _jspx_th_testTag_newexample_1.setPageContext(_jspx_page_context);
    _jspx_th_testTag_newexample_1.setParent(null);
    int _jspx_eval_testTag_newexample_1 = _jspx_th_testTag_newexample_1.doStartTag();
    if (_jspx_th_testTag_newexample_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_newexample_nobody.reuse(_jspx_th_testTag_newexample_1);
    return false;
  }

  private boolean _jspx_meth_testTag_newexample_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:newexample
    tags.NewExampleTag _jspx_th_testTag_newexample_2 = (tags.NewExampleTag) _jspx_tagPool_testTag_newexample_range_nobody.get(tags.NewExampleTag.class);
    _jspx_th_testTag_newexample_2.setPageContext(_jspx_page_context);
    _jspx_th_testTag_newexample_2.setParent(null);
    _jspx_th_testTag_newexample_2.setRange("1000");
    int _jspx_eval_testTag_newexample_2 = _jspx_th_testTag_newexample_2.doStartTag();
    if (_jspx_th_testTag_newexample_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_newexample_range_nobody.reuse(_jspx_th_testTag_newexample_2);
    return false;
  }

  private boolean _jspx_meth_testTag_newexample_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  testTag:newexample
    tags.NewExampleTag _jspx_th_testTag_newexample_3 = (tags.NewExampleTag) _jspx_tagPool_testTag_newexample_range_nobody.get(tags.NewExampleTag.class);
    _jspx_th_testTag_newexample_3.setPageContext(_jspx_page_context);
    _jspx_th_testTag_newexample_3.setParent(null);
    _jspx_th_testTag_newexample_3.setRange("10000");
    int _jspx_eval_testTag_newexample_3 = _jspx_th_testTag_newexample_3.doStartTag();
    if (_jspx_th_testTag_newexample_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_testTag_newexample_range_nobody.reuse(_jspx_th_testTag_newexample_3);
    return false;
  }
}
