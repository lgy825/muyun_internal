package com.muyun.core.model.admin;

import java.io.Serializable;

public class Admin implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.admin_name
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.admin_pwd
     *
     * @mbggenerated
     */
    private String adminPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.admin_tel
     *
     * @mbggenerated
     */
    private String adminTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.admin_addr
     *
     * @mbggenerated
     */
    private String adminAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_admin.admin_other
     *
     * @mbggenerated
     */
    private String adminOther;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_admin
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.id
     *
     * @return the value of muyun_admin.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.id
     *
     * @param id the value for muyun_admin.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.admin_name
     *
     * @return the value of muyun_admin.admin_name
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.admin_name
     *
     * @param adminName the value for muyun_admin.admin_name
     *
     * @mbggenerated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.admin_pwd
     *
     * @return the value of muyun_admin.admin_pwd
     *
     * @mbggenerated
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.admin_pwd
     *
     * @param adminPwd the value for muyun_admin.admin_pwd
     *
     * @mbggenerated
     */
    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.admin_tel
     *
     * @return the value of muyun_admin.admin_tel
     *
     * @mbggenerated
     */
    public String getAdminTel() {
        return adminTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.admin_tel
     *
     * @param adminTel the value for muyun_admin.admin_tel
     *
     * @mbggenerated
     */
    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel == null ? null : adminTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.admin_addr
     *
     * @return the value of muyun_admin.admin_addr
     *
     * @mbggenerated
     */
    public String getAdminAddr() {
        return adminAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.admin_addr
     *
     * @param adminAddr the value for muyun_admin.admin_addr
     *
     * @mbggenerated
     */
    public void setAdminAddr(String adminAddr) {
        this.adminAddr = adminAddr == null ? null : adminAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_admin.admin_other
     *
     * @return the value of muyun_admin.admin_other
     *
     * @mbggenerated
     */
    public String getAdminOther() {
        return adminOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_admin.admin_other
     *
     * @param adminOther the value for muyun_admin.admin_other
     *
     * @mbggenerated
     */
    public void setAdminOther(String adminOther) {
        this.adminOther = adminOther == null ? null : adminOther.trim();
    }
}