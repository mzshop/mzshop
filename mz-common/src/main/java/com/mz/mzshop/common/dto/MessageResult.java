package com.mz.mzshop.common.dto;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:46
 * Version:V1.0
 */
public class MessageResult {
    private boolean success;
    private String message;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
