package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <!--<![endif]-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title>Lifestyle - Professional Bootstrap Template</title>\r\n");
      out.write("        <!-- Meta -->\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"favicon.ico\" rel=\"shortcut icon\">\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Template CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nexus.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Google Fonts-->\r\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=PT+Sans\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Roboto:400,300\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"body-bg\">\r\n");
      out.write("           \r\n");
      out.write("            <div id=\"pre-header\" class=\"container\" style=\"height: 40px\">\r\n");
      out.write("                <!-- Spacing above header -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <!-- Logo -->\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <a href=\"index.jsp\" title=\"\">\r\n");
      out.write("                                <img src=\"assets/img/logo.png\" alt=\"Logo\" />\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Logo -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("            <!-- End Top Menu -->\r\n");
      out.write("            <div id=\"post_header\" class=\"container\" style=\"height: 40px\">\r\n");
      out.write("                <!-- Spacing below header -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"content-top-border\" class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- === END HEADER === -->\r\n");
      out.write("            <!-- === BEGIN CONTENT === -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div class=\"container background-white\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row margin-vert-30\">\r\n");
      out.write("                            <!-- Login Box -->\r\n");
      out.write("                            <div class=\"col-md-6 col-md-offset-3 col-sm-offset-3\">\r\n");
      out.write("                                <form class=\"login-page\"  method=\"post\" id=\"login\" action=\"");
      out.print(request.getContextPath() );
      out.write("/UserLogin\">\r\n");
      out.write("                                    <div class=\"login-header margin-bottom-30\">\r\n");
      out.write("                                        <h2>Admin Login</h2>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-group margin-bottom-20\">\r\n");
      out.write("                                        <span class=\"input-group-addon\">\r\n");
      out.write("                                            <i class=\"fa fa-user\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <input placeholder=\"Username\" class=\"form-control\" type=\"text\" name=\"name\" required=\"required\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-group margin-bottom-20\">\r\n");
      out.write("                                        <span class=\"input-group-addon\">\r\n");
      out.write("                                            <i class=\"fa fa-lock\"></i>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <input placeholder=\"Password\" class=\"form-control\" type=\"password\" name=\"pass\" required=\"required\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <label class=\"checkbox\">\r\n");
      out.write("                                                <input type=\"checkbox\">Stay signed in</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-6\">\r\n");
      out.write("                                            <button class=\"btn btn-primary pull-right\" type=\"submit\">Login</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <hr>\r\n");
      out.write("                                   \r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Login Box -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- === END CONTENT === -->\r\n");
      out.write("            <!-- === BEGIN FOOTER === -->\r\n");
      out.write("            <div id=\"content-bottom-border\" class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("            <!-- End Footer Menu -->\r\n");
      out.write("            <!-- JS -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("            <!-- Isotope - Portfolio Sorting -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/jquery.isotope.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <!-- Mobile Menu - Slicknav -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/jquery.slicknav.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <!-- Animate on Scroll-->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/jquery.visible.js\" charset=\"utf-8\"></script>\r\n");
      out.write("            <!-- Sticky Div -->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/jquery.sticky.js\" charset=\"utf-8\"></script>\r\n");
      out.write("            <!-- Slimbox2-->\r\n");
      out.write("            <script type=\"text/javascript\" src=\"assets/js/slimbox2.js\" charset=\"utf-8\"></script>\r\n");
      out.write("            <!-- Modernizr -->\r\n");
      out.write("            <script src=\"assets/js/modernizr.custom.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <!-- End JS -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
