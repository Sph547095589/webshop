package com.yueqian.entity;

import java.util.Date;

public class StoreSellStatistics {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_sell_statistics.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_sell_statistics.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_sell_statistics.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_sell_statistics.id
     *
     * @return the value of store_sell_statistics.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_sell_statistics.id
     *
     * @param id the value for store_sell_statistics.id
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_sell_statistics.price
     *
     * @return the value of store_sell_statistics.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_sell_statistics.price
     *
     * @param price the value for store_sell_statistics.price
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_sell_statistics.date
     *
     * @return the value of store_sell_statistics.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_sell_statistics.date
     *
     * @param date the value for store_sell_statistics.date
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }
}