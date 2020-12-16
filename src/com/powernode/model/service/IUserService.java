package com.powernode.model.service;

import com.powernode.entity.User;

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
public interface IUserService {
    User getByUserAndPwd(String username,String pwd);
}
