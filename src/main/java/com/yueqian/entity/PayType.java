package com.yueqian.entity;

public class PayType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paytype.payId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer payid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paytype.payName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private String payname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paytype.payId
     *
     * @return the value of paytype.payId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getPayid() {
        return payid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paytype.payId
     *
     * @param payid the value for paytype.payId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paytype.payName
     *
     * @return the value of paytype.payName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getPayname() {
        return payname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paytype.payName
     *
     * @param payname the value for paytype.payName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setPayname(String payname) {
        this.payname = payname;
    }
}