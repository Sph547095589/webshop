package com.yueqian.controller;

import com.yueqian.entity.DetailProduct;
import com.yueqian.entity.UserDetail;
import com.yueqian.service.CommentService;
import com.yueqian.service.ProductService;
import com.yueqian.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CommentController{
    @Autowired
    private UserDetailService userDetailService;
    @Autowired
    private CommentService commentService;

    @RequestMapping("getOrder.json")
    @ResponseBody
    public List<DetailProduct> getOrder(Integer id){
        List<DetailProduct> list = userDetailService.selectByOrder(id);
        return list;
    }

    @RequestMapping("comment")
    public String getComment(Integer id, HttpSession session){
        session.setAttribute("id",id);
        return "person/commentlist";
    }

    @RequestMapping("addComment")
    public String addComment(Integer [] userId , Integer [] proId ,String [] content ){
        Date date = new Date();
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String da=df.format(date);
        for (int i =0 ; i< userId.length;i++){
            commentService.addComment(userId[i],proId[i],content[i],da);

        }
        return "person/order";
    }
    @RequestMapping("WU")
    public String ad(){

     return "person/orderinfo";    }
}
