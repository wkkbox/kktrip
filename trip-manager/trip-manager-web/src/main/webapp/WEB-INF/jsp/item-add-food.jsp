<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
</head>
<body>
<div class="easyui-panel" title="美食详情" data-options="fit:true">
    <form class="itemFoodAddForm" id="itemFoodAddForm" name="itemFoodAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">景点名称：</td>
                <td>
                    <input id="id" name="id" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">美食名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="foodName" name="foodName"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">美食价格（元）：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="priceView" name="priceView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="temp2" name="temp2">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="foodImage" name="foodImage" type="text/plain">美食图片</script>
                </td>
            </tr>


            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
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
    UE.delEditor('foodImage');
    <!-- 实例化编辑器 -->
    var ue = UE.getEditor('foodImage',{
        initialFrameWidth: '100%',
        initialFrameHeight: '300',
        serverUrl:'file/upload'
    });
    $('#id').combotree({
        url:"scenicsName",
        required: true
    });
        function submitForm(){
        //执行提交操作
        $("#itemFoodAddForm").form("submit",{
            //请求的URL地址
            url:"itemFoodsAdd",
            //在提交之前触发，返回false可以终止提交
            onSubmit:function () {
                //价格单位换算
                $("#temp2").val($("#priceView").val()*100);
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //在表单提交成功以后触发
            success:function (data) {
                console.log("success");
                if(data > 0){
                    $.messager.alert('消息','保存成功', 'info');
                    tktrip.addTab('美食管理', 'item-foodlist');
                    $("#tab").tabs("close","新增美食");
                    $("#dgfood").datagrid("reload");
                }
            }
        });
    }
    function clearForm(){
        $('#itemFoodAddForm').form('reset');
        ue.setContent('美食图片');
    }
</script>
</body>
</html>