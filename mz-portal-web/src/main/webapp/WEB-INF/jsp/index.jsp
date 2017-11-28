<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
    <link rel="stylesheet" type="text/css" href="css/76a94faf8038f9e4.css-v=1500608085.css"/><link rel="icon" href="../images/favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/7bedf0a2b7f3aa30.css-v=1500605740.css"/><script type="text/javascript" src="../js/jquery.min.js"></script>
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
        <a class="logo fl" href="-r=.htm" ><img src="images/583324827db3e.png" /></a>
        <div class="header-search">
            <div class="search">
                <form method="get" action="http://www.maizheba.com/?r=find/" id="filterForm" name="filterForm" data-pjax="true">
                    <input type="text" autocomplete="off" value="" placeholder="特价这里有，赶紧搜一搜" class="input_key js-query" id="kw" name="kw" />
                    <input type="hidden" name="token" value="qft0i1pcfokjn8p9e35eqftj14" />
                    <button rel="search" type="submit" >搜索</button>
                </form>
            </div>
            <div class="promise fr"></div>
        </div>
    </div>
</div>

<div id="nav-inner-copy">
    <div id="nav">
        <a class="active" href="-r=.htm" >首页</a>
        <a class="" href="-r=direct.htm">优惠券直播<i class=""></i></a>
        <a class="" href="-r=popularity.htm">今日疯抢榜<i class="hot"></i></a>
        <a class="" href="-r=sift.htm">优质评分榜<i class=""></i></a>
        <a class="" href="-r=cheap.htm">九块九精选<i class=""></i></a>
    </div>
</div>


