package com.yueqian.mapper;

import com.yueqian.entity.UserShopCar;
import java.util.List;

public interface UserShopCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_shopcar
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_shopcar
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(UserShopCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_shopcar
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    UserShopCar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_shopcar
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<UserShopCar> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_shopcar
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(UserShopCar record);
}