package com.mz.mzshop.pojo.po;

public class TbNotice {
    private String top;

    private String middle;

    private String foot;

    public TbNotice(String top, String middle, String foot) {
        this.top = top;
        this.middle = middle;
        this.foot = foot;
    }

    public TbNotice() {
        super();
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top == null ? null : top.trim();
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle == null ? null : middle.trim();
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot == null ? null : foot.trim();
    }
}