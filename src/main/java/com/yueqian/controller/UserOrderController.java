package com.yueqian.controller;


import com.yueqian.entity.UserOrder;
import com.yueqian.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("userOrderController")
public class UserOrderController {

    @Autowired
    private UserOrderService userOrderService;
    @RequestMapping("order")
    public String order(){
        return "/person/order";
    }

    @RequestMapping("All.json")
    @ResponseBody
    public List<UserOrder> All(){
        return userOrderService.select();
    }
    @RequestMapping("selectByType.json")
    @ResponseBody
    public List<UserOrder> selectByType(Integer id){
        return userOrderService.selectByType(id);
    }
}
