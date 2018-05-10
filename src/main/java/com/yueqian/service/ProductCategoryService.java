package com.yueqian.service;

import com.yueqian.entity.ProductCategory;
import com.yueqian.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {
   @Autowired
   private ProductCategoryMapper productCategoryMapper;

   public List<ProductCategory> selectOne(){
       return productCategoryMapper.selectOne();
   }

    public List<ProductCategory> selectTwo(Integer id){
        return productCategoryMapper.selectTwo(id);
    }

    public List<ProductCategory> selectThree(Integer id){
        return productCategoryMapper.selectThree(id);
    }
}
