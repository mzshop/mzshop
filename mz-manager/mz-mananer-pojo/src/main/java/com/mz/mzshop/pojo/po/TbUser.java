package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbUser {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private Integer right;

    private Date created;

    private Date updated;

    public TbUser(Long id, String username, String password, String phone, Integer right, Date created, Date updated) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.right = right;
        this.created = created;
        this.updated = updated;
    }

    public TbUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
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