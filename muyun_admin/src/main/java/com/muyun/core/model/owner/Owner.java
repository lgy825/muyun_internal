package com.muyun.core.model.owner;

import java.io.Serializable;
import java.util.Date;

public class Owner implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_rel_name
     *
     * @mbggenerated
     */
    private String uRelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_name
     *
     * @mbggenerated
     */
    private String uName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_pwd
     *
     * @mbggenerated
     */
    private String uPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_tel
     *
     * @mbggenerated
     */
    private String uTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_addr
     *
     * @mbggenerated
     */
    private String uAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_desc
     *
     * @mbggenerated
     */
    private String uDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_date
     *
     * @mbggenerated
     */
    private Date uDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.token
     *
     * @mbggenerated
     */
    private Integer token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_email
     *
     * @mbggenerated
     */
    private String uEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column myun_owner.u_status
     *
     * @mbggenerated
     */
    private Integer uStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table myun_owner
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.id
     *
     * @return the value of myun_owner.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.id
     *
     * @param id the value for myun_owner.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_rel_name
     *
     * @return the value of myun_owner.u_rel_name
     *
     * @mbggenerated
     */
    public String getuRelName() {
        return uRelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_rel_name
     *
     * @param uRelName the value for myun_owner.u_rel_name
     *
     * @mbggenerated
     */
    public void setuRelName(String uRelName) {
        this.uRelName = uRelName == null ? null : uRelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_name
     *
     * @return the value of myun_owner.u_name
     *
     * @mbggenerated
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_name
     *
     * @param uName the value for myun_owner.u_name
     *
     * @mbggenerated
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_pwd
     *
     * @return the value of myun_owner.u_pwd
     *
     * @mbggenerated
     */
    public String getuPwd() {
        return uPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_pwd
     *
     * @param uPwd the value for myun_owner.u_pwd
     *
     * @mbggenerated
     */
    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_tel
     *
     * @return the value of myun_owner.u_tel
     *
     * @mbggenerated
     */
    public String getuTel() {
        return uTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_tel
     *
     * @param uTel the value for myun_owner.u_tel
     *
     * @mbggenerated
     */
    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_addr
     *
     * @return the value of myun_owner.u_addr
     *
     * @mbggenerated
     */
    public String getuAddr() {
        return uAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_addr
     *
     * @param uAddr the value for myun_owner.u_addr
     *
     * @mbggenerated
     */
    public void setuAddr(String uAddr) {
        this.uAddr = uAddr == null ? null : uAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_desc
     *
     * @return the value of myun_owner.u_desc
     *
     * @mbggenerated
     */
    public String getuDesc() {
        return uDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_desc
     *
     * @param uDesc the value for myun_owner.u_desc
     *
     * @mbggenerated
     */
    public void setuDesc(String uDesc) {
        this.uDesc = uDesc == null ? null : uDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_date
     *
     * @return the value of myun_owner.u_date
     *
     * @mbggenerated
     */
    public Date getuDate() {
        return uDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_date
     *
     * @param uDate the value for myun_owner.u_date
     *
     * @mbggenerated
     */
    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.token
     *
     * @return the value of myun_owner.token
     *
     * @mbggenerated
     */
    public Integer getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.token
     *
     * @param token the value for myun_owner.token
     *
     * @mbggenerated
     */
    public void setToken(Integer token) {
        this.token = token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_email
     *
     * @return the value of myun_owner.u_email
     *
     * @mbggenerated
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_email
     *
     * @param uEmail the value for myun_owner.u_email
     *
     * @mbggenerated
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column myun_owner.u_status
     *
     * @return the value of myun_owner.u_status
     *
     * @mbggenerated
     */
    public Integer getuStatus() {
        return uStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column myun_owner.u_status
     *
     * @param uStatus the value for myun_owner.u_status
     *
     * @mbggenerated
     */
    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}