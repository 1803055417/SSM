package com.powernode.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.Enumeration;
import java.util.List;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.util
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/16 11:20
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class PageInfo extends com.github.pagehelper.PageInfo {
    private String url;

    public PageInfo(List list) {
        super(list);
        //从当前本地线程当中获取请求
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        //获取当前的请求地址
        String uri = request.getRequestURI() + "?1=1";
        /**
         * 获得请求当中所有的参数名称
         */
        Enumeration<String> parameterNames = request.getParameterNames();
        //迭代所有的 参数名称
        while (parameterNames.hasMoreElements()){
            //取出参数名称
            String paramName = parameterNames.nextElement();
            //根据参数名称获取参数的值
            String paramValue = request.getParameter(paramName);
            //如果参数的值不为空，并且参数不为常驻参数(1=1&no=?)，则拼接到当前请求地址的参数列表当中

        }
    }
}
