package com.powernode.controller;

import com.powernode.entity.City;
import com.powernode.model.service.CitySerivce;
import com.powernode.model.service.ICityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.controller
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/8 16:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@WebServlet("/city/CityServlet?id=2")
public class CityServlet extends HttpServlet {
    ICityService cityService=new CitySerivce();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.接收请求当中的参数
         *
         * 2.调用模型层
         *
         * 3.往作用域放值(reqeust,session)
         *
         * 4.响应用户(请求转发，重定向，下载，json)
         *
         */
        //1.接收请求当中的参数
        String id = req.getParameter("id=");
        //2.调用模型层
        List<City> list = cityService.list();
        //3.往作用域放值(reqeust,session)
        req.setAttribute("list",list);
        // 4.响应用户(请求转发，重定向，下载，json)
        req.getRequestDispatcher("xxx.jsp").forward(req,resp);
    }
}
