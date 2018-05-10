package com.yueqian.service;

import com.yueqian.entity.CollectionProduct;
import com.yueqian.mapper.UserCollectionMapper;
import com.yueqian.utils.PageUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCollectionService {
    @Autowired
    private UserCollectionMapper userCollectionMapper;
    public PageUtils selectByUserId(Integer pageNo, Integer userId){
        Integer pageno=(pageNo-1)*10;
        PageUtils page = new PageUtils();
        page.setPageNo(pageNo);
        int count = userCollectionMapper.selectCount(userId);
        int totalPage = count % 10 == 0 ? count / 10 : (count / 10) + 1;
        page.setTotalPage(totalPage);
        List<CollectionProduct> list=userCollectionMapper.selectByUserId(pageno,10,userId);
        page.setResult(list);
        return page;
    }
    public int selectByUserIdProductId(Integer productId,Integer userId){
        return userCollectionMapper.selectByUserIdProductId(productId,userId);
    }
    public int adduserCollection(Integer productId,Integer userId,String wudi){
        return userCollectionMapper.adduserCollection(productId,userId,wudi);
    }
}
