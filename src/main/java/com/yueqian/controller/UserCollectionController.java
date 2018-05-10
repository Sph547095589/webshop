package com.yueqian.controller;

import com.alibaba.druid.sql.visitor.functions.If;
import com.yueqian.service.UserCollectionService;
import com.yueqian.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserCollectionController {
     @Autowired
     private UserCollectionService userCollectionService;

     //分页查询
     @RequestMapping("getUserCollection.json")
    @ResponseBody
    public PageUtils getUserCollectionJson(Integer pageNo,Integer userId){
         return userCollectionService.selectByUserId(pageNo,userId);
     }

     @RequestMapping("getUserCollection")
    public String getUserCollection(){
       return "/person/collection";
     }
//查询数据库中该用户 是否对该商品进行收藏  如果已经收藏 不执行添加否则执行添加
     @RequestMapping("selectByUserIdProductId")
    public String selectByUserIdProductId(Integer productId,Integer userId){
         int count =userCollectionService.selectByUserIdProductId(productId,userId);
         if (count>0){
             System.out.println("抱歉,你以收藏该商品");
         }
         else{
             System.out.println("你还没有收藏该商品,以为你收藏商品");
             Date date = new Date();
             SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             String da=df.format(date);
             userCollectionService.adduserCollection(productId,userId,da);
         }
         return "/person/collection";
     }



}
