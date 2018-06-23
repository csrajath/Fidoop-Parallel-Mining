<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="java.sql.*" %>
<%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <!--<![endif]-->
    <head>
        <!-- Title -->
        <title>Lifestyle - Professional Bootstrap Template</title>
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
    </head>
    <body>
       <jsp:include page='userheader.jsp'/> 
        <div id="post_header" class="container" style="height:340px">
            </div>
            <div id="content-top-border" class="container">
            </div>
            <!-- === END HEADER === -->
            <!-- === BEGIN CONTENT === -->
            <div id="content">
                <div class="container no-padding">
                    <div class="row">
                        <!-- Carousel Slideshow -->
                        <div id="carousel-example" class="carousel slide" data-ride="carousel">
                            <!-- Carousel Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example" data-slide-to="1"></li>
                                <li data-target="#carousel-example" data-slide-to="2"></li>
                            </ol>
                            <div class="clearfix"></div>
                            <!-- End Carousel Indicators -->
                            <!-- Carousel Images -->
                            <div class="carousel-inner">
                                <div class="item active">
                                    <img src="assets/img/slideshow/slide1.jpg">
                                </div>
                                <div class="item">
                                    <img src="assets/img/slideshow/slide2.jpg">
                                </div>
                                <div class="item">
                                    <img src="assets/img/slideshow/slide3.jpg">
                                </div>
                                <div class="item">
                                    <img src="assets/img/slideshow/slide4.jpg">
                                </div>
                            </div>
                            <!-- End Carousel Images -->
                            <!-- Carousel Controls -->
                            <a class="left carousel-control" href="#carousel-example" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>
                            <!-- End Carousel Controls -->
                        </div>
                        <!-- End Carousel Slideshow -->
                    </div>
                </div>
                <div class="container background-gray-lighter">
                    <div class="row margin-vert-40">
                        <div class="col-md-4">
                            <div class="col-md-4">
                                <i class="fa-clock-o fa-5x color-primary"></i>
                            </div>
                            <div class="col-md-8">
                                <h2 class="margin-top-5 margin-bottom-0">3,474.5</h2>
                                <p>WORKING HOURS</p>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="col-md-4">
                                <i class="fa-tachometer fa-5x color-primary"></i>
                            </div>
                            <div class="col-md-8">
                                <h2 class="margin-top-5 margin-bottom-0">3,474.5</h2>
                                <p>WORKING HOURS</p>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="col-md-4">
                                <i class="fa-users fa-5x color-primary"></i>
                            </div>
                            <div class="col-md-8">
                                <h2 class="margin-top-5 margin-bottom-0">3,474.5</h2>
                                <p>WORKING HOURS</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container background-white">
                    <div class="row margin-vert-30">
                        <!-- Main Text -->
                        <div class="col-md-12">
                            <h2 class="text-center">Welcome to FIDOOP</h2>
                            <p class="text-center">Existing parallel mining algorithms for frequent
itemsets lack a mechanism that enables automatic parallelization,
load balancing, data distribution, and fault tolerance on
large clusters. As a solution to this problem, we design a parallel
frequent itemsets mining algorithm called FiDoop using
the MapReduce programming model. To achieve compressed
storage and avoid building conditional pattern bases, FiDoop
incorporates the frequent items ultrametric tree, rather than
conventional FP trees. </p>
                            <p class="text-center">In FiDoop, three MapReduce jobs are
