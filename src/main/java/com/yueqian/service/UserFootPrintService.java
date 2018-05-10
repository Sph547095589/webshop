package com.yueqian.service;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.yueqian.entity.FootProduct;
import com.yueqian.entity.UserFootPrint;
import com.yueqian.mapper.UserFootPrintMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  UserFootPrintService {

    @Autowired
    private UserFootPrintMapper userFootPrint;
    public List<FootProduct> selectDay(){
        return userFootPrint.selectDay();
    }

    public List<FootProduct> selectWeek(){
        return userFootPrint.selectWeek();
    }

    public int selectByProdictUser(Integer productId,Integer userId){
        return userFootPrint.selectByProdictUser(productId,userId);
    }
    public int updateByDate(String shijian,Integer productId,Integer userId){
       return userFootPrint.updateByDate(shijian,productId,userId);
    }
    public int addUserFootPrint(String shijian,Integer productId,Integer userId){
        return userFootPrint.addUserFootPrint(shijian,productId,userId);
    }

}
