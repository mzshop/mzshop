package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbItemActivity {
    private Long id;

    private String name;

    private Integer status;

    private Date create;

    private Date update;

    public TbItemActivity(Long id, String name, Integer status, Date create, Date update) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.create = create;
        this.update = update;
    }

    public TbItemActivity() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}