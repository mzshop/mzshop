package com.mz.mzshop.common.dto;

/**
 * User: Administrator
 * Date: 2017/11/7
 * Time: 20:51
 * Version:V1.0
 */
public class Page {
    private Integer page;
    private Integer rows;
    private Integer offset;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getOffset() {
        return (page-1)*rows;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
