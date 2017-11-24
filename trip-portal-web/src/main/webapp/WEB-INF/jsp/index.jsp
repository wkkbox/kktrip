<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/slide.css"/>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="js/slider.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1"><span
                            class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span
                            class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <div>
        <ul class="nav nav-pills nav-justified">
            <li>
                <a id="scenic_inner" href="tour/scenic_inner" style="background-color: #EFEEEC;">国内游</a>
            </li>
            <li>
                <a id="scenic_around" href="tour/scenic_around" style="background-color: #EFEEEC;">跟团游</a>
            </li>
            <li>
                <a id="scenic_outter" href="tour/scenic_outter" style="background-color: #EFEEEC;">出境游</a>
            </li>
            <li>
                <a href="javascript:void(0)" style="background-color: #EFEEEC;">VB.Net</a>
            </li>
            <li>
                <a href="javascript:void(0)" style="background-color: #EFEEEC;">Java</a>
            </li>
            <li>
                <a href="javascript:void(0)" style="background-color: #EFEEEC;">PHP</a>
            </li>
        </ul>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <!-- 轮播广告 -->
            <div id="banner_tabs" class="flexslider">
                <ul class="slides">
                    <li>
                        <a title="" target="_blank" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg1.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                    <li>
                        <a title="" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg2.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                    <li>
                        <a title="" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg3.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                    <li>
                        <a title="" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg4.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                    <li>
                        <a title="" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg5.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                    <li>
                        <a title="" href="#">
                            <img width="1920" height="480" alt=""
                                 style="background: url(images/bg6.jpg) no-repeat center;" src="images/alpha.png">
                        </a>
                    </li>
                </ul>
                <ul class="flex-direction-nav">
                    <li>
                        <a class="flex-prev" href="javascript:;">Previous</a>
                    </li>
                    <li>
                        <a class="flex-next" href="javascript:;">Next</a>
                    </li>
                </ul>
                <ol id="bannerCtrl" class="flex-control-nav flex-control-paging">
                    <li>
                        <a>1</a>
                    </li>
                    <li>
                        <a>1</a>
                    </li>
                    <li>
                        <a>1</a>
                    </li>
                    <li>
                        <a>1</a>
                    </li>
                    <li>
                        <a>1</a>
                    </li>
                    <li>
                        <a>1</a>
                    </li>
                </ol>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-11 column">
                    <h3>
                        国内游
                    </h3>
                </div>
                <div class="col-md-1 column">
                    <a href="tour/scenic_inner">更多>></a>
                </div>
            </div>
            <div class="row clearfix">
                <c:forEach items="${requestScope.inners}" var="item">
                    <div class="col-md-4 column">
                        <div align="center">
                            <img style="width: 222px;height: 140px" src="${item.scenicImage}"/>
                            <p>
                                ${item.scenicName}
                                <a class="btn" name="${item.id}" href="scenic_detail.html">详情 »</a>
                            </p>
                        </div>
                    </div>
                </c:forEach>

                <%--<div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>--%>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-11 column">
                    <h3>
                        出境游
                    </h3>
                </div>
                <div class="col-md-1 column">
                    <a href="tour/scenic_outter">更多>></a>
                </div>
            </div>
            <div class="row clearfix">
                <c:forEach items="${requestScope.outters}" var="item">
                    <div class="col-md-4 column">
                        <div align="center">
                            <img style="width: 222px;height: 140px" src="${item.scenicImage}"/>
                            <p>
                                    ${item.scenicName}
                                <a class="btn" name="${item.id}" href="scenic_detail.html">详情 »</a>
                            </p>
                        </div>
                    </div>
                </c:forEach>
                <%--<div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>--%>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-11 column">
                    <h3>
                        跟团游
                    </h3>
                </div>
                <div class="col-md-1 column">
                    <a href="tour/scenic_around">更多>></a>
                </div>
            </div>
            <div class="row clearfix">
                <c:forEach items="${requestScope.arounds}" var="item">
                    <div class="col-md-4 column">
                        <div align="center">
                            <img style="width: 222px;height: 140px" src="${item.scenicImage}"/>
                            <p>
                                    ${item.scenicName}
                                <a class="btn" name="${item.id}" href="scenic_detail.html">详情 »</a>
                            </p>
                        </div>
                    </div>
                </c:forEach>
                <%--<div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <div align="center">
                        <img src="images/scenic1.jpg"/>
                        <p>抛开城市喧嚣，到千岛湖，赏碧水蓝天
                            <a class="btn" href="scenic_detail.html">详情 »</a>
                        </p>
                    </div>
                </div>--%>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        var bannerSlider = new Slider($('#banner_tabs'), {
            time: 2000,
            delay: 400,
            event: 'hover',
            auto: true,
            mode: 'fade',
            controller: $('#bannerCtrl'),
            activeControllerCls: 'active'
        });
        $('#banner_tabs .flex-prev').click(function () {
            bannerSlider.prev()
        });
        $('#banner_tabs .flex-next').click(function () {
            bannerSlider.next()
        });
    })
</script>
<script type="text/javascript">
  //alert("sas")
</script>

</body>

</html>
