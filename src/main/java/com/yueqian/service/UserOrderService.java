package com.yueqian.service;

import com.yueqian.entity.UserOrder;
import com.yueqian.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOrderService {
    @Autowired
    private UserOrderMapper userOrderMapper;

    public List<UserOrder> select(){
        return userOrderMapper.select();
    }
   public List<UserOrder> selectByType(Integer id){
        return  userOrderMapper.selectByType(id);
   }
}
