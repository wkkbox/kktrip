<%--
  User: Administrator
  Date: 2017/11/23
  Time: 12:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<div class="easyui-panel" title="订单详情" data-options="fit:true">
    <form class="itemOrderEditForm" id="itemOrderEditForm" name="itemOrderEditForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">用户名称：</td>
                <td>
                    <input disabled="disabled" readonly="username" class="easyui-textbox" type="text" id="username" name="username"
                           data-options="required:true" style="width:100%;height:60px;" value="${order.username}">
                    <input type="hidden" name="userId" value="${order.userId}">
                </td>
            </tr>
            <tr>
                <td class="label">酒店名称：</td>
                <td>
                    <input disabled="disabled" readonly="hotelName" class="easyui-textbox" type="text" id="hotelName" name="hotelName"
                           data-options="required:true" style="width:100%" value="${order.hotelName}">
                    <input type="hidden" name="hotelId" value="${order.hotelId}">
                </td>
            </tr>
            <%--时间日期类用什么box--%>
            <tr>
                <td class="label">入住时间：</td>
                <td>
                    <input disabled="disabled" readonly="readonly" type="datetime" id="inTime" name="inTime"
                           data-options="required:true" value="${order.inTime}">
                </td>
            </tr>
            <tr>
                <td class="label">离开时间：</td>
                <td>
                    <input disabled="disabled" readonly="readonly" type="datetime" id="outTime" name="outTime"
                           data-options="required:true" value="${order.outTime}">
                </td>
            </tr>

            <%--隐藏域  保持新建的美食为下架状态--%>

            <input type="hidden" name="state" value="${order.state}">

            <%--隐藏域 id--%>
            <input type="hidden" name="id" value="${order.id}">
            <tr>
                <td class="label">订单创建时间：</td>
                <td>
                    <input disabled="disabled" readonly="readonly" type="datetime-local" id="createdTime" name="createdTime"
                           data-options="required:true" value="${order.createdTime}">
                </td>
            </tr>
            <tr>
                <td class="label">订单修改时间：</td>
                <td>
                    <input type="datetime" id="updateTime" name="updateTime"
                           data-options="required:true" value="${order.updateTime}">
                </td>
            </tr>
            <tr>
                <td class="label">小计：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="subtotal" name="subtotal"
                           data-options="required:true" style="width:100%;height:60px;" value="${order.subtotal}">
                </td>
            </tr>
            <tr>
                <td class="label">合计：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="total" name="total"
                           data-options="required:true" style="width:100%" value="${order.total}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">修改
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>

<script>
    function submitForm(){

        console.log('submit');
        $('#itemOrderEditForm').form('submit',{
            //提交表单到item进行处理

            url:'orders/update',
            //在表单提交之前触发
            onSubmit:function () {
            },
            //后台处理成功之后的回调函数
            success:function(data){

                if(data >0) {
                    $.messager.alert('温馨提示','恭喜！编辑订单成功！');
                    $("#tab").tabs("close","编辑订单");
                    tktrip.addTab('订单管理', 'item-orderlist');
                    $("#dgOrder").datagrid("reload");
                }

            }
        });
    }
</script>
</body>
</html>