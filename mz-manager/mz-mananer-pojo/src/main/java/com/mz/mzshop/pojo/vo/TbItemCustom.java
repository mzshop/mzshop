package com.mz.mzshop.pojo.vo;

import com.mz.mzshop.pojo.po.TbItem;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 21:26
 * Version:V1.0
 */
public class TbItemCustom extends TbItem{
    private Long priceView;
    private Long normalPriceView;
    private Long couponView;
    private String catName;
    private String userName;
    private String activityName;
    private String statusName;
    private String createdString;

    public Long getPriceView() {
        return priceView;
    }

    public void setPriceView(Long priceView) {
        this.priceView = priceView;
    }

    public Long getNormalPriceView() {
        return normalPriceView;
    }

    public void setNormalPriceView(Long normalPriceView) {
        this.normalPriceView = normalPriceView;
    }

    public Long getCouponView() {
        return couponView;
    }

    public void setCouponView(Long couponView) {
        this.couponView = couponView;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCreatedString() {
        return createdString;
    }

    public void setCreatedString(String createdString) {
        this.createdString = createdString;
    }
}
