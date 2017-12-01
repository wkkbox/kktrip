<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Tours</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/paging.css">
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="all">
    <!--web-font-->
    <!--<link href='http://fonts.useso.com/css?family=Playfair+Display:400,700,900,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,300,700' rel='stylesheet' type='text/css'>-->
    <!--//web-font-->
    <!-- Custom Theme files -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Excursion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript">
        addEventListener("load", function() {
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/paging.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ei.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 1000);
            });
        });
    </script>
    <!--//end-smoth-scrolling-->

    <script>
        $(function () {


            $("#search").click(function () {
                //alert($("#oname").val());
                //alert($("#isdeal").val());
                $("#pageToolbar").empty();
                //按条件查询
                search($("#scenicName").val().trim(), 1, 3);
            });


            //一进入页面就查询所有
            search("", 1, 3);

            function search(scenicName, currentPage, pageSize) {
                var jdata = {"scenicName": scenicName, "currentPage": currentPage, "pageSize": pageSize, "tid": 1};
                $.ajax({
                    url: "${pageContext.request.contextPath}/tour/around",
                    data: jdata,
                    dataType: "json",
                    type: "post",
                    cache: false,
                    asynch: true,
                    success: function (data) {
                        console.log(data);
                        /*
                        *
                        * <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img23.jpg" class="img-responsive zoom-img " alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Princess of hill stations</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
                        *
                        * */
                        var list = data.pList;
                        var str = "";
                        for (var i = 0; i < list.length; i++) {
                            str += '<div class="col-sm-6 col-md-4 tour-grids">';
                            str += '<div class="thumbnail">';
                            str += '<a href="${pageContext.request.contextPath}/scenic/'+list[i].id+'"><img src="'+list[i].scenicImage+'" class="img-responsive zoom-img " style="width: 360px;height: 240px" /></a>';
                            str += '<div class="caption tour-caption">';
                            str += '<h3><a>'+list[i].scenicName+'</a></h3>';
                            str += '<p>'+list[i].scenicAddress+'</p>';
                            str += '<p>￥'+list[i].price+'</p>';
                            str += '</div></div></div>';
                        }
                        $("#tb").html(str);
                        //回调函数
                        $('#pageToolbar').Paging({
                            current: currentPage,//当前第几页
                            pagesize: pageSize,  // 默认每页的条数，这个值是每页大小，选择每页多少条的下拉框的值就是这个值，要和paging.js文件里的pageSizeList有对应
                            count: data.totalCount, // 总共有多少条
                            toolbar: true,   // true和false区别多了工具栏
                            hash: true,
                            // 修改每页条数后执行的函数
                            changePagesize: function(pageSize) {
                                $("#pageToolbar").empty();
                                //alert("参数列表有"+arguments.length+"个参数");
                                //alert("改变每页的条数后，每页有"+arguments[0]+"条,  改变每页的条数后，回到第"+arguments[1]+"页,  改变每页的条数后，总共有"+arguments[2]+"页");
                                // 改变每页的条数后，回到第几页是根据current，现在都是回到第一页
                                //alert(pageSize);
                                search(scenicName , 1 , pageSize); // currentPage,pageSize
                            },
                            // 点击具体某一页执行的函数
                            callback: function(currentPage) {
                                $("#pageToolbar").empty();
                                //console.log(a);
                                //alert("参数列表有"+arguments.length+"个参数");
                                //alert("下一页是"+arguments[0]+",  每页有"+arguments[1]+"条,  总共有"+arguments[2]+"页");// 2  10  9
                                //alert("下一页是"+currentPage);// 2  下一页的页数
                                search(scenicName , currentPage , arguments[1]); // currentPage,pageSize
                            }
                        });
                    },
                    error: function () {
                        alert("服务器异常")
                    }
                });


            }
        })
    </script>
</head>

<body>
<!--navigation-->
<div class="top-nav">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
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
                        <a href="${pageContext.request.contextPath}/tour/scenic_inner">国内游</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/tour/scenic_around">跟团游</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/tour/scenic_outter">境外游</a>
                    </li>
                    <li>
                        <a href="blog.html">酒店</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/tour/food_list">美食</a>
                    </li>
                </ul>
                <div class="clearfix"> </div>
            </div>
        </div>
    </nav>
</div>
<!--navigation-->
<!--header-->
<div class="header">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/images/logo.png" alt=""></a>
        </div>
        <form class="navbar-form navbar-right" role="search">
            <div class="form-group">
                <input id="scenicName" type="text" class="form-control" placeholder="搜索">
            </div>
            <button type="button" id="search" class="btn btn-default" aria-label="Left Align">
                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
            </button>
        </form>
    </div>
</div>
<!--//header-->
<div class="tour">
    <div class="container">
        <ol class="breadcrumb">
            <li>
                <a href="${pageContext.request.contextPath}">首页</a>
            </li>
            <li>国内游</li>
        </ol>
        <div class="tesimonial">
            <h3>国内游</h3></div>
        <div class="row tour-info" id="tb">
            <%--<div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img23.jpg" class="img-responsive zoom-img " alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Princess of hill stations</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>--%>
            <%--<div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img24.jpg" class="img-responsive zoom-img " alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img25.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img26.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Princess of hill stations</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img27.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img28.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img29.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="#">Princess of hill stations</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img30.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 tour-grids">
                <div class="thumbnail">
                    <a href="singlepage.html" title="">
                        <img src="images/img31.jpg" class="img-responsive zoom-img" alt="">
                    </a>
                    <div class="caption tour-caption">
                        <h3><a href="singlepage.html">Finibus Bonorum et Malorum</a></h3>
                        <p>Cras justo odiodapibus ac facilisis egestas eget</p>
                    </div>
                </div>
            </div>--%>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div id="pageToolbar"></div>
</div>
<!--footer-->
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
                        <img class="media-object thumbnail" src="${pageContext.request.contextPath}/images/img11.jpg" alt="">
                    </a>
                </div>
                <div class="media-body">
                    <h4 class="media-heading">召唤师峡谷</h4>
                </div>
            </div>
            <div class="media">
                <div class="media-left">
                    <a href="singlepage.html">
                        <img class="media-object thumbnail" src="${pageContext.request.contextPath}/images/img10.jpg" alt="">
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
<!--//footer-->
<!--smooth-scrolling-of-move-up-->
<script type="text/javascript">
    $(document).ready(function() {
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