implemented to complete the mining task. In the crucial third
MapReduce job, the mappers independently decompose itemsets,
the reducers perform combination operations by constructing
small ultrametric trees, and the actual mining of these trees
separately. We implement FiDoop on our in-house Hadoop cluster.
We show that FiDoop on the cluster is sensitive to data
distribution and dimensions, because itemsets with different
lengths have different decomposition and construction costs. To
improve FiDoop’s performance, we develop a workload balance
metric to measure load balance across the cluster’s computing
nodes. We develop FiDoop-HD, an extension of FiDoop,
to speed up the mining performance for high-dimensional data
analysis. Extensive experiments using real-world celestial spectral
data demonstrate that our proposed solution is efficient and
scalable.</p>
                        </div>
                        <!-- End Main Text -->
                    </div>
                </div>
                <div class="container background-gray-lighter">
                    <div class="row padding-vert-20">
                        <div class="col-md-1">
                        </div>
                        <div class="col-md-10">
                            <!-- Portfolio -->
                            <ul class="portfolio-group">
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInLeft">
                                            <img alt="image1" src="assets/img/frontpage/fptree.png">
                                            <figcaption>
                                                <h3>FP Tree</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInRight">
                                            <img alt="image2" src="assets/img/frontpage/image2.jpg">
                                            <figcaption>
                                                <h3>Placerat facer possim</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInLeft">
                                            <img alt="image3" src="assets/img/frontpage/image3.jpg">
                                            <figcaption>
                                                <h3>Placerat facer possim</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInRight">
                                            <img alt="image4" src="assets/img/frontpage/image4.jpg">
                                            <figcaption>
                                                <h3>Placerat facer possim</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInLeft">
                                            <img alt="image5" src="assets/img/frontpage/image5.jpg">
                                            <figcaption>
                                                <h3>Placerat facer possim</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                                <!-- Portfolio Item -->
                                <li class="portfolio-item col-sm-6 col-xs-6 padding-20">
                                    <a href="#">
                                        <figure class="animate fadeInRight">
                                            <img alt="image6" src="assets/img/frontpage/image6.jpg">
                                            <figcaption>
                                                <h3>Placerat facer possim</h3>
                                                <span>Vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui et everti tamquam suavitate mea.</span>
                                            </figcaption>
                                        </figure>
                                    </a>
                                </li>
                                <!-- //Portfolio Item// -->
                            </ul>
                            <!-- End Portfolio -->
                        </div>
                        <div class="col-md-1">
                        </div>
                    </div>
                </div>
               
            </div>
            <!-- === END CONTENT === -->
            <!-- === BEGIN FOOTER === -->
            <div id="content-bottom-border" class="container">
            </div>
           
            <!-- Footer Menu -->
           
            <!-- End Footer Menu -->
            <!-- JS -->
            <script type="text/javascript" src="assets/js/jquery.min.js" type="text/javascript"></script>
            <script type="text/javascript" src="assets/js/bootstrap.min.js" type="text/javascript"></script>
            <script type="text/javascript" src="assets/js/scripts.js"></script>
            <!-- Isotope - Portfolio Sorting -->
            <script type="text/javascript" src="assets/js/jquery.isotope.js" type="text/javascript"></script>
            <!-- Mobile Menu - Slicknav -->
            <script type="text/javascript" src="assets/js/jquery.slicknav.js" type="text/javascript"></script>
            <!-- Animate on Scroll-->
            <script type="text/javascript" src="assets/js/jquery.visible.js" charset="utf-8"></script>
            <!-- Sticky Div -->
            <script type="text/javascript" src="assets/js/jquery.sticky.js" charset="utf-8"></script>
            <!-- Slimbox2-->
            <script type="text/javascript" src="assets/js/slimbox2.js" charset="utf-8"></script>
            <!-- Modernizr -->
            <script src="assets/js/modernizr.custom.js" type="text/javascript"></script>
            <!-- End JS -->
             <%   if(Utility.parse(request.getParameter("no"))==1)
    {%>
    	<script type="text/javascript">
    	alert('Tables Truncated Successfully')
    	
    	</script>		
    <%}%>
    <%   if(Utility.parse(request.getParameter("no"))==2)
    {%>
    	<script type="text/javascript">
    	alert('Tables Truncated  Failure....!')
    	
    	</script>		
    <%}%>
            
    </body>
</html>