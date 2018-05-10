package com.yueqian.controller;

import com.yueqian.entity.DetailProduct;
import com.yueqian.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserDetailController {
    @Autowired
    private UserDetailService userDetailService;
    @RequestMapping("selectByOrderId.json")
    @ResponseBody
    public List<DetailProduct> selectByOrderId(Integer id){

        return userDetailService.selectByOrderId(id);
    }
 }
