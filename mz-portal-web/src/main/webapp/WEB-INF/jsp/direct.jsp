<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="language" content="zh-CN">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
    <meta name="renderer" content="webkit">
    <meta name="author" content="inheader">
    <title>买折吧-每天千款优惠券秒杀，一折限时疯抢！</title>
    <meta name="keywords" content="买折吧,优惠券折扣,9块9包邮,限时特卖,优品折扣">
    <meta name="description" content="买折吧-优惠券折扣直播第一站！每天更新千款，纯人工筛选验货，限时限量特卖，全场1折包邮！">
    <link rel="stylesheet" type="text/css" href="css/76a94faf8038f9e4.css-v=1500608085.css"/><link rel="icon" href="images/favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/7bedf0a2b7f3aa30.css-v=1500605740.css"/><script type="text/javascript" src="js/jquery.min.js"></script>
</head>


<body>
<div id="header-user">
    <div id="header-user-navigator">
        <div class="navigator-c1 fl">${tbNotice.top}</div>
        <a style="padding-left: 20px" target="_blank" href="" /></a>
        <ul class="navigator-c1 fr">
            <li><a href="javascript:void(0);" rel="sethome" title="将本站设为首页">设为首页</a></li>
            <li><a href="javascript:void(0);" rel="favorite" title="加入收藏，方便下次打开">加入收藏</a></li>
            <li><a  target="_blank" href=""><img src="images/qq_contact.png-v=20170614.png" /></a></li>
        </ul>
    </div>
</div>

<div id="header-info-common">
    <div id="header">
        <a class="logo fl" href="${pageContext.request.contextPath}/" ><img src="images/583324827db3e.png" /></a>
        <div class="header-search">
            <div class="search">
                <form method="get" action="http://www.maizheba.com/?r=find/" id="" name="filterForm" data-pjax="true">
                    <input type="text" autocomplete="off" value="" placeholder="特价这里有，赶紧搜一搜" class="input_key js-query" id="kw" name="kw" />
                    <input type="hidden" name="token" value="qft0i1pcfokjn8p9e35eqftj14" />
                    <button rel="search" type="submit" >搜索</button>
                </form>
            </div>
            <div class="promise fr"></div>
        </div>
    </div>
</div>

<div id="nav-inner">
    <div id="nav">
        <a class="active" href="${pageContext.request.contextPath}/" >首页</a>
        <a class="" href="-r=direct.htm">优惠券直播<i class=""></i></a>
        <a class="" href="-r=popularity.htm">今日疯抢榜<i class="hot"></i></a>
        <a class="" href="-r=sift.htm">优质评分榜<i class=""></i></a>
        <a class="" href="-r=cheap.htm">九块九精选<i class=""></i></a>
    </div>
</div>

<div id="layout">
    <div class="search-wrap main-container">
        <br>
        <img src="images/middle.png">

    </div><br>
    <form action="" method="get" onsubmit="return screen();" target="_self" data-pjax="true" id="filterform">
        <div class="cat-wrap main-container">
            <div class="cat-list clearfix">
                <ul class="clearfix">
                    <li class="active"><a href="${pageContext.request.contextPath}/" tppabs="http://www.maizheba.com/?r=">全部类别</a></li>
                   <c:forEach items="${listTbItemCat}" var="itemCat">
                       <li class=""><a href="${pageContext.request.contextPath}/directByPage?cid=${itemCat.id}">${itemCat.name}</a></li>
                   </c:forEach>
                </ul>
            </div>
        </div>
        <div class="tag-wrap main-container clearfix">
            <div class="tags">
                <span class="text">热门标签：</span>
                <a class="" href="">羽绒服</a>
                <a class="" href="">睡衣</a>
                <a class="" href="">三只松鼠</a>
                <a class="" href="">拖鞋</a>
                <a class="" href="">女装</a>
                <a class="" href="">童装</a>
                <a class="" href="">卫衣</a>
                <a class="" href="">打底裤</a>
                <a class="" href="">保温杯</a>
                <a class="" href="">毛衣</a>
            </div>
        </div>
        <input class="submit" type="submit" />
    </form>

    <div class="goods-list main-container direct_dft">
        <ul class="clearfix">
            <c:forEach items="${tbItemList}" var="tbItem">
            <li class="goods-item">
                <a href="">
                    <img _src="${tbItem.image}"/>
                </a>
                <div class="padding">
                    <a target="_blank" href="">
                        <i class="taobao"></i>
                        <span>${tbItem.title}</span>
                    </a>
                    <div class="coupon-wrap clearfix">
                        优惠券<span class="price">${tbItem.coupon}</span>元，已有<span
                            class="num">0 </span>人购买
                    </div>
                </div>
                <div class="price-wrap clearfix">
                    <div class="price">
                        <span class="text text1">券后价&nbsp;￥<span class="price">${tbItem.normalPrice}</span></span>
                        <span class="text text2">￥${tbItem.price} </span>
                    </div>
                </div>
            </li>
            </c:forEach>

    </div>
    <div class="pages">
        <ul class='pagination'>
            <li><a href="">&lt;&lt;首页</a></li>
            <li><a href="${pageContext.request.contextPath}/directByPage?currentPage=${page2.currentPage-1}&cid=${page2.cid}" >上一页</a></li>
            <li class="active"><a>第${page2.currentPage}/${page2.totalPage}页</a></li>
            <li><a href="${pageContext.request.contextPath}/directByPage?currentPage=${page2.currentPage+1}&cid=${page2.cid}" >下一页</a></li>
            <li><a href="">尾页&gt;&gt;</a></li>
            <li class="active"><a >共${page2.totalRows}条</a></li>
        </ul>
    </div>
</div>


<code hidden="analysis">
    <script>var pid = 'mm_29314070_16780902_62160278';</script>
</code>

<script type="text/javascript" src="js/ray.js-v=20170614.js" tppabs="http://public.zhfile.com/js/ray.js?v=20170614">
</script>
<script type="text/javascript" src="js/0746ea6cd5b26f6b.js-v=1496730003.js" tppabs="http://cms.shihuizhu.net/cached/compile/0746ea6cd5b26f6b.js?v=1496730003">
</script>
<div id="footer">
    <div class="footer-wrapper">
        <div class="bottom">
            <p class="one">搜罗最精品商品，为您带来全网一手优惠券，买到最实惠</p>
            <p class="text"> Copyright © 2016 &nbsp;买折吧 &nbsp;&nbsp;
                <a href="" tppabs="http://www.miitbeian.gov.cn/publish/query/indexFirst.action"
                   target="_blank">蜀ICP备14000823号-3</a>
            </p>
        </div>
    </div>

    <div class="choice" stats="0">
        <div class="gotop"><a href="#top">&#10094;</a></div>
    </div>
</div>

</body>
</html>
