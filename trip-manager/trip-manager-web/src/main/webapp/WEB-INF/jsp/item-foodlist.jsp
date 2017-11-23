<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbarFood">
    <div style="padding: 5px; background-color: #fff;">
        <label>美食名称：</label>
        <input class="easyui-textbox" type="text" id="foodName">
        <label>美食状态：</label>
        <select id="temp1" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">下架</option>
            <option value="3">删除</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
        <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
    </div>
</div>
<table id="dgfood"></table>
<script>

    //模糊查询
    function searchForm(){
        $('#dgfood').datagrid('load',{
            foodName:$('#foodName').val(),
            temp1:$('#temp1').combobox('getValue')
        });
    }


    function add() {
        tktrip.addTab('新增美食', 'item-add-food');
    }

    function edit() {
        var selection= $('#dgfood').datagrid('getSelections');

        if (selection.length>1){
            $.messager.alert('提示', '只能选择一条信息！');
            return;
        }
        var id=selection[0].id;

        $.ajax({
            url:"getFoodsById/"+id+"",
            async:true,
            success:function (data) {
                tktrip.addTab('编辑美食', 'item-edit-food');
            }
        });
    }

    function remove() {
        var selections = $('#dgfood').datagrid('getSelections');
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
                    if (selections[i].temp1 != 3) {
                        ids.push(selections[i].id);
                    }else if(selections[i].temp1 == 3){
                        $.messager.alert("错误", "您的选择中含有已删除的商品，请核对后再提交","error");
                        return;
                    }
                }
                //把ids异步提交到后台
                $.post(
                    //url:请求后台的哪个地址来进行处理，相当于url,String类型
                    'itemFoods/batchRemove',
                    //data:从前台提交哪些数据给后台处理，相当于data，Object类型
                    {'ids[]': ids},
                    //callback:后台处理成功的回调函数，相当于success，function类型
                    function (data) {
                        $('#dgfood').datagrid('reload');
                    },
                    //dataType:返回的数据类型，如：json，String类型
                    'json'
                );

            }
        });
    }

    function down() {
        console.log('down');
        var selections = $('#dgfood').datagrid('getSelections');
        console.log(selections);
        if (selections.length == 0) {
            //客户没有选择记录
            $.messager.alert('提示', '请至少选中一条记录！');
            return;
        }
        //至少选中了一条记录
        //确认框，第一个参数为标题，第二个参数确认框的提示内容，第三参数是一个确认函数
        //function(r) 如果用户点击的是"确定"，那么r=true
        $.messager.confirm('确认', '您确认想要下架吗？', function (r) {
            if (r) {
                //为了存放id的集合
                var ids = [];
                //遍历选中的记录，将记录的id存放到js数组中
                for (var i = 0; i < selections.length; i++) {
                    if (selections[i].temp1 != 2) {
                        ids.push(selections[i].id);
                    } else if (selections[i].temp1 == 2) {
                        $.messager.alert("错误", "您的选择中含有已下架的商品，请核对后再提交","error");
                        return;
                    }
                }
                //把ids异步提交到后台
                $.post(
                    //url:请求后台的哪个地址来进行处理，相当于url,String类型
                    'itemFoods/batchDown',
                    //data:从前台提交哪些数据给后台处理，相当于data，Object类型
                    {'ids[]': ids},
                    //callback:后台处理成功的回调函数，相当于success，function类型
                    function (data) {
                        $('#dgfood').datagrid('reload');
                    },
                    //dataType:返回的数据类型，如：json，String类型
                    'json'
                );

            }
        });
    }

    function up() {
        console.log('up');
        var selections = $('#dgfood').datagrid('getSelections');
        console.log(selections);
        if (selections.length == 0) {
            //客户没有选择记录
            $.messager.alert('提示', '请至少选中一条记录！');
            return;
        }
        //至少选中了一条记录
        //确认框，第一个参数为标题，第二个参数确认框的提示内容，第三参数是一个确认函数
        //function(r) 如果用户点击的是"确定"，那么r=true
        $.messager.confirm('确认', '您确认想要上架吗？', function (r) {
            if (r) {
                //为了存放id的集合
                var ids = [];
                //遍历选中的记录，将记录的id存放到js数组中
                for (var i = 0; i < selections.length; i++) {
                    if (selections[i].temp1 == 2) {
                        ids.push(selections[i].id);
                    } else if (selections[i].temp1 == 1) {
                        $.messager.alert("错误", "您的选择中含有已上架的商品，请核对后再提交","error");
                        return;
                    } else if (selections[i].temp1 == 3) {
                        $.messager.alert("错误", "您的选择中含有已删除的商品，请先下架后再提交","error");
                        return;
                    }
                }
                //把ids异步提交到后台
                $.post(
                    //url:请求后台的哪个地址来进行处理，相当于url,String类型
                    'itemFoods/batchUp',
                    //data:从前台提交哪些数据给后台处理，相当于data，Object类型
                    {'ids[]': ids},
                    //callback:后台处理成功的回调函数，相当于success，function类型
                    function (data) {
                        if(data>0){
                            $('#dgfood').datagrid('reload');
                        }

                    },
                    //dataType:返回的数据类型，如：json，String类型
                    'json'
                );

            }
        });
    }

    //初始化数据表格
    $('#dgfood').datagrid({
        //允许多列排序
        multiSort: true,
        //将工具栏添加到数据表格中
        toolbar: '#toolbarFood',
        //请求远程服务器上的URL
        url: 'itemFoods',
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
            {field: 'id', title: '美食ID', width: 100, sortable: true},
            {field: 'foodName', title: '美食名称', width: 100, sortable: true},
            {field: 'foodImage', title: '美食图片', width: 100},
            {field: 'scenicId', title: '景点ID', width: 100},
            {field: 'scenicName', title: '景点名称', width: 100},
            {field: 'statusName', title: '美食状态', width: 100},
            {field: 'priceView', title: '美食价格', width: 100}
        ]]
    });
</script>
