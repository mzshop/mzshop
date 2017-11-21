<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="tagtoolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>标签名称：</label>
        <input class="easyui-textbox" type="text" id="name">
        <label>标签状态：</label>
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
<table id="tagtb"></table>
<script>
    function add() {
        mzshop.addTab('新增热门标签','item-cat-add');
    }
    function edit() {
        alert('编辑按钮');
    }
    function remove() {
        var selectedRows=$("#tagtb").datagrid("getSelections");
        if(selectedRows.length==0){
            $.messager.alert("提示","请至少选中一条记录");
            return;
        }
        $.messager.confirm("确认","您确认想要删除标签吗？",function(r){
            var ids=[];
            if(r){
                for(var i=0;i<selectedRows.length;i++) {
                    ids.push(selectedRows[i].id);
                }
                $.post(
                    "itemTags/batchRemove",
                    {'ids[]':ids},
                    function (data) {
                        $("#tagtb").datagrid('reload');
                    },
                    'json'
                );
            }
        });
    }

    function searchForm() {
        $('#tagtb').datagrid('load',{
            name: $('#name').val(),
            status: $('#status').combobox('getValue')
        });
    }



$(function () {


    $("#tagtb").datagrid({
        multiSort:true,
        toolbar:'#tagtoolbar',
        url: 'itemTags',
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
            {field: 'id', title: '标签编号', width: 100,sortable:true},
            {field: 'name', title: '标签名称', width: 100,sortable:true},
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
