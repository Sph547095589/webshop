package com.yueqian.mapper;

import com.yueqian.entity.StoreSellStatistics;
import java.util.List;

public interface StoreSellStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_sell_statistics
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_sell_statistics
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(StoreSellStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_sell_statistics
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    StoreSellStatistics selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_sell_statistics
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<StoreSellStatistics> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_sell_statistics
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(StoreSellStatistics record);
}