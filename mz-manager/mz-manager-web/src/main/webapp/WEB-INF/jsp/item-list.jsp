<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>商品名称：</label>
        <input class="easyui-textbox" type="text" id="title">
        <label>商品状态：</label>
        <select id="status" class="easyui-combobox" >
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">待审核</option>
            <option value="3">下架</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
        <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>
    </div>
</div>
<table id="tb"></table>
<script>
    function add() {
        mzshop.addTab('新增商品','item-add');
    }
    function edit() {
        alert('编辑按钮');
    }
    function remove() {
        var selectedRows=$("#tb").datagrid("getSelections");
        if(selectedRows.length==0){
            $.messager.alert("提示","请至少选中一条记录");
            return;
        }
        $.messager.confirm("确认","您确认想要删除记录吗？",function(r){
            var ids=[];
            if(r){
                for(var i=0;i<selectedRows.length;i++) {
                    ids.push(selectedRows[i].id);
                }
                $.post(
                    "items/batchRemove",
                    {'ids[]':ids},
                    function (data) {
                        $("#tb").datagrid('reload');
                    },
                    'json'
                );
            }
        });
    }
    function down() {
        var selectedRows=$("#tb").datagrid("getSelections");
        if(selectedRows.length==0){
            $.messager.alert('提示','请至少选中一条记录');
            return;
        }
        $.messager.confirm('确认','您确认要下架选中商品？',function (r) {
            if(r){
                var ids=[];
                for(var i=0;i<selectedRows.length;i++){
                    ids.push(selectedRows[i].id);
                }
                $.post(
                    'items/batchDown',
                    {'ids[]':ids},
                    function(data){
                        $("#tb").datagrid("reload");
                    },
                    'json'
                );
            }
        });
    }
    function up() {
        var selectedRows=$("#tb").datagrid("getSelections");
        if(selectedRows.length==0){
            $.messager.alert('提示','请至少选中一条记录');
            return;
        }
        $.messager.confirm('确认','您确认要上架选中商品？',function (r) {
            if(r){
                var ids=[];
                for(var i=0;i<selectedRows.length;i++){
                    ids.push(selectedRows[i].id);
                }
                $.post(
                    'items/batchUp',
                    {'ids[]':ids},
                    function(data){
                        $("#tb").datagrid("reload");
                    },
                    'json'
                );
            }
        });
    }
    function searchForm() {
        $('#tb').datagrid('load',{
            title: $('#title').val(),
            status: $('#status').combobox('getValue')
        });
    }



    $("#tb").datagrid({
        multiSort:true,
        toolbar:'#toolbar',
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
        pageSize: 5,
        //分页列表
        pageList: [5,10,20],
        //列属性
        columns: [[
            //field title width列属性
            {field: 'ck', checkbox: true},
            {field: 'id', title: '商品编号', width: 100,sortable:true},
            {field: 'title', title: '商品名称', width: 100,sortable:true},
            {field: 'priceView', title: '券后价', width: 100},
            {field: 'normalPriceView', title: '正常售价', width: 100},
            {field: 'soldNum', title: '已购买人数', width: 100},
            {field: 'couponView', title: '优惠券金额', width: 100},
            {field: 'sum', title: '优惠券总数', width: 100},
            {field: 'catName', title: '商品类目', width: 100},
            {field: 'userName', title: '上传人', width: 100},
            {field: 'activityName', title: '活动类目', width: 100},
            {field: 'stale', title: '过期时间', width: 100,formatter:function (value,row,index) {
                return moment(value).format('LL');
            }},
            {field: 'statusName', title: '状态', width: 100},
            {field: 'url', title: '优惠券链接', width: 100},
            {field: 'updated', title: '更新时间', width: 100,formatter:function (value,row,index) {
                return moment(value).format('LL');
            }},
            {field: 'createdString', title: '上传时间', width: 100}
        ]]
    });
</script>
