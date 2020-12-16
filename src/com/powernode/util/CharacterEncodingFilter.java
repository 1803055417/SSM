package com.powernode.util;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.util
 * @Description: 处理jsp乱码的过滤器
 * @Author: admin
 * @CreateDate: 2020/12/9 14:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class CharacterEncodingFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("UTF-8");

        servletResponse.setCharacterEncoding("UTF-8");


        //过滤器链条继续
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
