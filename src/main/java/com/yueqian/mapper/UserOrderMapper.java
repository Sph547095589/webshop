package com.yueqian.mapper;

import com.yueqian.entity.UserOrder;
import java.util.List;

public interface UserOrderMapper {
    public List<UserOrder> select();//全部
    public List<UserOrder> selectByType(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_order
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int deleteByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_order
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int insert(UserOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_order
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    UserOrder selectByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_order
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    List<UserOrder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_order
     *
     * @mbggenerated Mon Apr 16 08:35:34 CST 2018
     */
    int updateByPrimaryKey(UserOrder record);
}