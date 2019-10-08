package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_menu_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_menu_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_menu_import_url_nobody.release();
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"./css/estilo.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      if (_jspx_meth_menu_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("         \n");
      out.write("        <!-- espaco entre menu e o conteudo-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"espaco row \">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- form login -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"card col-md-4\" style=\"width:400px\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"download.jpg\" alt=\"Card image\" style=\"width:100%\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\">John Doe</h4>\n");
      out.write("                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">See Profile</a>\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\">Email: </label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\">Senha: </label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"pwd\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Logar</button>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-md-4\" style=\"width:400px\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"download.jpg\" alt=\"Card image\" style=\"width:100%\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h4 class=\"card-title\">John Doe</h4>\n");
      out.write("                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">See Profile</a>\n");
      out.write("                    </div>                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <!-- Js boostrap -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper</.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_menu_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_menu_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_menu_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_menu_import_0.setPageContext(_jspx_page_context);
    _jspx_th_menu_import_0.setParent(null);
    _jspx_th_menu_import_0.setUrl("menu.jsp");
    int[] _jspx_push_body_count_menu_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_menu_import_0 = _jspx_th_menu_import_0.doStartTag();
      if (_jspx_th_menu_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_menu_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_menu_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_menu_import_0.doFinally();
      _jspx_tagPool_menu_import_url_nobody.reuse(_jspx_th_menu_import_0);
    }
    return false;
  }
}
