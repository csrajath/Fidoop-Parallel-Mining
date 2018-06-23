<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String filenametodownload=request.getParameter("filenametodownload");
String ringsign=request.getParameter("ringsign");
String chk=session.getAttribute("chk").toString();
String result=request.getParameter("result");
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
        <div id="post_header" class="container" style="height:100%">
        <div class="table-title">
<h3></h3>
</div>
   
 <div id="content">
                <div class="container background-white">
                    <div class="row margin-vert-30">
                        <!-- Register Box -->
                        <div class="col-md-6 col-md-offset-3 col-sm-offset-3">
                            <form class="signup-page" action="<%=request.getContextPath() %>/DownloadFromHadoop">
                            	<input type="hidden" name="submit" value="Add"></input>
                            <input type="hidden" name="add1" value="YES"></input>
                                <div class="signup-header">
                                    <h2>Ring signature Verified Successfully</h2>
                                  
                                </div>
                                <label>File Name</label>
                                <input class="form-control margin-bottom-20" value=<%=filenametodownload%> type="text" name="filename" readonly="readonly">
                                <label>Uploaded Ring Signature</label>
                                <input class="form-control margin-bottom-20" value=<%=ringsign%> type="text" name="upldringsign" readonly="readonly">
                                <label></label>
                                <label>Verification Result</label>
                                <input class="form-control margin-bottom-20" value=<%=result%> type="text" name="result" readonly="readonly">
                               
                                <hr>
                                <div class="row">
                                    <div class="col-lg-8">
                                        
                                    </div>
                                    <%
                                    System.out.println("===================Res================="+result);
                                    if(result.equals("Matching"))
                                    		{%>
                                     <div class="col-lg-4 text-right">
                                        <button class="btn btn-primary" type="submit">Download File</button>
                                    </div>
                                    <%} 
                                    else if(result.equals("NotMatching"))
                                    {	
                                    %>
                                    <div class="col-lg-4 text-right">
                                        <button class="btn btn-primary" disabled="disabled" type="submit">Unable to Download File</button>
                                    </div>
                                    <%} %>
                                </div>
                            </form>
                        </div>
                        <!-- End Register Box -->
                    </div>
                </div>
            </div>




     
        
        </div>
</body>
</html>