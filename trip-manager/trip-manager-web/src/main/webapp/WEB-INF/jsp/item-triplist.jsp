<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>景点名称：</label>
        <input class="easyui-textbox" type="text" id="scenicName">
        <label>景点状态：</label>
        <select id="state" class="easyui-combobox">
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">下架</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
        <%--<a onclick="searchForm()" class="easyui-linkbutton">搜索</a>--%>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="scenicBatch('batchRemove')" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
        <button onclick="scenicBatch('batchDown')" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="scenicBatch('batchUp')" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
    </div>
</div>
<table id="dg"></table>
<script>
    function scenicBatch(batch) {
        var selection= $('#dg').datagrid('getSelections');
        if (selection.length==0){
            $.messager.alert('提示', '请至少选中一条记录！');
            return;
        }
        if(batch=="batchRemove"){
            $.messager.confirm('确认', '您确认想要删除记录吗？', function (r) {
                if (r==false) {
                    return;
                }
            })
        }
        var ids = [];
        for(var i=0;i<selection.length;i++){
            ids.push(selection[i].id);
        }
        $.ajax({
            url:"scenicStatus/"+batch+"",
            data:{"ids[]":ids},
            success:function (data) {
                $("#dg").datagrid("reload");
            }
        })
    }

    function searchForm(){
        $('#dg').datagrid('load',{
            title:$('#title').val(),
            status:$('#status').combobox('getValue')
        });
    }


    //模糊查询
    function searchForm(){
        $('#dg').datagrid('load',{
            scenicName:$('#scenicName').val(),
            state:$('#state').combobox('getValue')
        });
    }


    function add() {
        tktrip.addTab('新增景点', 'item-tripadd');
    }

    function edit() {
        var selection= $('#dg').datagrid('getSelections');
        if (selection.length>1){
            $.messager.alert('提示', '只能选择一条信息！');
            return;
        }
        var id=selection[0].id;
        $.ajax({
            url:"getScenicById/"+id+"",
            async:true,
            success:function (data) {
                tktrip.addTab('编辑景点', 'item-tripupdate');
            }
        });
        
    }

    //初始化数据表格
    $('#dg').datagrid({
        //将工具栏添加到数据表格中
        toolbar: '#toolbar',
        //请求远程服务器上的URL
        url: 'scenics',
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
            {field: 'id', title: '景点编号', width: 100, sortable: true},
            {field: 'scenicName', title: '景点名称', width: 100},/*scenicname*/
            {field: 'scenicAddress', title: '景点地址', width: 100},/*scenic_address*/
            {field: 'scenicLinkman', title: '景点联系人', width: 100},
            {field: 'scenicTel', title: '联系人电话', width: 100},
            {
                field: 'state', title: '景点审核', width: 100, formatter: function (value, row, index) {
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
            {field: 'username', title: '供应商名字', width: 100},/*```````````*/
            {field: 'price', title: '价格', sortable: true, width: 100},
            {
                field: 'createdTime', title: '创建时间', width: 100, sortable: true, formatter: function (value, row, index) {
                return moment(value).format('LL');
            }
            },
            {
                field: 'updateTime', title: '修改时间', width: 100,  sortable: true,formatter: function (value, row, index) {
                return moment(value).format('LL');
            }
            }

        ]]
    });


</script>
