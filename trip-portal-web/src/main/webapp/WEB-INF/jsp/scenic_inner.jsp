<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/paging.css">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/paging.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ei.js"></script>
    <script>
        $(function () {


            $("#search").click(function () {
                //alert($("#oname").val());
                //alert($("#isdeal").val());
                $("#pageToolbar").empty();
                //按条件查询
                search($("#scenicName").val().trim(), 1, 5);
            });


            //一进入页面就查询所有
            search("", 1, 5);

            function search(scenicName, currentPage, pageSize) {
                var jdata = {"scenicName": scenicName, "currentPage": currentPage, "pageSize": pageSize, "tid": 1};
                $.ajax({
                    url: "${pageContext.request.contextPath}/tour/inner",
                    data: jdata,
                    dataType: "json",
                    type: "post",
                    cache: false,
                    asynch: true,
                    success: function (data) {
                        console.log(data);
                        var list = data.pList;
                        var str = "";
                        for (var i = 0; i < list.length; i++) {
                            str += "<tr>";
                            str += '<input type="hidden" name="id" value="'+list[i].id+'"/>';
                            str += '<td width="230px">';
                            str += '<div><img src="'+list[i].scenicImage+'" /></div>';
                            str += '</td>';
                            str += '<td>';
                            str += '<p>'+list[i].scenicName+'</p>';
                            str += '<p>'+list[i].scenicAddress+'</p>';
                            str += '<p>￥'+list[i].price+'</p>';
                            str += '</td>';
                            str += '</tr>';
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
<div class="container">
    <div class="row clearfix">
        <h2>国内游</h2>
        <input id="scenicName" type="text"><input id="search" type="button" value="搜索">
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <tbody id="tb">
                <%--<tr>
                    <input type="hidden" name="id" value=""/>
                    <td width="230px">
                        <div><img src="${pageContext.request.contextPath}/images/scenic1.jpg"></div>
                    </td>
                    <td>
                        <p>大大大大标题</p>
                        <p>地址</p>
                        <p>价格</p>
                    </td>
                </tr>
                <tr>
                    <input type="hidden" name="id" value=""/>
                    <td width="230px">
                        <div><img src="${pageContext.request.contextPath}/images/scenic1.jpg"></div>
                    </td>
                    <td>
                        <p>大大大大标题</p>
                        <p>地址</p>
                        <p>价格</p>
                    </td>
                </tr>
                <tr>
                    <input type="hidden" name="id" value=""/>
                    <td width="230px">
                        <div><img src="${pageContext.request.contextPath}/images/scenic1.jpg"></div>
                    </td>
                    <td>
                        <p>大大大大标题</p>
                        <p>地址</p>
                        <p>价格</p>
                    </td>
                </tr>
                <tr>
                    <input type="hidden" name="id" value=""/>
                    <td width="230px">
                        <div><img src="${pageContext.request.contextPath}/images/scenic1.jpg"></div>
                    </td>
                    <td>
                        <p>大大大大标题</p>
                        <p>地址</p>
                        <p>价格</p>
                    </td>
                </tr>--%>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div id="pageToolbar"></div>
</body>

</html>
