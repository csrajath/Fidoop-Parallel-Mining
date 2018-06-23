<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <!-- Title -->
        <title>Privacy preserving </title>
        <!-- Meta -->
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <!-- Favicon -->
        <link href="favicon.ico" rel="shortcut icon">
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="assets/css/bootstrap.css" rel="stylesheet">
        <!-- Template CSS -->
        <link rel="stylesheet" href="assets/css/animate.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/nexus.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/responsive.css" rel="stylesheet">
        <link rel="stylesheet" href="assets/css/custom.css" rel="stylesheet">
        <!-- Google Fonts-->
        <link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=PT+Sans" type="text/css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Roboto:400,300" rel="stylesheet" type="text/css">
     <%
	String user=session.getAttribute("userid").toString();
	System.out.println("user name isss "+user);
%>   
</head>
<body>
 <div id="body-bg">
            
            <div id="pre-header" class="container" style="height:40px">
            </div>
            <div id="header">
                <div class="container">
                    <div class="row">
                        <!-- Logo -->
                        <div class="logo">
                            <a href="index.html" title="">
                                <img src="assets/img/logo.png" alt="Logo" />
                            </a>
                        </div>
                        <!-- End Logo -->
                    </div>
                </div>
            </div>
            <!-- Top Menu -->
            <div id="hornav" class="container no-padding">
                <div class="row">
                    <div class="col-md-12 no-padding">
                        <div class="text-center visible-lg">
                            <ul id="hornavmenu" class="nav navbar-nav">
                                <li>
                                    <a href="<%=request.getContextPath() %>/Home" class="fa-home">Home</a>
                                </li>
                              
                                        <li class="parent">
                                            <span>Upload</span>
                                            <ul>
                                                
                                                <li>
                                                    <a href="<%=request.getContextPath() %>/UploadFile?submit=Upload">Upload Excel File</a>
                                                </li>
                                              
                                            </ul>
                                        </li>
                                        <li class="parent">
                                            <span>Frequent Item Set</span>
                                            <ul>
                                                <li>
                                                    <a href="<%=request.getContextPath() %>/ReadFileFromHadoop?name=<%=user %>&amp;submit=get">FP Tree</a>
                                                </li>
                                                
                                                 <li>
                                                   <a href="<%=request.getContextPath() %>/ReadFileFromHadoopfiut?name=<%=user %>&amp;submit=get">FIUT Tree</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                          <li class="parent">
                                            <span>Graph</span>
                                            <ul>
                                                <li>
                                                    <a href="<%=request.getContextPath() %>/GraphTest">Graph1</a>
                                                </li>
                                                
                                                 <li>
                                                    <a href="<%=request.getContextPath() %>/GraphTest2">Graph2</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                        
                                        <li class="parent">
                                            <span>Result</span>
                                            <ul>
                                                <li>
                                                    <a href="<%=request.getContextPath() %>/DownloadFP">View FP-Growth Result</a>
                                                </li>
                                                
                                                 <li>
                                                    <a href="<%=request.getContextPath() %>/DownloadFIUT">View FIUT Result</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                        
                                        <li class="parent">
                                            <span>Settings</span>
                                            <ul>
                                                <li>
                                                    <a href="<%=request.getContextPath() %>/ChangePass?name=<%=user %>&amp;submit=truncate">Clear Table</a>
                                                </li>
                                                
                                                 <li>
                                                    <a href="<%=request.getContextPath() %>/ChangePass?name=<%=user %>&amp;submit=get">Change Password</a>
                                                </li>
                                               
                                                
                                            </ul>
                                        </li>
                                       
                                       
                                
                               
                               
                              
                                <li>
                                    <a href="index.jsp" class="fa-comment">SignOut</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
</body>
</html>