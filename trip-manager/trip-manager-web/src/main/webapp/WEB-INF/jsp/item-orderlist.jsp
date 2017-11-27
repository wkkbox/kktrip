<%--
  User: Administrator
  Date: 2017/11/25
  Time: 10:57
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbarOrder">
    <div style="padding: 5px; background-color: #fff;">
        <label>用户名称：</label>
        <input class="easyui-textbox" type="text" id="username">
        <label>酒店名称：</label>
        <input class="easyui-textbox" type="text" id="hotelName">
        <label>订单状态：</label>
        <select id="state" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">已受理</option>
            <option value="2">未受理</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<table id="dgOrder"></table>
<script>

    //模糊查询
    function searchForm(){
        $('#dgOrder').datagrid('load',{
            username:$('#username').val(),
            hotelName:$('#hotelName').val(),
            state:$('#state').combobox('getValue')
        });
    }

    function edit() {
        console.log('edit');
        var selection= $('#dgOrder').datagrid('getSelections');

        if (selection.length>1){
            $.messager.alert('提示', '只能选择一条信息！');
            return;
        }
        var id=selection[0].id;

        $.ajax({
            url:"getOrdersById/"+id+"",
            async:true,
            success:function (data) {
                tktrip.addTab('编辑订单', 'item-edit-order');
            }
        });
    }

    function remove() {
        var selections = $('#dgOrder').datagrid('getSelections');
        console.log(selections);
        if (selections.length == 0) {
            //客户没有选择记录
            $.messager.alert('提示', '请至少选中一条记录！');
            return;
        }
        //至少选中了一条记录
        //确认框，第一个参数为标题，第二个参数确认框的提示内容，第三参数是一个确认函数
        //function(r) 如果用户点击的是"确定"，那么r=true
        $.messager.confirm('确认', '您确认想要删除记录吗？', function (r) {
            if (r) {
                //为了存放id的集合
                var ids = [];
                //遍历选中的记录，将记录的id存放到js数组中
                for (var i = 0; i < selections.length; i++) {
                    if(selections[i].state==1) {
                        ids.push(selections[i].id);
                    }else if(selections[i].state!=1){
                        $.messager.alert("错误","您选择的记录含有未受理的记录，请核对后重试","error");
                        return;
                    }
                }
                //把ids异步提交到后台
                $.post(
                    //url:请求后台的哪个地址来进行处理，相当于url,String类型
                    'itemOrders/batchRemove',
                    //data:从前台提交哪些数据给后台处理，相当于data，Object类型
                    {'ids[]': ids},
                    //callback:后台处理成功的回调函数，相当于success，function类型
                    function (data) {
                        $('#dgOrder').datagrid('reload');
                    },
                    //dataType:返回的数据类型，如：json，String类型
                    'json'
                );

            }
        });
    }

    //初始化数据表格
    $('#dgOrder').datagrid({
        //允许多列排序
        multiSort: true,
        //将工具栏添加到数据表格中
        toolbar: '#toolbarOrder',
        //请求远程服务器上的URL
        url: 'itemOrders',
        //隔行变色，斑马线效果
        striped: true,
        //添加分页工具栏
        pagination: true,
        //每行的前面显示行号
        rownumbers: true,
        //使得数据表格自适应填充父容器
        fit: true,
        //默认显示10条，这样的话就显示20条
        pageSize: 10,
        //分页列表
        pageList: [10, 20, 50, 100],
        //列属性
        columns: [[
            //field title width列属性
            {field: 'ck', checkbox: true},
            {field: 'id', title: '订单ID',sortable: true},
            {field: 'username', title: '用户名称',  sortable: true},
            {field: 'hotelName', title: '酒店名称',  sortable: true},
            {field: 'inTime', title: '入住时间', formatter:function(value,row,index){
                return moment(value).format('LLL');
            }},
            {field: 'outTime', title: '离开时间',formatter:function(value,row,index){
                return moment(value).format('LLL');
            }},
            {field: 'stateName', title: '订单状态', },
            {field: 'createdTime', title: '订单创建时间', formatter:function(value,row,index){
                return moment(value).format('LLL');
            }}, /*scenicIntro*/
            {field: 'updateTime', title: '订单修改时间', formatter:function(value,row,index){
                return moment(value).format('LLL');
            }},
            {field: 'subtotal', title: '小计'},
            {field: 'total', title: '合计'}
        ]]
    })
</script>

