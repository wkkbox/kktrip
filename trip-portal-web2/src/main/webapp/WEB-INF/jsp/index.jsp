<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Home</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="all">
    <!--web-font-->
    <!--<link href='http://fonts.useso.com/css?family=Playfair+Display:400,700,900,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,300,700' rel='stylesheet' type='text/css'>-->
    <!--//web-font-->
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Excursion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Custom Theme files -->
    <!-- js -->
    <script src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <!-- //js -->
    <!-- start-smoth-scrolling-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/move-top.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!--//end-smoth-scrolling-->
</head>

<body>
<!--navigation-->
<div class="top-nav">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li>
                        <a href="${pageContext.request.contextPath}" class="active">首页</a>
                    </li>
                    <li>
                        <a href="tour/scenic_inner">国内游</a>
                    </li>
                    <li>
                        <a href="tour/scenic_around">跟团游</a>
                    </li>
                    <li>
                        <a href="tour/scenic_outter">境外游</a>
                    </li>
                    <li>
                        <a href="blog.html">酒店</a>
                    </li>
                    <li>
                        <a href="tour/food_list">美食</a>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>
        </div>
    </nav>
</div>
<!--navigation-->
<!--header-->
<div class="header">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt=""></a>
        </div>
        <form class="navbar-form navbar-right" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="搜索">
            </div>
            <button type="submit" class="btn btn-default" aria-label="Left Align">
                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
            </button>
        </form>
    </div>
</div>
<!--//header-->
<div class="banner">
    <!-- banner-text Slider starts Here -->
    <script src="${pageContext.request.contextPath}/js/responsiveslides.min.js"></script>
    <script>
        // You can also use "$(window).load(function() {"
        $(function () {
            // Slideshow 4
            $("#slider3").responsiveSlides({
                auto: true,
                pager: false,
                nav: true,
                speed: 500,
                namespace: "callbacks",
                before: function () {
                    $('.events').append("<li>before event fired.</li>");
                },
                after: function () {
                    $('.events').append("<li>after event fired.</li>");
                }
            });
        });
    </script>
    <!--//End-slider-script -->
    <div class="banner-title">
        <div class="container">
            <div id="top" class="callbacks_container">
                <ul class="rslides" id="slider3">
                    <li>
                        <h5>美妙的旅行</h5>
                        <h1>来一场说走就走的旅行</h1>
                    </li>
                    <li>
                        <h5>未知的冒险</h5>
                        <h1>和小伙伴去探索未知的领域</h1>
                    </li>
                    <li>
                        <h5>意外的偶遇</h5>
                        <h1>认识新伙伴结识新朋友</h1>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
</div>
<!--国内游-->
<div class="features">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-11 column">
                <h3>
                    国内游
                </h3>
            </div>
            <div class="col-md-1 column">
                <a href="${pageContext.request.contextPath}/tour/scenic_inner">更多>></a>
            </div>
        </div>
        <div class="row">
            <c:forEach items="${requestScope.inners}" var="item">
                <div class="col-sm-6 col-md-4 featur-grids">
                    <div class="thumbnail feature-thmbnl">
                        <h4>${item.scenicAddress}</h4>
                        <img style="width: 320px;height: 220px" src="${item.scenicImage}" alt="">
                        <div class="caption">
                            <h5>${item.scenicName}</h5>
                            <a href="scenic/${item.id}" class="btn btn-primary hvr-rectangle-in">Read More</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img8.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a></h5>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                        <a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img9.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a></h5>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                        <a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <div class="clearfix"></div>
        </div>
    </div>
</div>


<!--出境游-->
<div class="features">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-11 column">
                <h3>
                    出境游
                </h3>
            </div>
            <div class="col-md-1 column">
                <a href="${pageContext.request.contextPath}/tour/scenic_outter">更多>></a>
            </div>
        </div>
        <div class="row">
            <c:forEach items="${requestScope.outters}" var="item">
                <div class="col-sm-6 col-md-4 featur-grids">
                    <div class="thumbnail feature-thmbnl">
                        <h4>${item.scenicAddress}</h4>
                        <img style="width: 320px;height: 220px" src="${item.scenicImage}" alt="">
                        <div class="caption">
                            <h5>${item.scenicName}</h5>
                            <a href="scenic/${item.id}" class="btn btn-primary hvr-rectangle-in">Read More</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img8.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a><a></a></h5><a>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                    </a><a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img9.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a><a></a></h5><a>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                    </a><a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <div class="clearfix"></div>
        </div>
    </div>
