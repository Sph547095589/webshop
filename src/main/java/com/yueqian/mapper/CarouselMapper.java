package com.yueqian.mapper;

import com.yueqian.entity.Carousel;
import java.util.List;

public interface CarouselMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    Carousel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<Carousel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(Carousel record);
}