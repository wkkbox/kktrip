<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbarVistitorinfo">
    <div style="padding: 5px; background-color: #fff;">
        <label>用户姓名：</label>
        <input class="easyui-textbox" type="text" id="username">
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
    </div>
</div>
<table id="dgVistitorinfo"></table>
<script>

    //模糊查询
    function searchForm(){
        $('#dgVistitorinfo').datagrid('load',{
            username:$('#username').val(),
        });
    }
    function edit() {
        var selection= $('#dgVistitorinfo').datagrid('getSelections');

        if (selection.length>1){
            $.messager.alert('提示', '只能选择一条信息！');
            return;
        }
        var id=selection[0].id;

        $.ajax({
            url:"getUserById/"+id+"",
            async:true,
            success:function (data) {
                tktrip.addTab('编辑用户', 'item-edit-vistitorinfo');
            }
        });
    }

    //初始化数据表格
    $('#dgVistitorinfo').datagrid({
        //允许多列排序
        multiSort: true,
        //将工具栏添加到数据表格中
        toolbar: '#toolbarVistitorinfo',
        //请求远程服务器上的URL
        url: 'itemVistitorinfos',
        //隔行变色，斑马线效果
        striped: true,
        //添加分页工具栏
        pagination: true,
        //每行的前面显示行号
        rownumbers: true,
        //使得数据表格自适应填充父容器
        fit: true,
        //默认显示10条，这样的话就显示20条
        pageSize: 20,
        //分页列表
        pageList: [20, 50, 100],
        //列属性
        columns: [[
            //field title width列属性
            {field: 'ck', checkbox: true},
            {field: 'id', title: '游客编号', width: 100, sortable: true},
            {field: 'username', title: '游客姓名', width: 100, sortable: true},
            {field: 'tel', title: '游客联系方式', width: 100},
            {field: 'email', title: '游客邮箱', width: 100}

        ]]
    });


</script>
