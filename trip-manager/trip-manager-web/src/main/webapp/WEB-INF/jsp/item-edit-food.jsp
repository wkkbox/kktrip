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
<div class="easyui-panel" title="美食详情" data-options="fit:true">
    <form class="itemFoodEditForm" id="itemFoodEditForm" name="itemFoodEditForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">景点名称：</td>
                <td>
                    <input readonly="scenicName" class="easyui-textbox" type="text" id="scenicName" name="scenicName"
                           data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;" value="${food.scenicName}">
                </td>
            </tr>
            <tr>
                <td class="label">美食名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="foodName" name="foodName"
                           data-options="required:true" style="width:100%" value="${food.foodName}">
                </td>
            </tr>
            <tr>
                <td class="label">美食价格：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="priceView" name="priceView"
                           data-options="required:true,min:0,precision:2" value="${food.priceView}">
                    <input type="hidden" id="temp2" name="temp2">
                </td>
            </tr>
            <%--隐藏域  保持新建的美食为下架状态--%>
<%--
            <input type="hidden" name="temp1" value="2">
--%>
            <%--隐藏域 id--%>
            <input type="hidden" name="scenicId" value="${food.scenicId}">
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="foodImage" type="text/plain"><img src="${food.foodImage}"/></script>
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
        $('#itemFoodEditForm').form('submit',{

            //提交表单到item进行处理
            url: 'foodUpdate',
            //在表单提交之前触发
            onSubmit:function () {
                //价格单位换算
                $("#temp2").val($("#priceView").val()*100);
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //后台处理成功之后的回调函数
            success:function(data){
                if(data >0) {
                    $.messager.alert('温馨提示','恭喜！编辑美食成功！');
                    $("#tab").tabs("close","编辑美食");
                    tktrip.addTab('美食管理', 'item-foodlist');
                    $("#dgfood").datagrid("reload");
                }

            }
        });
    }

    UE.delEditor("container");
    window.UEDITOR_CONFIG.serverUrl="file/upload";
    //实例化富文本编辑器
    var ue = UE.getEditor('container');
</script>
</body>
</html>
