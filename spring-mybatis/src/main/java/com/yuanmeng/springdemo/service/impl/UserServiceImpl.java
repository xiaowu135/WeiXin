package com.yuanmeng.springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuanmeng.springdemo.dao.UserInfoMapper;
import com.yuanmeng.springdemo.model.UserInfo;
import com.yuanmeng.springdemo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    
    public UserInfo getUserInfoById(int id) {
        
        return userInfoMapper.selectByPrimaryKey(id);
    }

}