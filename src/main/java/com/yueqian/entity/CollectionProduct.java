package com.yueqian.entity;

import java.util.Date;

public class CollectionProduct {
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_collection.userId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_collection.prodoctId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer prodoctid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_collection.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_collection.id
     *
     * @return the value of user_collection.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_collection.id
     *
     * @param id the value for user_collection.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_collection.userId
     *
     * @return the value of user_collection.userId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_collection.userId
     *
     * @param userid the value for user_collection.userId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_collection.prodoctId
     *
     * @return the value of user_collection.prodoctId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getProdoctid() {
        return prodoctid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_collection.prodoctId
     *
     * @param prodoctid the value for user_collection.prodoctId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setProdoctid(Integer prodoctid) {
        this.prodoctid = prodoctid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_collection.date
     *
     * @return the value of user_collection.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_collection.date
     *
     * @param date the value for user_collection.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.categoryLevel1Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer categorylevel1id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.categoryLevel2Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer categorylevel2id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.categoryLevel3Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer categorylevel3id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.fileName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private String filename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.barcode
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private String barcode;




    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.categoryLevel1Id
     *
     * @return the value of product.categoryLevel1Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getCategorylevel1id() {
        return categorylevel1id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.categoryLevel1Id
     *
     * @param categorylevel1id the value for product.categoryLevel1Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setCategorylevel1id(Integer categorylevel1id) {
        this.categorylevel1id = categorylevel1id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.categoryLevel2Id
     *
     * @return the value of product.categoryLevel2Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getCategorylevel2id() {
        return categorylevel2id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.categoryLevel2Id
     *
     * @param categorylevel2id the value for product.categoryLevel2Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setCategorylevel2id(Integer categorylevel2id) {
        this.categorylevel2id = categorylevel2id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.categoryLevel3Id
     *
     * @return the value of product.categoryLevel3Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getCategorylevel3id() {
        return categorylevel3id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.categoryLevel3Id
     *
     * @param categorylevel3id the value for product.categoryLevel3Id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setCategorylevel3id(Integer categorylevel3id) {
        this.categorylevel3id = categorylevel3id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.fileName
     *
     * @return the value of product.fileName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.fileName
     *
     * @param filename the value for product.fileName
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.barcode
     *
     * @return the value of product.barcode
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.barcode
     *
     * @param barcode the value for product.barcode
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
