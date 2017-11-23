<%--
  User: Administrator
  Date: 2017/11/23
  Time: 20:57
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="easyui-panel" title="用户详情" data-options="fit:true">
    <form class="itemUserEditForm" id="itemUserEditForm" name="itemUserEditForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">用户名称：</td>
                <td>
                    <input disabled="disabled" readonly="username" class="easyui-textbox" type="text" id="username" name="username"
                           data-options="validType:'length[0,150]',multiline:true" style="width:100%;height:60px;" value="${user.username}">
                </td>
            </tr>
            <tr>
                <td class="label">用户密码：</td>
                <td>
                    <input disabled="disabled" readonly="password" class="easyui-textbox" type="text" id="password" name="password"
                           data-options="required:true" style="width:100%" value="${user.password}">
                </td>
            </tr>
            <input type="hidden" name="id" value="${user.id}">
            <tr>
                <td class="label">联系方式：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="tel" name="tel"
                           data-options="validType:'length[0,11]',required:true" value="${user.tel}">
                </td>
            </tr>
            <tr>
                <td class="label">电子邮箱：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="email" name="email"
                           data-options="required:true,validType: 'email'" value="${user.email}">
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
        $('#itemUserEditForm').form('submit',{

            //提交表单到item进行处理
            url: 'userUpdate',
            //在表单提交之前触发
            onSubmit:function () {
                //价格单位换算
                //做表单校验，表单上所有字段全部校验通过才能返回true，才会提交表单，
                //如果有任意一个字段没有校验通过，返回false，不会提交表单
                return $(this).form('validate');
            },
            //后台处理成功之后的回调函数
            success:function(data){

                if(data >0) {
                    $.messager.alert('温馨提示','恭喜！编辑用户成功！');
                    $("#tab").tabs("close","编辑用户");
                    tktrip.addTab('用户信息', 'item-visitorinfolist');
                    $("#dgVistitorinfo").datagrid("reload");
                }

            }
        });
    }
</script>
</body>
</html>

