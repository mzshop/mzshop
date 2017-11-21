<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <!-- 导入easyui的样式表 -->
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
    <link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">
    <link rel="stylesheet" href="css/common.css">
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:50px;padding-left:10px;">
    <div style="margin-top: 10px">
    <strong style="font-size: large">买折网后台管理系统</strong>
    <span style="color: red;margin-left: 900px;font-size: large">欢迎您，${findUser.username}</span></div>
</div>

<div data-options="region:'south'" style="padding:5px;background:#eee;">
    系统版本：V1.0
</div>
<div data-options="region:'west'" style="width:200px;">
    <div id="menu" class="easyui-accordion">
        <div title="商品优惠券管理" data-options="selected:true,iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'item-add'}">新增商品优惠券</li>
                <li data-options="attributes:{'href':'item-list'}">查询商品优惠券</li>
                <li data-options="attributes:{'href':'item-cat-list'}">查询商品类目</li>
                <li data-options="attributes:{'href':'item-activity-list'}">查询活动信息</li>
                <li data-options="attributes:{'href':'notice-list'}">网站通知管理</li>
                <li data-options="attributes:{'href':'item-tag-list'}">热门标签管理</li>
            </ul>
        </div>
        <div title="后台用户管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'content-category'}">用户信息管理</li>
                <%--<li data-options="attributes:{'href':'content'}">内容管理</li>--%>
            </ul>
        </div>
        <div title="索引库管理" data-options="iconCls:'icon-tip'" style="padding:10px 0;">
            <ul class="easyui-tree">
                <li data-options="attributes:{'href':'index-item'}">solr索引库维护</li>
            </ul>
        </div>
    </div>
</div>
<div data-options="region:'center'" style="background:#eee;">
    <div id="tab" class="easyui-tabs" data-options="fit:true">
        <div title="欢迎页面" style="padding:20px;">买折网后台管理页面</div>
    </div>
</div>
<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>
<%--moment.js--%>
<script src="js/moment/moment-with-locales.js"></script>
<script>
    moment.locale('zh-cn');
</script>
<!-- 自定义脚本 -->
<script src="js/common.js"></script>
<!-- 自定义js -->

<!-- 百度富文本编辑器 -->
<!-- 配置文件 -->
<script src="js/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script src="js/ueditor/ueditor.all.js"></script>
<script>
    mzshop.registerMenuEvent();

</script>
</body>
</html>