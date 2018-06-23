<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="ChartDirector.*" %>
    <%@ page import="java.sql.*" %>
<%@ page import="com.util.*" %>
<%@ page import="com.Fidoop.DAOFactory.PoolingDAO"%>;
<%@ page import="java.util.*"%>


<%
String name=session.getAttribute("userid").toString();

	
%>

<link rel="stylesheet" href="css/style.css">
	
	<!--[if !IE]><!-->
	<style>
	
	/* 
	Max width before this PARTICULAR table gets nasty
	This query will take effect for any screen smaller than 760px
	and also iPads specifically.
	*/
	@media 
	only screen and (max-width: 760px),
	(min-device-width: 768px) and (max-device-width: 1024px)  {
	
		/* Force table to not be like tables anymore */
		table, thead, tbody, th, td, tr { 
			display: block; 
		}
		
		/* Hide table headers (but not display: none;, for accessibility) */
		thead tr { 
			position: absolute;
			top: -9999px;
			left: -9999px;
		}
		
		tr { border: 1px solid #ccc; }
		
		td { 
			/* Behave  like a "row" */
			border: none;
			border-bottom: 1px solid #eee; 
			position: relative;
			padding-left: 50%; 
		}
		
		td:before { 
			/* Now like a table header */
			position: absolute;
			/* Top/left values mimic padding */
			top: 6px;
			left: 6px;
			width: 45%; 
			padding-right: 10px; 
			white-space: nowrap;
		}
		
		/*
		Label the data
		*/
		td:nth-of-type(1):before { content: "First Name"; }
		td:nth-of-type(2):before { content: "Last Name"; }
		td:nth-of-type(3):before { content: "Job Title"; }
		td:nth-of-type(4):before { content: "Favorite Color"; }
		td:nth-of-type(5):before { content: "Wars of Trek?"; }
		td:nth-of-type(6):before { content: "Porn Name"; }
		td:nth-of-type(7):before { content: "Date of Birth"; }
		td:nth-of-type(8):before { content: "Dream Vacation City"; }
		td:nth-of-type(9):before { content: "GPA"; }
		td:nth-of-type(10):before { content: "Arbitrary Data"; }
	}
	
	/* Smartphones (portrait and landscape) ----------- */
	@media only screen
	and (min-device-width : 320px)
	and (max-device-width : 480px) {
		body { 
			padding: 0; 
			margin: 0; 
			width: 320px; }
		}
	
	/* iPads (portrait and landscape) ----------- */
	@media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {
		body { 
			width: 495px; 
		}
	}
	
	</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="tablecss/style.css">
</head>












<%
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
%>

<html>
<body style="margin:5px 0px 0px 5px">

<jsp:include page='userheader.jsp'/> 
        <div id="post_header" class="container" style="height:440px">
         <div id="content-top-border" class="container">
            </div>
        <div class="table-title">
<h3></h3>
</div>


<hr color="#000080">

 <div id="content">
                <div class="container background-white">
                    <div class="row margin-vert-30">
                        <!-- Register Box -->
                        <div class="col-md-6 col-md-offset-3 col-sm-offset-3">
                       <img src='<%=response.encodeURL("getchart.jsp?"+chart1URL)%>'
    usemap="#map1" border="0">
<map name="map1"><%=imageMap1%></map>
                           
                        </div>
                        <!-- End Register Box -->
                    </div>
                </div>
            </div>

        </div>




</body>
</html>
