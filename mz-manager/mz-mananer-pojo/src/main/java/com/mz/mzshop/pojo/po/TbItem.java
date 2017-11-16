package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbItem {
    private Long id;

    private String title;

    private Long price;

    private Long normalPrice;

    private String image;

    private Long soldNum;

    private Long coupon;

    private Long sum;

    private Integer cid;

    private Integer uid;

    private Integer aid;

    private Date create;

    private Date update;

    private Date stale;

    private Integer status;

    public TbItem(Long id, String title, Long price, Long normalPrice, String image, Long soldNum, Long coupon, Long sum, Integer cid, Integer uid, Integer aid, Date create, Date update, Date stale, Integer status) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.normalPrice = normalPrice;
        this.image = image;
        this.soldNum = soldNum;
        this.coupon = coupon;
        this.sum = sum;
        this.cid = cid;
        this.uid = uid;
        this.aid = aid;
        this.create = create;
        this.update = update;
        this.stale = stale;
        this.status = status;
    }

    public TbItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(Long normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Long soldNum) {
        this.soldNum = soldNum;
    }

    public Long getCoupon() {
        return coupon;
    }

    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Date getStale() {
        return stale;
    }

    public void setStale(Date stale) {
        this.stale = stale;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}