package com.muyun.core.util;

/**
 * app后台请求参数 ClassName:AppRequestParam
 *
 * @author ligy-008494
 * @create 2019-05-27 11:53
 */
public class AppRequestParam {
    private String ownerPhone;
    private String ownerPwd;
    private String ownerRelName;
    private String ownerName;
    private String beginTime;
    private String endTime;
    private String token;
    private String ownerId;
    private String orderId;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerPwd() {
        return ownerPwd;
    }

    public void setOwnerPwd(String ownerPwd) {
        this.ownerPwd = ownerPwd;
    }

    public String getOwnerRelName() {
        return ownerRelName;
    }

    public void setOwnerRelName(String ownerRelName) {
        this.ownerRelName = ownerRelName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

