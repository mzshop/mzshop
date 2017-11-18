package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbItemActivity {
    private Long id;

    private String name;

    private Integer status;

    private Date created;

    private Date updated;

    public TbItemActivity(Long id, String name, Integer status, Date created, Date updated) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.created = created;
        this.updated = updated;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}