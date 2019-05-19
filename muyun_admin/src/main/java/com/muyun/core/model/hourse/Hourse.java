package com.muyun.core.model.hourse;

import java.io.Serializable;
import java.util.Date;

public class Hourse implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_id
     *
     * @mbggenerated
     */
    private String hId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.u_id
     *
     * @mbggenerated
     */
    private String uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_number_area
     *
     * @mbggenerated
     */
    private String hNumberArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_number
     *
     * @mbggenerated
     */
    private String hNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_desc
     *
     * @mbggenerated
     */
    private String hDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_addr
     *
     * @mbggenerated
     */
    private String hAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column muyun_hourse.h_date
     *
     * @mbggenerated
     */
    private Date hDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table muyun_hourse
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_id
     *
     * @return the value of muyun_hourse.h_id
     *
     * @mbggenerated
     */
    public String gethId() {
        return hId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_id
     *
     * @param hId the value for muyun_hourse.h_id
     *
     * @mbggenerated
     */
    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.u_id
     *
     * @return the value of muyun_hourse.u_id
     *
     * @mbggenerated
     */
    public String getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.u_id
     *
     * @param uId the value for muyun_hourse.u_id
     *
     * @mbggenerated
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_number_area
     *
     * @return the value of muyun_hourse.h_number_area
     *
     * @mbggenerated
     */
    public String gethNumberArea() {
        return hNumberArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_number_area
     *
     * @param hNumberArea the value for muyun_hourse.h_number_area
     *
     * @mbggenerated
     */
    public void sethNumberArea(String hNumberArea) {
        this.hNumberArea = hNumberArea == null ? null : hNumberArea.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_number
     *
     * @return the value of muyun_hourse.h_number
     *
     * @mbggenerated
     */
    public String gethNumber() {
        return hNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_number
     *
     * @param hNumber the value for muyun_hourse.h_number
     *
     * @mbggenerated
     */
    public void sethNumber(String hNumber) {
        this.hNumber = hNumber == null ? null : hNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_desc
     *
     * @return the value of muyun_hourse.h_desc
     *
     * @mbggenerated
     */
    public String gethDesc() {
        return hDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_desc
     *
     * @param hDesc the value for muyun_hourse.h_desc
     *
     * @mbggenerated
     */
    public void sethDesc(String hDesc) {
        this.hDesc = hDesc == null ? null : hDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_addr
     *
     * @return the value of muyun_hourse.h_addr
     *
     * @mbggenerated
     */
    public String gethAddr() {
        return hAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_addr
     *
     * @param hAddr the value for muyun_hourse.h_addr
     *
     * @mbggenerated
     */
    public void sethAddr(String hAddr) {
        this.hAddr = hAddr == null ? null : hAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column muyun_hourse.h_date
     *
     * @return the value of muyun_hourse.h_date
     *
     * @mbggenerated
     */
    public Date gethDate() {
        return hDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column muyun_hourse.h_date
     *
     * @param hDate the value for muyun_hourse.h_date
     *
     * @mbggenerated
     */
    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }
}