<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="breadcrumb">
                <li>
                    <a href="${pageContext.request.contextPath}">首页</a>
                </li>
                <li>
                    <c:if test="${scenic.tid==3}">
                        <a href="${pageContext.request.contextPath}/tour/scenic_around">跟团游</a>
                    </c:if>
                    <c:if test="${scenic.tid==2}">
                        <a href="${pageContext.request.contextPath}/tour/scenic_outter">境外游</a>
                    </c:if>
                    <c:if test="${scenic.tid==1}">
                        <a href="${pageContext.request.contextPath}/tour/scenic_inner">国内游</a>
                    </c:if>

                </li>
                <li class="active">
                    ${scenic.scenicName}
                </li>
            </ul>
            <div class="row clearfix">
                <div class="col-md-8 column">
                    <div>
                        <img src="${scenic.scenicImage}"/>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <div>
                        <h3>${scenic.scenicName}</h3>
                        <p><em>景点地址 : </em><span>${scenic.scenicAddress}</span></p>
                        <p><em>价格 : </em><span>￥${scenic.price}</span></p>
                        <p>
                            <a href="#">查看评论</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<hr/>

    <div style="margin: 0 auto;width: 1000px">${scenic.scenicIntro}</div>
    <%--<p><img src="http://101.132.179.155/images/2017/11/22/1511351973291813.jpg" title="1511351973291813.jpg" alt="1.jpg" /><img src="http://101.132.179.155/images/2017/11/22/1511352079298864.jpg" title="1511352079298864.jpg" alt="2.jpg" /><img src="http://101.132.179.155/images/2017/11/22/1511352086204399.jpg" title="1511352086204399.jpg" alt="3.jpg" /><img src="http://101.132.179.155/images/2017/11/22/1511352091790865.jpg" title="1511352091790865.jpg" alt="4.jpg" /></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255); text-align: center;"><strong><span style="color: rgb(0, 0, 0);">温馨小提示：&nbsp;</span></strong><strong>手机客户端用户请猛戳“</strong><span style="line-height: 1.5; background-color: rgb(229, 51, 51);"><strong><span style="color: rgb(238, 51, 238);"><a href="http://vacations.ctrip.com/around/p6974717s2.html" target="_blank" style="color: rgb(0, 101, 187); text-decoration-line: none; outline: none;"><span style="background-color: rgb(204, 204, 204);"><span style="background-color: rgb(255, 255, 255);">点击加载全部</span>”</span>
				</a>
				</span><span style="color: rgb(0, 0, 0); background-color: rgb(255, 255, 255);">以获取更多精彩</span></strong>
				</span>
    </p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255); text-align: center;"><strong><span style="color: rgb(229, 51, 51);"><img src="https://dimg04.c-ctrip.com/images/300d0m000000df9y1F920.jpg"/><br/></span></strong></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255); text-align: center;"><br/></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255); text-align: center;"><br/></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);"><span style="color: rgb(0, 153, 0);"><strong>产品特色——</strong></span></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);"><strong><span style="color: rgb(238, 51, 238);">【</span></strong><span style="line-height: 1.5; color: rgb(238, 51, 238);"><strong>5A</strong></span><strong><span style="color: rgb(238, 51, 238);">奢游】：专车接送</span>玩转迪士尼<span style="color: rgb(0, 0, 0);">6大主题园区</span>：<span style="color: rgb(204, 51, 229);">米奇大街<span style="color: rgb(0, 0, 0);">、</span>奇想花园<span style="color: rgb(0, 0, 0);">、</span>梦幻世界<span style="color: rgb(0, 0, 0);">、</span>探险岛<span style="color: rgb(0, 0, 0);">、</span>宝藏湾<span style="color: rgb(0, 0, 0);">和</span>明日世界</span></strong></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);"><strong><span style="color: rgb(238, 51, 238);">【</span></strong><span style="font-size: 13.3333px; color: rgb(238, 51, 238);"><strong>5A</strong></span><strong><span style="color: rgb(238, 51, 238);">独赠】：<span style="color: rgb(0, 0, 0);">亲情</span></span></strong><strong>赠送价值<span style="color: rgb(238, 51, 238);">120元</span>的宋城大门票，探千古宋城，带您敞开心扉、 慢游江南！</strong></p>
    <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(51, 51, 51); font-family: &quot;microsoft yahei&quot;, simsun, sans-serif; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);"><strong><span style="color: rgb(238, 51, 238);">【</span></strong><span style="font-size: 13.3333px; color: rgb(204, 51, 229);"><strong><span style="color: rgb(238, 51, 238);">5</span><span style="color: rgb(238, 51, 238);">A</span></strong>
				</span><strong><span style="color: rgb(238, 51, 238);">奢享】：</span></strong><strong>&nbsp;</strong><strong>全程4早2正，早餐<span style="color: rgb(204, 51, 229);">8</span><span style="color: rgb(238, 51, 238);">8-148元</span>，正餐特别推出特色万达宴，让您绽放味蕾、品味舌尖上的江南！</strong></p>
    <p><br/></p>--%>

</body>
</html>
