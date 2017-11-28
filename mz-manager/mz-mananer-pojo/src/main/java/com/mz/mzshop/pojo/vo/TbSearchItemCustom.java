package com.mz.mzshop.pojo.vo;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:18
 * Version:V1.0
 */
public class TbSearchItemCustom {
    private String id;//solr中的id是字符串格式
    private String title;
    private long price;
    private long normalPrice;
    private long coupon;
    private long soldNum;
    private String image;
    private String catName;
    private String activityName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(long normalPrice) {
        this.normalPrice = normalPrice;
    }

    public long getCoupon() {
        return coupon;
    }

    public void setCoupon(long coupon) {
        this.coupon = coupon;
    }

    public long getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(long soldNum) {
        this.soldNum = soldNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}
