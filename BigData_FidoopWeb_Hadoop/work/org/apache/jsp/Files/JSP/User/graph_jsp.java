package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import ChartDirector.*;
import java.sql.*;
import com.util.*;
import com.Fidoop.DAOFactory.PoolingDAO;
import java.util.*;

public final class graph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write(";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String name=session.getAttribute("userid").toString();

	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!--[if !IE]><!-->\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\r\n");
      out.write("\t/* \r\n");
      out.write("\tMax width before this PARTICULAR table gets nasty\r\n");
      out.write("\tThis query will take effect for any screen smaller than 760px\r\n");
      out.write("\tand also iPads specifically.\r\n");
      out.write("\t*/\r\n");
      out.write("\t@media \r\n");
      out.write("\tonly screen and (max-width: 760px),\r\n");
      out.write("\t(min-device-width: 768px) and (max-device-width: 1024px)  {\r\n");
      out.write("\t\r\n");
      out.write("\t\t/* Force table to not be like tables anymore */\r\n");
      out.write("\t\ttable, thead, tbody, th, td, tr { \r\n");
      out.write("\t\t\tdisplay: block; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* Hide table headers (but not display: none;, for accessibility) */\r\n");
      out.write("\t\tthead tr { \r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\ttop: -9999px;\r\n");
      out.write("\t\t\tleft: -9999px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttr { border: 1px solid #ccc; }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttd { \r\n");
      out.write("\t\t\t/* Behave  like a \"row\" */\r\n");
      out.write("\t\t\tborder: none;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid #eee; \r\n");
      out.write("\t\t\tposition: relative;\r\n");
      out.write("\t\t\tpadding-left: 50%; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttd:before { \r\n");
      out.write("\t\t\t/* Now like a table header */\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t/* Top/left values mimic padding */\r\n");
      out.write("\t\t\ttop: 6px;\r\n");
      out.write("\t\t\tleft: 6px;\r\n");
      out.write("\t\t\twidth: 45%; \r\n");
      out.write("\t\t\tpadding-right: 10px; \r\n");
      out.write("\t\t\twhite-space: nowrap;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*\r\n");
      out.write("\t\tLabel the data\r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\ttd:nth-of-type(1):before { content: \"First Name\"; }\r\n");
      out.write("\t\ttd:nth-of-type(2):before { content: \"Last Name\"; }\r\n");
      out.write("\t\ttd:nth-of-type(3):before { content: \"Job Title\"; }\r\n");
      out.write("\t\ttd:nth-of-type(4):before { content: \"Favorite Color\"; }\r\n");
      out.write("\t\ttd:nth-of-type(5):before { content: \"Wars of Trek?\"; }\r\n");
      out.write("\t\ttd:nth-of-type(6):before { content: \"Porn Name\"; }\r\n");
      out.write("\t\ttd:nth-of-type(7):before { content: \"Date of Birth\"; }\r\n");
      out.write("\t\ttd:nth-of-type(8):before { content: \"Dream Vacation City\"; }\r\n");
      out.write("\t\ttd:nth-of-type(9):before { content: \"GPA\"; }\r\n");
      out.write("\t\ttd:nth-of-type(10):before { content: \"Arbitrary Data\"; }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Smartphones (portrait and landscape) ----------- */\r\n");
      out.write("\t@media only screen\r\n");
      out.write("\tand (min-device-width : 320px)\r\n");
      out.write("\tand (max-device-width : 480px) {\r\n");
      out.write("\t\tbody { \r\n");
      out.write("\t\t\tpadding: 0; \r\n");
      out.write("\t\t\tmargin: 0; \r\n");
      out.write("\t\t\twidth: 320px; }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* iPads (portrait and landscape) ----------- */\r\n");
      out.write("\t@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {\r\n");
      out.write("\t\tbody { \r\n");
      out.write("\t\t\twidth: 495px; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"tablecss/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

// The data for the bar chart
HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
map=PoolingDAO.getgraphdata();
double[] data={0,0};	
String[] labels = {"", ""};
if(map.size()>0)
{
	  
   for(Map.Entry m4:map.entrySet())  
    {
	   ArrayList<String> list1=new ArrayList<String>();
  	   m4.getKey();
  	  String values = m4.getValue().toString();
     
  	  String first=values.replace("[", "").replace("]", "");
  	  String a[]=first.split("~~");
  	  if(a[1].equals("FP-Growth"))
  	  {
  		data[0]=Double.parseDouble(a[4]) ; 
  		labels[0]=a[1];
  	  }
  	 if(a[1].equals("FIUT Algorithm"))
 	  {
 		data[1]=Double.parseDouble(a[4]) ; 
 		labels[1]=a[1];
 	  }
  	

    }
}

 

// The labels for the bar chart


// Create a XYChart object of size 600 x 380 pixels. Set background color to brushed silver, with a
// 2 pixel 3D border. Use rounded corners of 20 pixels radius.
XYChart c = new XYChart(600, 380, Chart.brushedSilverColor(), Chart.Transparent, 2);

// Add a title to the chart using 18pt Times Bold Italic font. Set top/bottom margins to 8 pixels.
c.addTitle("FIUT V/s FP-Growth", "Times New Roman Bold Italic", 18).setMargin2(0, 0, 8, 8)
    ;

// Set the plotarea at (70, 55) and of size 460 x 280 pixels. Use transparent border and black grid
// lines. Use rounded frame with radius of 20 pixels.
c.setPlotArea(70, 55, 460, 280, -1, -1, Chart.Transparent, 0x000000);
c.setRoundedFrame(0xffffff, 20);

// Add a multi-color bar chart layer using the supplied data. Set cylinder bar shape.
c.addBarLayer3(data).setBarShape(Chart.CircleShape);

// Set the labels on the x axis.
c.xAxis().setLabels(labels);

// Show the same scale on the left and right y-axes
c.syncYAxis();

// Set the left y-axis and right y-axis title using 10pt Arial Bold font
c.yAxis().setTitle("Time in seconds", "Arial Bold", 10);
c.yAxis2().setTitle("Time in seconds", "Arial Bold", 10);

// Set y-axes to transparent
c.yAxis().setColors(Chart.Transparent);
c.yAxis2().setColors(Chart.Transparent);

// Disable ticks on the x-axis by setting the tick color to transparent
c.xAxis().setTickColor(Chart.Transparent);

// Set the label styles of all axes to 8pt Arial Bold font
c.xAxis().setLabelStyle("Arial Bold", 8);
c.yAxis().setLabelStyle("Arial Bold", 8);
c.yAxis2().setLabelStyle("Arial Bold", 8);

// Output the chart
String chart1URL = c.makeSession(request, "chart1", Chart.JPG);

// Include tool tip for the chart
String imageMap1 = c.getHTMLImageMap("", "", "title='Year {xLabel}: US$ {value}M'");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body style=\"margin:5px 0px 0px 5px\">\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userheader.jsp", out, false);
      out.write(" \r\n");
      out.write("        <div id=\"post_header\" class=\"container\" style=\"height:440px\">\r\n");
      out.write("         <div id=\"content-top-border\" class=\"container\">\r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"table-title\">\r\n");
      out.write("<h3></h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr color=\"#000080\">\r\n");
      out.write("\r\n");
      out.write(" <div id=\"content\">\r\n");
      out.write("                <div class=\"container background-white\">\r\n");
      out.write("                    <div class=\"row margin-vert-30\">\r\n");
      out.write("                        <!-- Register Box -->\r\n");
      out.write("                        <div class=\"col-md-6 col-md-offset-3 col-sm-offset-3\">\r\n");
      out.write("                       <img src='");
      out.print(response.encodeURL("getchart.jsp?"+chart1URL));
      out.write("'\r\n");
      out.write("    usemap=\"#map1\" border=\"0\">\r\n");
      out.write("<map name=\"map1\">");
      out.print(imageMap1);
      out.write("</map>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Register Box -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
