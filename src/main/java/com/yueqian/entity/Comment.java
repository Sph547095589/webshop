package com.yueqian.entity;

import java.util.Date;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.content
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.buyUser
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer buyuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.productId
     *
     * @return the value of comment.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.productId
     *
     * @param productid the value for comment.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.content
     *
     * @return the value of comment.content
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.content
     *
     * @param content the value for comment.content
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.buyUser
     *
     * @return the value of comment.buyUser
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getBuyuser() {
        return buyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.buyUser
     *
     * @param buyuser the value for comment.buyUser
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setBuyuser(Integer buyuser) {
        this.buyuser = buyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.date
     *
     * @return the value of comment.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.date
     *
     * @param date the value for comment.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }
}