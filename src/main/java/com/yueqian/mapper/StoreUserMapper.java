package com.yueqian.mapper;

import com.yueqian.entity.StoreUser;
import java.util.List;

public interface StoreUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_user
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_user
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(StoreUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_user
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    StoreUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_user
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<StoreUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_user
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(StoreUser record);
}