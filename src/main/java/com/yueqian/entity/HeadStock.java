package com.yueqian.entity;

import java.util.Date;

public class HeadStock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column head_stock.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column head_stock.branchId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer branchid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column head_stock.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column head_stock.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column head_stock.changDate
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Date changdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column head_stock.id
     *
     * @return the value of head_stock.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column head_stock.id
     *
     * @param id the value for head_stock.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column head_stock.branchId
     *
     * @return the value of head_stock.branchId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getBranchid() {
        return branchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column head_stock.branchId
     *
     * @param branchid the value for head_stock.branchId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column head_stock.productId
     *
     * @return the value of head_stock.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column head_stock.productId
     *
     * @param productid the value for head_stock.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column head_stock.count
     *
     * @return the value of head_stock.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column head_stock.count
     *
     * @param count the value for head_stock.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column head_stock.changDate
     *
     * @return the value of head_stock.changDate
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Date getChangdate() {
        return changdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column head_stock.changDate
     *
     * @param changdate the value for head_stock.changDate
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setChangdate(Date changdate) {
        this.changdate = changdate;
    }
}