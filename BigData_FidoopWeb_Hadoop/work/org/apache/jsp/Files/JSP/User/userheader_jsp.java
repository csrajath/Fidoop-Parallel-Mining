package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("  <!-- Title -->\r\n");
      out.write("        <title>Privacy preserving </title>\r\n");
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
      out.write("     ");

	String user=session.getAttribute("userid").toString();
	System.out.println("user name isss "+user);

      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div id=\"body-bg\">\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"pre-header\" class=\"container\" style=\"height:40px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <!-- Logo -->\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <a href=\"index.html\" title=\"\">\r\n");
      out.write("                                <img src=\"assets/img/logo.png\" alt=\"Logo\" />\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Logo -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Top Menu -->\r\n");
      out.write("            <div id=\"hornav\" class=\"container no-padding\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12 no-padding\">\r\n");
      out.write("                        <div class=\"text-center visible-lg\">\r\n");
      out.write("                            <ul id=\"hornavmenu\" class=\"nav navbar-nav\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/Home\" class=\"fa-home\">Home</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                              \r\n");
      out.write("                                        <li class=\"parent\">\r\n");
      out.write("                                            <span>Upload</span>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/UploadFile?submit=Upload\">Upload Excel File</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                              \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"parent\">\r\n");
      out.write("                                            <span>Frequent Item Set</span>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ReadFileFromHadoop?name=");
      out.print(user );
      out.write("&amp;submit=get\">FP Tree</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                \r\n");
      out.write("                                                 <li>\r\n");
      out.write("                                                   <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ReadFileFromHadoopfiut?name=");
      out.print(user );
      out.write("&amp;submit=get\">FIUT Tree</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                               \r\n");
      out.write("                                                \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                          <li class=\"parent\">\r\n");
      out.write("                                            <span>Graph</span>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/GraphTest\">Graph1</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                \r\n");
      out.write("                                                 <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/GraphTest2\">Graph2</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                               \r\n");
      out.write("                                                \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li class=\"parent\">\r\n");
      out.write("                                            <span>Result</span>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/DownloadFP\">View FP-Growth Result</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                \r\n");
      out.write("                                                 <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/DownloadFIUT\">View FIUT Result</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                               \r\n");
      out.write("                                                \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li class=\"parent\">\r\n");
      out.write("                                            <span>Settings</span>\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePass?name=");
      out.print(user );
      out.write("&amp;submit=truncate\">Clear Table</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                \r\n");
      out.write("                                                 <li>\r\n");
      out.write("                                                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePass?name=");
      out.print(user );
      out.write("&amp;submit=get\">Change Password</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                               \r\n");
      out.write("                                                \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                       \r\n");
      out.write("                                       \r\n");
      out.write("                                \r\n");
      out.write("                               \r\n");
      out.write("                               \r\n");
      out.write("                              \r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp\" class=\"fa-comment\">SignOut</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("</body>\r\n");
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
