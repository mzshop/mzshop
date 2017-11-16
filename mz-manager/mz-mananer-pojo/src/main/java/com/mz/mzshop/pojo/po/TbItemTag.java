package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbItemTag {
    private Long id;

    private String name;

    private Date create;

    private Date update;

    public TbItemTag(Long id, String name, Date create, Date update) {
        this.id = id;
        this.name = name;
        this.create = create;
        this.update = update;
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