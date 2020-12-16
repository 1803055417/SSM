package com.powernode.model.service;

import com.powernode.entity.User;
import com.powernode.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.model.service
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/15 11:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class UserService implements IUserService{
@Autowired
    UserDao userDao;
    @Override
    public User getByUserAndPwd(String username, String pwd) {
        return userDao.selectByUserNameAndPwd(username,pwd) ;
    }
}
