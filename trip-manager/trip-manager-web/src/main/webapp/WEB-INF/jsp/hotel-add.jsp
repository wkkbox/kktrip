<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">

            <tr>
                <td class="label">酒店名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="title" name="title"
                           data-options="required:true" style=" width:170px;">
                </td>
            </tr>

            <tr>
                <td class="label">酒店等级：</td>
                <td>
                    <select name="hoteltype" id="hoteltype" >
                        <option value="0">无星</option>
                        <option value="3">三星</option>
                        <option value="4">四星</option>
                        <option value="5">五星</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="label">酒店供应商：</td>
                <td>
                    <select name="username" id="username" >

                    </select>
                </td>
            </tr>
            <tr>
                <td class="label">酒店联系人：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="hotelLinkman" name="hotelLinkman"
                           data-options="required:true">
                </td>
            </tr>
            <tr>
                <td class="label">住宿价格（元）：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="price" name="price"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="priceView" name="priceView">
                </td>
            </tr>
            <tr>
                <td class="label">酒店联系电话：</td>
                <td>
                    <input id="contactPhone2" class="easyui-textbox" validType='phoneNum' name="contactPhone" data-options="required:true"
                           missingMessage="电话不能空" type="text">
                </td>
            </tr>
            <tr>
                <td class="label">酒店地址：</td>
                <td>
                    <input class="easyui-textbox" name="hotelAddress" id="hotelAddress" style="width:60%"   data-options="required:true">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="content" type="text/plain">商品描述</script>
                </td>
            </tr>

            <tr class="paramsShow" style="display:none;">
                <td class="label">商品规格：</td>
                <td>

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
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>

<script type="text/javascript">
    $(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/provider/findSuppliername.action",
            dataType:"json",
            type:"post",
            success:function(data){
                var param="";
                var j=0;
                for(var i=0;i<data.length;i++){
                    j=i+1;
                    param+="<option value="+j+">"+data[i]+"</option>";
                }

                $("#username").html(param);

            },
            error:function(){
                $.messager.alert('温馨提示', '系统异常请稍后再试');
            }
        })
    })

</script>


<script>

    //提交表单
    function submitForm() {
        $('#itemAddForm').form('submit', {
            //提交表单到item进行处理
            url: 'hotelitem',
            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '恭喜！添加酒店成功！');
                    tktrip.closeTab('新增酒店');
                    tktrip.addTab('酒店管理', 'item-hotellist');
                }
            }
        });
    }

    //初始化之前删除原有的容器
    UE.delEditor('container');
    //实例化富文本编辑器
    var ue = UE.getEditor('container', {
        initialFrameWidth: '100%',
        initialFrameHeight: '300',
        serverUrl:'file/upload'
    });

</script>
