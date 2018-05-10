package com.yueqian.entity;

public class DetailProduct {
    private Integer detailid;
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_detail.orderId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_detail.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_detail.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_detail.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_detail.detailId
     *
     * @return the value of user_detail.detailId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getDetailid() {
        return detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_detail.detailId
     *
     * @param detailid the value for user_detail.detailId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_detail.orderId
     *
     * @return the value of user_detail.orderId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_detail.orderId
     *
     * @param orderid the value for user_detail.orderId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_detail.productId
     *
     * @return the value of user_detail.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_detail.productId
     *
     * @param productid the value for user_detail.productId
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_detail.count
     *
     * @return the value of user_detail.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_detail.count
     *
     * @param count the value for user_detail.count
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_detail.price
     *
     * @return the value of user_detail.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_detail.price
     *
     * @param price the value for user_detail.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setPrice(Integer price) {
        this.price = price;
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
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
    private Integer proprice;
    public Integer getProprice() {
        return price;
    }
    public void setProprice(Integer price) {
        this.price = price;
    }
}
