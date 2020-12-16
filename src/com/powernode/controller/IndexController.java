package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.controller
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/15 14:54
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class IndexController {
    @RequestMapping("index")
/*视图在视图解析器的前缀目录，只能用modelandview*/
    ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        //可以调用Service
        modelAndView.setView(new InternalResourceView("/welcome.jsp"));
        return  modelAndView;
    }
}
