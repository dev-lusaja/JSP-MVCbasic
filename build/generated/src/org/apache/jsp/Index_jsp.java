package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_u_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_u_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_u_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("    <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      if (_jspx_meth_u_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_u_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <div class=\"helper\"><!-- \n");
      out.write("    --></div>\n");
      out.write("    <div class=\"trans\">\n");
      out.write("        <form action=\"loginusuarios.do\" method=\"post\">\n");
      out.write("            <center><p class=\"login_text login_title\">Sistema de acceso</p></center>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <div class=\"input-group-addon\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span></div>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"usuario\" name=\"usuario\" placeholder=\"usuario\" required>\n");
      out.write("                    </div>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <div class=\"input-group-addon\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-asterisk\" aria-hidden=\"true\"></span></div>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"clave\" name=\"clave\" placeholder=\"*******\" required>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <input id=\"VentanaLogin_LoginButton\" class=\"btn btn-success\" type=\"submit\" value=\"INGRESAR\" name=\"Ventanalogin$LoginButton\"></input>\n");
      out.write("            </div>  \t\t\t\n");
      out.write("            <div class=\"div_register\">\t\t  \t\t\t\t\n");
      out.write("                <p class=\"login_text\">Si no dispones de una cuenta . .</p>\n");
      out.write("                <a href=\"Registrarse.jsp\" class=\"btn btn-danger\" type=\"submit\">REGISTRATE</a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <p class=\"test\">tambien puedes mirar los usuarios de <a  class=\"btn btn-info\" href=\"listarusuarios.do\">Prueba</a></p>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_u_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_u_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_u_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_u_if_0.setPageContext(_jspx_page_context);
    _jspx_th_u_if_0.setParent(null);
    _jspx_th_u_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_u_if_0 = _jspx_th_u_if_0.doStartTag();
    if (_jspx_eval_u_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\n");
        out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
        out.write("            <strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</strong>\n");
        out.write("        </div>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_u_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_u_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_if_test.reuse(_jspx_th_u_if_0);
      return true;
    }
    _jspx_tagPool_u_if_test.reuse(_jspx_th_u_if_0);
    return false;
  }

  private boolean _jspx_meth_u_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  u:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_u_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_u_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_u_if_1.setPageContext(_jspx_page_context);
    _jspx_th_u_if_1.setParent(null);
    _jspx_th_u_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje_error != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_u_if_1 = _jspx_th_u_if_1.doStartTag();
    if (_jspx_eval_u_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <div class=\"alert alert-danger alert-dismissible\" role=\"alert\">\n");
        out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
        out.write("            <strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje_error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</strong>\n");
        out.write("        </div>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_u_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_u_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_u_if_test.reuse(_jspx_th_u_if_1);
      return true;
    }
    _jspx_tagPool_u_if_test.reuse(_jspx_th_u_if_1);
    return false;
  }
}
