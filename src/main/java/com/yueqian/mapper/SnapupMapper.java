package com.yueqian.mapper;

import com.yueqian.entity.Snapup;
import java.util.List;

public interface SnapupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snapup
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snapup
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(Snapup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snapup
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    Snapup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snapup
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<Snapup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snapup
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(Snapup record);
}