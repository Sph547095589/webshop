package com.yueqian.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yueqian.entity.FootProduct;
import com.yueqian.entity.Product;
import com.yueqian.service.ProductService;
import com.yueqian.service.UserFootPrintService;
import com.yueqian.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UserFootPrintController {
  @Autowired
  private UserFootPrintService userFootPrintService;



    @RequestMapping("foot")
    public String foot()
    {
        return "/person/foot";
    }
//查询当天的浏览记录
    @RequestMapping("getUserFootPrintDay.json")
    @ResponseBody
    public List<FootProduct> getUserFootPrintDay(int id ){
       List<FootProduct> day =  userFootPrintService.selectDay();
       return day;
    }
    //查询getUserFootPrintWeek一周内的浏览记录
    @RequestMapping("getUserFootPrintWeek.json")
    @ResponseBody
    public List<FootProduct> getUserFootPrintWeek(int id ){
        List<FootProduct> week =  userFootPrintService.selectWeek();
        return week;
    }

    @RequestMapping("getUserFootPrint")
    public String getUserFoot(){
        return "/person/foot";
    }

    //添加足迹
    @RequestMapping("addUserFootPrint")
    public String addUserFootPrint(Integer productId,Integer userId){
       Integer count =  userFootPrintService.selectByProdictUser(productId,userId);
        System.out.println("浏览："+count);
        if(count>0){
            System.out.println("数据库中存在该数据执行更新时间");

            String da=date();
            userFootPrintService.updateByDate(da,productId,userId);
        }
        else{
            System.out.println("数据中没有该数据执行添加数据");
             String da=date();
            userFootPrintService.addUserFootPrint(da,productId,userId);
        }
        return "/home/introduction";
    }
    //获取当前的系统时间
     public static String date(){
    Date date = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return df.format(date);
    }

}
