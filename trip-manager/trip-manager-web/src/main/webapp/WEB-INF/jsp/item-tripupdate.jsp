<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">景点联系人：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="scenicLinkman" name="scenicLinkman"
                           data-options="required:true" style="width:100%" value="${scenic.scenicLinkman}">
                </td>
            </tr>
            <tr>
                <td class="label">景点号码：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="scenicTel" name="scenicTel"
                           data-options="required:true" style="width:100%" value="${scenic.scenicTel}" >
                </td>
            </tr>
            <tr>
                <td class="label">景点名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="scenicName" name="scenicName"
                           data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;" value="${scenic.scenicName}">
                </td>
            </tr>
            <tr>
                    <input id="createdTime" name="createdTime" value="${scenic.createdTime}" hidden="hidden">

            </tr>
            <tr>
                <td class="label">景点地址：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="scenicAddress" name="scenicAddress"
                           data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;" value="${scenic.scenicAddress}">
                </td>
            </tr>
            <tr>
                <td class="label">景点价格：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="price" name="price"
                           data-options="required:true,min:0,precision:2" value="${scenic.price}">
                </td>
            </tr>
            <%--隐藏域  保持新建的景点为下架状态--%>
            <input type="hidden" name="state" value="2">
           <%--隐藏域 id--%>
            <input type="hidden" name="id" value="${scenic.id}">
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="scenicIntro" type="text/plain">${scenic.scenicIntro}</script>
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
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>

<script>
    function submitForm(){
        $('#itemAddForm').form('submit',{
            //提交表单到item进行处理
            url: 'scenicUpdate',
            //在表单提交之前触发
            onSubmit:function () {

            },
            //后台处理成功之后的回调函数
            success:function(data){
                if(data >0) {
                    $.messager.alert('温馨提示','恭喜！编辑商品成功！');
                    tktrip.removeTabs("编辑商品");
                    tktrip.addTabs('查询商品', 'item-triplist');
                }

            }
        });
    }

    UE.delEditor("container");
    window.UEDITOR_CONFIG.serverUrl="file/upload";
    //实例化富文本编辑器
    var ue = UE.getEditor('container');
    $('#cid').combotree({
        url: 'listUser',
        required: true,
        onBeforeExpand: function (node) {},
        onBeforeSelect: function (node) {}
    })
</script>