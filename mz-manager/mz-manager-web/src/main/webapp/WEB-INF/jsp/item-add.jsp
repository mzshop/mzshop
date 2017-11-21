<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">商品类目：</td>
                <td>
                    <input id="cid" name="cid" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">商品标题：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="title" name="title"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">商品券后价：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="priceView" name="priceView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="price" name="price">
                </td>
            </tr>
            <tr>
                <td class="label">商品正常售价：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="normalPriceView" name="normalPriceView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="normalPrice" name="normalPrice">
                </td>
            </tr>
            <tr>
                <td class="label">优惠券金额：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="couponView" name="couponView"
                           data-options="required:true,min:0,precision:2">
                    <input type="hidden" id="coupon" name="coupon">
                </td>
            </tr>
            <tr>
                <td class="label">优惠券总数：</td>
                <td>
                    <input class="easyui-numberbox" type="text" id="sum" name="sum"
                           data-options="required:true,min:0,precision:0">
                </td>
            </tr>
            <tr>
                <td class="label">商品优惠所属活动类目：</td>
                <td>
                    <input id="aid" name="aid" style="width:200px;">
                </td>
            </tr>
            <tr>
                <td class="label">商品优惠券链接：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="url" name="url"
                           data-options="required:true" style="width:100%">
                </td>
            </tr>
            <tr>
                <td class="label">过期时间：</td>
                <td>
                    <input  id="stale"  type= "text" class= "easyui-datebox" name="stale"
                            required ="required">
                </td>
            </tr>

            <tr>
                <td class="label">主图上传：</td>
                <td colspan="2">
                    <!-- 加载编辑器的容器 -->
                    <script id="container" name="image" type="text/plain"></script>
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
    function clearForm(){
        $('#itemAddForm').form('reset');
        ue.setContent('');
    }
    //提交表单
    function submitForm(){
        $('#itemAddForm').form('submit',{
            //提交表单到item进行处理
            url: 'addItem',
            //在表单提交之前触发
            onSubmit:function () {

                $('#price').val($('#priceView').val()*100);
                $('#normalPrice').val($('#normalPriceView').val()*100);
                $('#coupon').val($('#couponView').val()*100);
                return $(this).form('validate');
            },
            //后台处理成功之后的回调函数
            success:function(data){
                if(data > 0) {
                    $.messager.alert('温馨提示','恭喜！添加商品优惠券成功！');
                    mzshop.addTab('查询商品优惠券', 'item-list');
                }
            }
        });
    }

    //实例化编辑器
    var ue = UE.getEditor('container',{
        initialFrameWidth: '100%',
        initialFrameHeight: '400'
    });
    //加载商品类目的树形下拉框
    $('#cid').combotree({
        url: 'itemCatNodes',
        required: true,
        onBeforeSelect: function (node) {
            var isLeaf = $('#cid').tree('isLeaf', node.target);
            if (!isLeaf) {
                $.messager.alert('警告', '请选中最终的类别！', 'warning');
                return false;
            }
        }
    });
    //加载活动类目的树形下拉框
    $('#aid').combotree({
        url: 'itemActivityNodes',
        required: true,
        onBeforeSelect: function (node) {
            var isLeaf = $('#aid').tree('isLeaf', node.target);
            if (!isLeaf) {
                $.messager.alert('警告', '请选中最终的类别！', 'warning');
                return false;
            }
        }
    });

</script>