<div id="layout" class="index-layout">
    <div id="banner">
        <div class="banner_con clearfix">
            <div class="cates">优惠商品分类</div>
            <div class="icateBox" style="width: 260px;float: left">
                <div class="cateTrees">
                    <ul>

                        <li class="primary_nav_li">
                            <dl class="nav_warp">
                                <dt><a class="" href="-r=direct.htm" tppabs="http://www.maizheba.com/?r=direct"><span></span><i class="cate_18 "></i>全部</a></dt>
                            </dl>
                        </li>

                        <c:forEach items="${listTbItemCat}" var="tbItemCat" varStatus="">
                            <li class="primary_nav_li">
                                <dl class="nav_warp">
                                    <dt><a class="" href="-r=direct.htm" tppabs="http://www.maizheba.com/?r=direct"><span></span><i class="cate_18 "></i>${tbItemCat.name}...</a></dt>
                                </dl>
                            </li>

                        </c:forEach>


                    </ul>
                </div>
            </div>
            <div class="unslider fl">
                <div id="fsD1" class="focus">
                    <div id="D1pic1" class="fPic">
                        <c:forEach items="${ad1List}" var="node" varStatus="status">
                            <div class="fcon">
                                <a name="sfbest_hp_hp_focus_${status.index}" href="${node.url}">
                                    <img id="lunbo_1" alt="${node.title}" src="${node.pic}">
                                </a>
                                <span class="shadow">
                                <a>${node.title}</a></span>
                            </div>
                        </c:forEach>
                    </div>

                    <div class="fbg">
                        <div class="D1fBt" id="D1fBt">
                            <a href="javascript:void(0)" hidefocus="true" target="_self"><i>44</i></a>
                            <a href="javascript:void(0)" hidefocus="true" target="_self"><i>41</i></a>
                            <a href="javascript:void(0)" hidefocus="true" target="_self"><i>45</i></a>
                            <a href="javascript:void(0)" hidefocus="true" target="_self"><i>47</i></a>
                            <a href="javascript:void(0)" hidefocus="true" target="_self"><i>46</i></a>
                        </div>
                    </div>
                    <span class="prev"></span>
                    <span class="next"></span>
                </div>
            </div>
        </div>
    </div>
    <div id="content">
        <div class="divider">
            ${tbNotice.middle}
        <div class="discount">
            <div class="discount_head clearfix">
                <div class="dishead_left headlines fl">
                    <i></i>
                    <h1>领券秒杀精选</h1>
                </div>
                <div class="dishead_right fr">
                    <span class="color_p">/ 将优选、性价比做到极致 /</span>
                </div>
            </div>
            <div class="dis_product">

                <div class="pro_detail ">
                    <a href="-r=item-641607.htm" target="_blank">
                        <img _src="../images2/meinv.jpg"/>
                    </a>
                    <div class="pro_intro fr">
                        <p class="pro_title">
                            <a href="-r=item-641607.htm"  target="_blank" isconvert="1">真找不到什么东西卖，就卖这个了</a>
                        </p>
                        <div class="pro_price color_p">
                            <i class="iconfont">
                                &#xe60a;</i>内部券<em>30</em>元，过期时间<span>20171119</span>
                        </div>
                        <div class="residue">
                            优惠券总数<i class="color_p">5000</i>张
                        </div>
                        <div class="pro_nowPri">
                            <span>下单价 ￥<em>59.00</em></span>
                            在售价<em class="inPri">￥89.00</em>
                        </div>
                        <div class="buy">
                            <span class="sp1">购买流程：</span>
                            <a href="-r=item-641607.htm" target="_blank">
                                <span class="indexBorder"> ①点我领券</span>
                            </a>
                            <span class="indexto">> </span>
                            <a href="-r=item-641607.htm" target="_blank">
                                <span class="indexBorder">②点击下单</span>
                            </a>
                        </div>
                    </div>
                </div>



                <div class="pro_detail ">
                    <a href="-r=item-641607.htm" target="_blank">
                        <img _src="../images2/weijin.jpg"/></a>
                    <div class="pro_intro fr">
                        <p class="pro_title">
                            <a href="-r=item-641607.htm" target="_blank" isconvert="1">这个围巾不得了</a>
                        </p>
                        <div class="pro_price color_p">
                            <i class="iconfont">
                                &#xe60a;</i>内部券<em>10</em>元，过期时间<span>20171120</span>
                        </div>
                        <div class="residue">
                            优惠券总数<i class="color_p">10000</i>张
                        </div>
                        <div class="pro_nowPri">
                            <span>下单价 ￥<em>49.90</em></span>
                            在售价<em class="inPri">￥59.90</em>
                        </div>
                        <div class="buy">
                            <span class="sp1">购买流程：</span>
                            <a href="-r=item-641607.htm"target="_blank">
                                <span class="indexBorder"> ①点我领券</span>
                            </a>
                            <span class="indexto">> </span>
                            <a href="-r=item-641607.htm" target="_blank">
                                <span class="indexBorder">②点击下单</span>
                            </a>
                        </div>
                    </div>
                </div>

            </div>

            <script type="text/javascript" src="js/jquery.min.js-v=20170614.js"></script>
            <script type="text/javascript" src="js/koala.min.1.5.js-v=20170614.js" ></script>

            <script type="text/javascript">
                Qfast.add('widgets', {path: "js/terminator2.2.min.js"/*tpa=http://cms.shihuizhu.net//static/js/terminator2.2.min.js*/, type: "js", requires: ['fx']});
            </script>


            <code hidden="analysis">
                <script>var pid = 'mm_29314070_16780902_62160278'</script>
            </code>

            <script type="text/javascript" src="js/ray.js-v=20170614.js" ></script>
            <script type="text/javascript" src="js/0746ea6cd5b26f6b.js-v=1496730003.js"></script>
            <div id="footer">
            <div class="footer-wrapper">
                <div class="bottom">
                    <p class="one">${tbNotice.foot}</p>
                    <p class="text"> Copyright © 2016 &nbsp;买折吧 &nbsp;&nbsp;
                        <a href=""
                           target="_blank">蜀ICP备14000823号-3</a>
                    </p>
                </div>
            </div>

            <div class="choice" stats="0">
                <div class="gotop"><a href="#top">&#10094;</a></div>
            </div>
        </div>
        </div>
        </div></div>
</div>


</body>
</html>
