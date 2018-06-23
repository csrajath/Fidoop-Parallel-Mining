<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="java.io.*" %>
    
<%@ page import="com.util.*" %>
<%@ page import="com.Fidoop.DAOFactory.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	
	
	
	
	 HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
  	map_tclaim=PoolingDAO.getgraphdata();
  	
  
  	if(map_tclaim.size()>0)
    	{
     	  
        for(Map.Entry m4:map_tclaim.entrySet())  
        {
      	  m4.getKey();
      	  String values = m4.getValue().toString();

      	  String first=values.replace("[", "").replace("]", "");
      	 String a[]=first.split("~~");
      	
        }
    	}
	
	
	
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
<body>
 <jsp:include page='userheader.jsp'/>  
        <div id="post_header" class="container" style="height:440px">
        <div class="table-title">
<h3></h3>
</div>
   


<div id="page-wrap">

	<table>
		<thead>
		<tr>
	    <th>Slno</th>
		<th>Algorithm</th>
		<th>No of records</th>
		<th>Support</th>
		<th>time</th>
		
		
			
		</tr>
		</thead>
		<tbody>
	
			<%
		 	if(map_tclaim.size()>0)
	    	{
	     	  
	        for(Map.Entry m4:map_tclaim.entrySet())  
	        {
	      	  m4.getKey();
	      	  String values = m4.getValue().toString();

	      	  String first=values.replace("[", "").replace("]", "");
	      	 String a[]=first.split("~~");%>
			<tr>
				
				
						<td><%=a[0] %></td>
						<td><%=a[1] %></td>
						<td><%=a[2] %></td>
						<td><%=a[3] %></td>
						<td><%=a[4] %></td>
						
					
			</tr>
		<%}
	}
	%>
			
		
		
		
		</tbody>
	</table>
	
	</div>


     
        
        </div>
</body>
</html>