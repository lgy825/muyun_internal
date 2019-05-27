package com.muyun.core.model.order;

import java.io.Serializable;

public class PayWay implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yunmu_pay_way.p_id
     *
     * @mbggenerated
     */
    private Integer pId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yunmu_pay_way.p_name
     *
     * @mbggenerated
     */
    private String pName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yunmu_pay_way.p_temp
     *
     * @mbggenerated
     */
    private String pTemp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yunmu_pay_way
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yunmu_pay_way.p_id
     *
     * @return the value of yunmu_pay_way.p_id
     *
     * @mbggenerated
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yunmu_pay_way.p_id
     *
     * @param pId the value for yunmu_pay_way.p_id
     *
     * @mbggenerated
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yunmu_pay_way.p_name
     *
     * @return the value of yunmu_pay_way.p_name
     *
     * @mbggenerated
     */
    public String getpName() {
        return pName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yunmu_pay_way.p_name
     *
     * @param pName the value for yunmu_pay_way.p_name
     *
     * @mbggenerated
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yunmu_pay_way.p_temp
     *
     * @return the value of yunmu_pay_way.p_temp
     *
     * @mbggenerated
     */
    public String getpTemp() {
        return pTemp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yunmu_pay_way.p_temp
     *
     * @param pTemp the value for yunmu_pay_way.p_temp
     *
     * @mbggenerated
     */
    public void setpTemp(String pTemp) {
        this.pTemp = pTemp == null ? null : pTemp.trim();
    }
}