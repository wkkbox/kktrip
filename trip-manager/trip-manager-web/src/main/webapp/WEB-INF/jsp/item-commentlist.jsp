<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>评论内容：</label>
        <input class="easyui-textbox" type="text" id="title">
        <label>服务星级：</label>
        <select id="status" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">1星</option>
            <option value="2">2星</option>
            <option value="3">3星</option>
            <option value="4">4星</option>
            <option value="5">5星</option>
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
<table id="dg"></table>
<script>

    //模糊查询
    function searchForm(){
        $('#dg').datagrid('load',{
            title:$('#title').val(),
            status:$('#status').combobox('getValue')
        });
    }


    function add() {
        tktrip.addTabs('新增酒店', 'item-add');
    }

    function edit() {
        console.log('edit');
    }

    function remove() {
        var selections = $('#dg').datagrid('getSelections');
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
                    ids.push(selections[i].id);
                }
                //把ids异步提交到后台
                $.post(
                    //url:请求后台的哪个地址来进行处理，相当于url,String类型
                    'items/batch',
                    //data:从前台提交哪些数据给后台处理，相当于data，Object类型
                    {'ids[]': ids},
                    //callback:后台处理成功的回调函数，相当于success，function类型
                    function (data) {
                        $('#dg').datagrid('reload');
                    },
                    //dataType:返回的数据类型，如：json，String类型
                    'json'
                );

            }
        });
    }

    function down() {
        console.log('down');
    }

    function up() {
        console.log('up');
    }

    //初始化数据表格
    $('#dg').datagrid({
        //允许多列排序
        multiSort: true,
        //将工具栏添加到数据表格中
        toolbar: '#toolbar',
        //请求远程服务器上的URL
        url: 'items',
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
            {field: 'id', title: '酒店编号', width: 100, sortable: true},
            {field: 'scenicName', title: '酒店名称', width: 100, sortable: true},
            {field: 'hotelType', title: '酒店等级', width: 100},
            {field: 'scenicIntro', title: '景点介绍', width: 100},/*scenicIntro*/
            {field: 'hotelLinkman', title: '酒店联系人', width: 100},
            {field: 'hotelTel', title: '酒店联系方式', width: 100},
            {field: 'hotelSddress', title: '酒店地址', width: 100},
            {field: '**********', title: '酒店供应商', width: 100},/*````````*/
            {
                field: 'state', title: '酒店状态', width: 100, formatter: function (value, row, index) {
//                console.group();
//                console.log(value);
//                console.log(row);
//                console.log(index);
//                console.groupEnd();
                switch (value) {
                    case 1 :
                        return "正常";
                        break;
                    case 2:
                        return "下架";
                        break;
                    case 3:
                        return "删除";
                        break;
                    default:
                        return "未知";
                        break;
                }

            }
            },
            {field: 'price', title: '酒店价格', width: 100}

        ]]
    });


</script>
