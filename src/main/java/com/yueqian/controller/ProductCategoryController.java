package com.yueqian.controller;

import com.yueqian.entity.ProductCategory;
import com.yueqian.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;


    @RequestMapping("home")
    public String home(){

        return "/home/home";
}
    @RequestMapping("One.json")
    @ResponseBody
    public  List<ProductCategory> one(){
        return productCategoryService.selectOne();
    }
    @RequestMapping("Two.json")
    @ResponseBody
    public List<ProductCategory> two(Integer id){
        return productCategoryService.selectTwo(id);
    }

    @RequestMapping("Three.json")
    @ResponseBody
    public List<ProductCategory> three(Integer id){
        return  productCategoryService.selectThree(id);
    }
}
