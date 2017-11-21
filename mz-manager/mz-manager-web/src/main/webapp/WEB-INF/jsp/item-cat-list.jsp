<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="catToolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>商品类目名称：</label>
        <input class="easyui-textbox" type="text" id="name">
        <label>类目状态：</label>
        <select id="status" class="easyui-combobox" >
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">删除</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<table id="cattb"></table>
<script>
    function add() {
        mzshop.addTab('新增商品类目','item-cat-add');
    }
    function edit() {
        alert('编辑按钮');
    }
    function remove() {
        var selectedRows=$("#cattb").datagrid("getSelections");
        if(selectedRows.length==0){
            $.messager.alert("提示","请至少选中一条记录");
            return;
        }
        $.messager.confirm("确认","您确认想要删除类目吗？",function(r){
            var ids=[];
            if(r){
                for(var i=0;i<selectedRows.length;i++) {
                    ids.push(selectedRows[i].id);
                }
                $.post(
                    "itemCats/batchRemove",
                    {'ids[]':ids},
                    function (data) {
                        $("#cattb").datagrid('reload');
                    },
                    'json'
                );
            }
        });
    }

    function searchForm() {
        $('#cattb').datagrid('load',{
            name: $('#name').val(),
            status: $('#status').combobox('getValue')
        });
    }



$(function () {


    $("#cattb").datagrid({
        multiSort:true,
        toolbar:'#catToolbar',
        url: 'itemCats',
        //隔行变色，斑马线效果
        striped: true,
        //添加分页工具栏
        pagination: true,
        //每行的前面显示行号
        rownumbers: true,
        //使得数据表格自适应填充父容器
        fit: true,
        //默认显示10条，这样的话就显示20条
        pageSize: 5,
        //分页列表
        pageList: [5,10,20],
        //列属性
        columns: [[
            //field title width列属性
            {field: 'ck', checkbox: true},
            {field: 'id', title: '商品类目编号', width: 100,sortable:true},
            {field: 'name', title: '商品类目名称', width: 100,sortable:true},
            {field: 'statusName', title: '状态', width: 100},
            {field: 'updated', title: '更新时间', width: 100,formatter:function (value,row,index) {
                return moment(value).format('LL');
            }},
            {field: 'created', title: '创建时间', width: 100,formatter:function (value,row,index) {
                return moment(value).format('LL');
            }}
        ]]
    });
})
</script>
