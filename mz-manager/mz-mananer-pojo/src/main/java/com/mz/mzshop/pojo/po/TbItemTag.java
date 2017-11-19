package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbItemTag {
    private Long id;

    private String name;

    private Date created;

    private Date updated;

    private Byte status;

    public TbItemTag(Long id, String name, Date created, Date updated, Byte status) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.updated = updated;
        this.status = status;
    }

    public TbItemTag() {
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}