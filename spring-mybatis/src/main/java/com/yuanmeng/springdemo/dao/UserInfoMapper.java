package com.yuanmeng.springdemo.dao;

import com.yuanmeng.springdemo.model.UserInfo;

public interface UserInfoMapper {
	int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
