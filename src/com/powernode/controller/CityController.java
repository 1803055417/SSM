package com.powernode.controller;

import com.powernode.entity.City;
import com.powernode.model.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    @Controller
    @RequestMapping("city")//在class上命名空间（namespace）请求地址
    public class CityController {
    @Autowired
    ICityService ctiyService;


    @RequestMapping("list")
    List<City>list(){

    return  ctiyService.list();
    }

    /**
     * 1.使用servlet api处理  //action  => /city/list
     */
   /* @RequestMapping("list")// 方法上面action事件
    void list(HttpServletRequest req, HttpServletResponse resp) throws  Exception{

        //1.接收请求当中的参数
       String id = req.getParameter("id=");

        //2.调用模型层
        List<City> list = ctiyService.list();

        //3.往作用域放值(reqeust,session)
        req.setAttribute("cityList",list);

        // 4.响应用户(请求转发，重定向，下载，json) / => root根目录
        req.getRequestDispatcher("/pages/list.jsp").forward(req,resp);

    }*/


    /**
     * 2.使用ModelAndView
     */
   /* @RequestMapping("list")
    ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        //1.接收请求当中的参数
        //2.调用模型层（业务层）
        List<City> list = ctiyService.list();
        //3.往作用域放值(reqeust,session)
        modelAndView.addObject("cityList",list);
        //4.响应用户(请求转发，重定向)
        modelAndView.setView(new InternalResourceView("/pages/list.jsp"));*/
    // req.getRequestDispatcher("/pages/list.jsp").forward(req,resp);
    //重定向 modelAndView.setView(new RedirectView("http://baidu.com"));
    //modelAndView.setView(new RedirectView("/user/edit?id="));//可以出应用，默认就是出应用的
    //modelAndView.setView(new RedirectView("/user/edit?id=1",true));// http://localhost:8080/ssm/user/edit?id=1
/***
 *
 * 请求转发与重定向的区别：
 * 1.请求转发是一次请求，重定向是两次请求
 * 2.请求转发只在应用的内部，重定向可以向任何地方做重定向
 * 3.请求转发可以取出请求作用域当中的对象(attribute)，而重定向不可以

 return  modelAndView;
 }  */

    /**
     * 3.返回视图的名称, 视图的名称: 被视图解析器的前辍与后辍包夹的那个字符串
     */

  /*  @RequestMapping("list")
    String list(ArrayList<City> list) {
        //2.调用模型层
        List<City> listDB = ctiyService.list();
        //3.往作用域放值(reqeust,session)   req.setAttribute("cityList",list);
        list.addAll(listDB);
        return "list"; //  /pages/list.jsp
    }*/

/**
 * 4.返回视图的名称
 */
   /* @RequestMapping("list")

    */
 /*  String list(Map<String,Object>map){
       //2.调用模型层
       List<City> listDB = ctiyService.list();
       //3.往作用域放值  // req.setAttribute("cityList",list);
       map.put("cityList",listDB);
       return "list";//4.请求转发
   }*/

    /**
     * 5.使用约定
     */
  /*  @RequestMapping("list")
    void  list(Map<String,Object>map){
        //2.调用模型层
        List<City> listDB = ctiyService.list();
        //3.往作用域放值
        map.put("cityList",listDB);
        //4.请求转发,约定: 当没有指明要做何种响应的时候，
        // 默认请求转发到 视图解析器的前辍 + namespace + action + 视图解析器的后辍

        //   /pages/city/list.jsp

    }*/

/**
 * 6.使用约定
 */
   /* @RequestMapping("list")

    */
 /* void  list(ArrayList<City>list){

      //2.调用模型层
      List<City> listDB = ctiyService.list();
      //3.往作用域放值
      list.addAll(listDB);
      // req.setAttribute("cityList",list); //attributeName默认是按照类型做推断：cityList
      // city
      //4.请求转发,约定: 当没有指明要做何种响应的时候，默认请求转发到 视图解析器的前辍 + namespace + action + 视图解析器的后辍
      //   /pages/city/list.jsp
  }*/
    /**
     * 7.使用约定
     */

   /* @RequestMapping("list")
    List<City> list(){// cityList


        return cityService.list();//2.调用模型层    返回值默认是要进入到request的attrubte(request.setAttrubute())
    }*/
    /**
     * 8.使用约定
     */
  /*  @RequestMapping("list")
    Map<String,Object> list(){

        Map<String,Object> map = new HashMap<>();

        List<City>  list = cityService.list();//2.调用模型层

        //3.往作用域放值
        map.put("cityList",list);//request.setAttrubute("cityList",list)

        //4.响应按约定走


        return map;
    }
*/

}

