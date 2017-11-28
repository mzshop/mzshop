<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding:5px;" >
    <a id="import" class="easyui-linkbutton" onclick="importItems()">一键导入商品数据到索引库</a>
    <span id="msg"></span>
</div>
<script type="text/javascript">
    function importItems() {

        $('#import').linkbutton('disable');
        $('#msg').html('导入中，请稍后...');
        $.post("search/item/import",null,function(data){
            if(data.success){
                $.messager.alert('提示', data.message);
            } else {
                $.messager.alert('提示','导入索引库失败！');
            }
            $('#msg').html('');
        });
    }
</script>