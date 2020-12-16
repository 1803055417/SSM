package com.powernode.controller;

import com.powernode.entity.User;
import com.powernode.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.controller
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/15 11:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class LoginController {
    @Autowired
    UserService userService;
/*去登录页面*/
    @RequestMapping("login")
    void login() {
    }
/*验证用户名和密码*/
    @RequestMapping("saveLogin")
    String saveLogin(User user, HttpSession session) {
        User userDB = userService.getByUserAndPwd(user.getUsername(), user.getPassword());
        if (userDB==null){
            //登录失败
          user.setMsg("登录失败，请检查用户名和密码是否匹配");
            return "login";
        }
        //登录成功
        session.setAttribute("LOGIN_USER",userDB);
        return "redirect:/";
    }
    //退出
    @RequestMapping("logout")
    String logout(HttpSession session){
        //从session里面消除LOGIN_USER
        session.removeAttribute("LOGIN_USER");
        //重定向到首页
        return "redirect:/";
    }
}
