package com.yueqian.service;

import com.yueqian.entity.DetailProduct;
import com.yueqian.entity.UserDetail;
import com.yueqian.mapper.UserDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailService {
 @Autowired
 private UserDetailMapper userDetailMapper;
 public List<DetailProduct> selectByOrderId(Integer id){
     return userDetailMapper.selectByOrderId(id);
 }
 public List<DetailProduct> selectByOrder(Integer id){return  userDetailMapper.selectByOrder(id);}
}
