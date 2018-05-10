package com.yueqian.mapper;

import com.yueqian.entity.StoreStock;
import java.util.List;

public interface StoreStockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_stock
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_stock
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(StoreStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_stock
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    StoreStock selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_stock
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<StoreStock> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_stock
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(StoreStock record);
}