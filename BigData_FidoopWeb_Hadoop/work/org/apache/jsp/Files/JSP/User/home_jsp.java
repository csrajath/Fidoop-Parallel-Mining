package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
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
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userheader.jsp", out, false);
      out.write(" \r\n");
      out.write("        <div id=\"post_header\" class=\"container\" style=\"height:340px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"content-top-border\" class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- === END HEADER === -->\r\n");
      out.write("            <!-- === BEGIN CONTENT === -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div class=\"container no-padding\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <!-- Carousel Slideshow -->\r\n");
      out.write("                        <div id=\"carousel-example\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <!-- Carousel Indicators -->\r\n");
      out.write("                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#carousel-example\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#carousel-example\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#carousel-example\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                            <div class=\"clearfix\"></div>\r\n");
      out.write("                            <!-- End Carousel Indicators -->\r\n");
      out.write("                            <!-- Carousel Images -->\r\n");
      out.write("                            <div class=\"carousel-inner\">\r\n");
      out.write("                                <div class=\"item active\">\r\n");
      out.write("                                    <img src=\"assets/img/slideshow/slide1.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img src=\"assets/img/slideshow/slide2.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img src=\"assets/img/slideshow/slide3.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img src=\"assets/img/slideshow/slide4.jpg\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Carousel Images -->\r\n");
      out.write("                            <!-- Carousel Controls -->\r\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#carousel-example\" data-slide=\"prev\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#carousel-example\" data-slide=\"next\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- End Carousel Controls -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Carousel Slideshow -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container background-gray-lighter\">\r\n");
      out.write("                    <div class=\"row margin-vert-40\">\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <i class=\"fa-clock-o fa-5x color-primary\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8\">\r\n");
      out.write("                                <h2 class=\"margin-top-5 margin-bottom-0\">3,474.5</h2>\r\n");
      out.write("                                <p>WORKING HOURS</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <i class=\"fa-tachometer fa-5x color-primary\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8\">\r\n");
      out.write("                                <h2 class=\"margin-top-5 margin-bottom-0\">3,474.5</h2>\r\n");
      out.write("                                <p>WORKING HOURS</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"col-md-4\">\r\n");
      out.write("                                <i class=\"fa-users fa-5x color-primary\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8\">\r\n");
      out.write("                                <h2 class=\"margin-top-5 margin-bottom-0\">3,474.5</h2>\r\n");
      out.write("                                <p>WORKING HOURS</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container background-white\">\r\n");
      out.write("                    <div class=\"row margin-vert-30\">\r\n");
      out.write("                        <!-- Main Text -->\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <h2 class=\"text-center\">Welcome to FIDOOP</h2>\r\n");
      out.write("                            <p class=\"text-center\">Existing parallel mining algorithms for frequent\r\n");
      out.write("itemsets lack a mechanism that enables automatic parallelization,\r\n");
      out.write("load balancing, data distribution, and fault tolerance on\r\n");
      out.write("large clusters. As a solution to this problem, we design a parallel\r\n");
      out.write("frequent itemsets mining algorithm called FiDoop using\r\n");
      out.write("the MapReduce programming model. To achieve compressed\r\n");
      out.write("storage and avoid building conditional pattern bases, FiDoop\r\n");
      out.write("incorporates the frequent items ultrametric tree, rather than\r\n");
      out.write("conventional FP trees. </p>\r\n");
      out.write("                            <p class=\"text-center\">In FiDoop, three MapReduce jobs are\r\n");
      out.write("implemented to complete the mining task. In the crucial third\r\n");
      out.write("MapReduce job, the mappers independently decompose itemsets,\r\n");
      out.write("the reducers perform combination operations by constructing\r\n");
      out.write("small ultrametric trees, and the actual mining of these trees\r\n");
      out.write("separately. We implement FiDoop on our in-house Hadoop cluster.\r\n");
      out.write("We show that FiDoop on the cluster is sensitive to data\r\n");
      out.write("distribution and dimensions, because itemsets with different\r\n");
      out.write("lengths have different decomposition and construction costs. To\r\n");
      out.write("improve FiDoopâs performance, we develop a workload balance\r\n");
      out.write("metric to measure load balance across the clusterâs computing\r\n");
      out.write("nodes. We develop FiDoop-HD, an extension of FiDoop,\r\n");
      out.write("to speed up the mining performance for high-dimensional data\r\n");
      out.write("analysis. Extensive experiments using real-world celestial spectral\r\n");
      out.write("data demonstrate that our proposed solution is efficient and\r\n");
      out.write("scalable.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Main Text -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container background-gray-lighter\">\r\n");
      out.write("                    <div class=\"row padding-vert-20\">\r\n");
      out.write("                        <div class=\"col-md-1\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-10\">\r\n");
      out.write("                            <!-- Portfolio -->\r\n");
      out.write("                            <ul class=\"portfolio-group\">\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInLeft\">\r\n");
      out.write("                                            <img alt=\"image1\" src=\"assets/img/frontpage/fptree.png\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>FP Tree</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInRight\">\r\n");
      out.write("                                            <img alt=\"image2\" src=\"assets/img/frontpage/image2.jpg\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>Placerat facer possim</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInLeft\">\r\n");
      out.write("                                            <img alt=\"image3\" src=\"assets/img/frontpage/image3.jpg\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>Placerat facer possim</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInRight\">\r\n");
      out.write("                                            <img alt=\"image4\" src=\"assets/img/frontpage/image4.jpg\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>Placerat facer possim</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInLeft\">\r\n");
      out.write("                                            <img alt=\"image5\" src=\"assets/img/frontpage/image5.jpg\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>Placerat facer possim</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                                <!-- Portfolio Item -->\r\n");
      out.write("                                <li class=\"portfolio-item col-sm-6 col-xs-6 padding-20\">\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <figure class=\"animate fadeInRight\">\r\n");
      out.write("                                            <img alt=\"image6\" src=\"assets/img/frontpage/image6.jpg\">\r\n");
      out.write("                                            <figcaption>\r\n");
      out.write("                                                <h3>Placerat facer possim</h3>\r\n");
      out.write("                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>\r\n");
      out.write("                                            </figcaption>\r\n");
      out.write("                                        </figure>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- //Portfolio Item// -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- End Portfolio -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-1\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- === END CONTENT === -->\r\n");
      out.write("            <!-- === BEGIN FOOTER === -->\r\n");
      out.write("            <div id=\"content-bottom-border\" class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <!-- Footer Menu -->\r\n");
      out.write("           \r\n");
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
      out.write("             ");
   if(Utility.parse(request.getParameter("no"))==1)
    {
      out.write("\r\n");
      out.write("    \t<script type=\"text/javascript\">\r\n");
      out.write("    \talert('Tables Truncated Successfully')\r\n");
      out.write("    \t\r\n");
      out.write("    \t</script>\t\t\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("    ");
   if(Utility.parse(request.getParameter("no"))==2)
    {
      out.write("\r\n");
      out.write("    \t<script type=\"text/javascript\">\r\n");
      out.write("    \talert('Tables Truncated  Failure....!')\r\n");
      out.write("    \t\r\n");
      out.write("    \t</script>\t\t\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("            \r\n");
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
