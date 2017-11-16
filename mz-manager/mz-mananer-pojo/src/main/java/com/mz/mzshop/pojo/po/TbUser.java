package com.mz.mzshop.pojo.po;

import java.util.Date;

public class TbUser {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private Integer right;

    private Date create;

    private Date update;

    public TbUser(Long id, String username, String password, String phone, Integer right, Date create, Date update) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.right = right;
        this.create = create;
        this.update = update;
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