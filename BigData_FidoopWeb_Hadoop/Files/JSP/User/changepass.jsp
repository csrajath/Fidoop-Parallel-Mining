<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

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
 <script type="text/javascript">
 function validate()
 {
   var a=documents.forms["pass"]["cpass"].value;
   var b=documents.forms["pass"]["npass"].value;
   if(!(a==b))
   {
     alert("both passwords are not matching");
     return false;
   }
   return true;
 }
 
 </script>
</head>
<body>
 <jsp:include page='userheader.jsp'/> 
        <div id="post_header" class="container" style="height:440px">
         <div id="content-top-border" class="container">
            </div>
        <div class="table-title">
<h3></h3>
</div>
   
 <div id="content">
                <div class="container background-white">
                    <div class="row margin-vert-30">
                        <!-- Register Box -->
                        <div class="col-md-6 col-md-offset-3 col-sm-offset-3">
                                <form class="login-page"  method="get" id="pass" name="pass" action="<%=request.getContextPath() %>/ChangePass">
                                 <input type="hidden" name="submit" value="update">
                                    <div class="login-header margin-bottom-30">
                                        <h2>Change Password </h2>
                                    </div>
                                    <div class="input-group margin-bottom-20">
                                        <span class="input-group-addon">
                                            <i class="fa fa-user"></i>
                                        </span>
                                        <input placeholder="Current Password" class="form-control" type="text" name="cpass" required="required">
                                    </div>
                                    <div class="input-group margin-bottom-20">
                                        <span class="input-group-addon">
                                            <i class="fa fa-lock"></i>
                                        </span>
                                        <input placeholder="New Password" class="form-control" type="text" name="npass" required="required">
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            
                                               
                                        </div>
                                        <div class="col-md-6">
                                            <button class="btn btn-primary pull-right" type="submit" onclick="validate();">Update</button>
                                        </div>
                                    </div>
                                    <hr>
                                   
                                </form>
                            </div>
                        <!-- End Register Box -->
                    </div>
                </div>
            </div>




     
        
        </div>
        
         <%   if(Utility.parse(request.getParameter("no"))==1)
    {%>
    	<script type="text/javascript">
    	alert('Password Changed Successfully')
    	
    	</script>		
    <%}%>
    <%   if(Utility.parse(request.getParameter("no"))==2)
    {%>
    	<script type="text/javascript">
    	alert('Password Change Failure....!')
    	
    	</script>		
    <%}%>
        
</body>
</html>