</div>


<!--跟团游-->
<div class="features">
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-11 column">
                <h3>
                    跟团游
                </h3>
            </div>
            <div class="col-md-1 column">
                <a href="${pageContext.request.contextPath}/tour/scenic_around">更多>></a>
            </div>
        </div>
        <div class="row">
            <c:forEach items="${requestScope.arounds}" var="item">
                <div class="col-sm-6 col-md-4 featur-grids">
                    <div class="thumbnail feature-thmbnl">
                        <h4>${item.scenicAddress}</h4>
                        <img style="width: 320px;height: 220px" src="${item.scenicImage}" alt="">
                        <div class="caption">
                            <h5>${item.scenicName}</h5>
                            <a href="scenic/${item.id}" class="btn btn-primary hvr-rectangle-in">Read More</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img8.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a><a></a></h5><a>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                    </a><a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <%--<div class="col-sm-6 col-md-4 featur-grids">
                <div class="thumbnail feature-thmbnl">
                    <h4>Gilla frinreet</h4>
                    <img src="images/img9.jpg" alt="">
                    <div class="caption">
                        <h5><a href="singlepage.html">Aliquam erat volutpat</a><a></a></h5><a>
                        <p>Donec vitae tellus non sem vulputate cursus. Aliquam erat volutpat. Proin ut est et sem
                            rhoncus fringilla laoreet</p>
                    </a><a href="singlepage.html" class="btn btn-primary hvr-rectangle-in">Read More</a>
                    </div>
                </div>
            </div>--%>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="container">
        <div class="col-md-4 about">
            <h3>关于我们</h3>
            <p>
                创立于1999年，总部设在中国上海，员工30000余人，目前公司已在北京、广州、深圳、成都、杭州、南京、厦门、重庆、青岛、沈阳、武汉、三亚、丽江、香港、南通17个城市设立分支机构，在南通设立服务联络中心。向超过2.5亿会员提供集无线应用、酒店预订、机票预订、旅游度假、商旅管理及旅游资讯在内的全方位旅行服务，被誉为互联网和传统旅游无缝结合的典范。
            </p>
        </div>
        <div class="col-md-4 posts">
            <h3>热门景点</h3>
            <div class="media">
                <div class="media-left">
                    <a href="singlepage.html">
                        <img class="media-object thumbnail" src="images/img11.jpg" alt="">
                    </a>
                </div>
                <div class="media-body">
                    <h4 class="media-heading">召唤师峡谷</h4>
                </div>
            </div>
            <div class="media">
                <div class="media-left">
                    <a href="singlepage.html">
                        <img class="media-object thumbnail" src="images/img10.jpg" alt="">
                    </a>
                </div>
                <div class="media-body">
                    <h4 class="media-heading">杭州西湖</h4>
                </div>
            </div>
        </div>
        <div class="col-md-4 address">
            <h3>我们的地址</h3>
            <p>总部设在中国上海，在北京、广州、成都、香港、深圳、杭州、南京、武汉、天津、西安、重庆、青岛、沈阳、厦门、昆明等多个城市设有分支机构</p>
            <ul>
                <li><span></span>中国上海</li>
                <li><span class="ph-no"></span>+00 (123) 456 78 90</li>
                <li><span class="mail"></span>
                    <a href="mailto:example@mail.com">mail@3424324e.com</a>
                </li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!--smooth-scrolling-of-move-up-->
<script type="text/javascript">
    $(document).ready(function () {
        /*
        var defaults = {
            containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear'
        };
        */

        $().UItoTop({
            easingType: 'easeOutQuart'
        });

    });
</script>
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!--//smooth-scrolling-of-move-up-->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</body>

</html>
