package com.yueqian.service;

import com.yueqian.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public int addComment(Integer proId,Integer userId,String content ,String data){
        return commentMapper.addComment(proId,userId,content,data);
    }

}
