<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">

            <tr>
                <td class="label">酒店名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="hotelName" name="hotelName"
                           data-options="required:true" style=" width:170px;" value="${selecthotel.hotelName}">
                </td>
            </tr>

            <tr>
                <td class="label">酒店等级：</td>
                <td>
                    <select name="hoteltype" id="hoteltype" >

                        <option value="0"  <c:if  test="${selecthotel.hoteltype==0}" >selected="selected" </c:if> >无星</option>
                        <option value="3"  <c:if test="${selecthotel.hoteltype==3}"  >selected='selected'</c:if> >三星</option>
                        <option value="4"  <c:if  test="${selecthotel.hoteltype==4}"  >selected='selected'</c:if> >四星</option>
                        <option value="5"  <c:if  test="${selecthotel.hoteltype==5}"  >selected='selected'</c:if> >五星</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="label">酒店供应商名称：</td>
                <td>
                    <select name="uid" id="uid">

                    </select>
                </td>
            </tr>
            <tr>
                <td class="label">酒店联系人：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="hotelLinkman" name="hotelLinkman"
                           data-options="required:true" value="${selecthotel.hotelLinkman}">
                </td>
            </tr>
            <tr>
                <td class="label">住宿价格（元）：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="price" name="price"
                           data-options="required:true,min:0,precision:2" value="${selecthotel.price}">
                    <input type="hidden" id="priceView" name="priceView">
                </td>
            </tr>
            <tr>
                <td class="label">酒店联系电话：</td>
                <td>
                    <input id="hotelTel" class="easyui-textbox" validType='phoneNum' name="hotelTel" data-options="required:true"
                           missingMessage="电话不能空" type="text"  value="${selecthotel.hotelTel}">
                </td>
            </tr>
            <tr>
                <td class="label">酒店地址：</td>
                <td>
                    <input class="easyui-textbox" name="hotelAddress" id="hotelAddress" value="${selecthotel.hotelAddress}" style="width:60%"   data-options="required:true">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="hotelImage" type="text/plain"><img src="${selecthotel.hotelImage}"/></script>
                </td>
            </tr>

            <tr class="paramsShow" style="display:none;">
                <td class="label">商品规格：</td>
                <td>
                    <input type="text" name="id"  value="${selecthotel.id}">

                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">修改
                    </button>
                   <%-- <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>--%>
                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>



<script>

    //提交表单
    function submitForm() {

        $('#itemAddForm').form('submit', {

            //提交表单到item进行处理
            url: 'hotelitems/updatehotelone',

            //在表单提交成功以后触发
            success: function (data) {
                if (data > 0) {
                    $.messager.alert('温馨提示', '修改酒店成功！');
                    tktrip.closeTab('修改酒店');
                    tktrip.addTab('酒店管理', 'item-hotellist');
                    $('#dg').datagrid('reload');
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
    $.ajax({
        url:"allUser",
        success:function (data) {
            var id=${selecthotel.uid };
            for(var i=0;i<data.length;i++){
                if(data[i].id==id){
                    $("#uid").append("<option value="+data[i].id+" selected='selected'>"+data[i].username+"</option>");
                }else {
                    $("#uid").append("<option value="+data[i].id+">"+data[i].username+"</option>");
                }

            }
        }
    })
</script>
