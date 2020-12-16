package com.powernode.model.dao;

import com.powernode.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);
    User selectByUserNameAndPwd(String username,String pwd);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}