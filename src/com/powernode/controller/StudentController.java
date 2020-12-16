package com.powernode.controller;

import com.powernode.entity.Student;
import com.powernode.entity.Teacher;
import com.powernode.model.service.IStudentService;
import com.powernode.model.service.ITeacherService;
import com.powernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    IStudentService studentService;

    @Autowired
    ITeacherService teacherService;
    @RequestMapping("list")
    List<Student> list(Pager pager) {

        return studentService.list(pager);
    }

    @RequestMapping("add")
    List<Teacher> add() {
     return  teacherService.list();
    }

    @RequestMapping("save")
    /*void save(String stuName,Integer stuSex){

        Student student = new Student();

        student.setStuName(stuName);
        //setSex.................
        //request.getParqmter("stuName")

    }*/

    String save(Student student) {

        studentService.save(student);
//重定向
        return "redirect:list";
       /* //请求转发
        return "forward:list";*/
    }

    @RequestMapping("edit")
    Student edit(ArrayList<Teacher>list, int stuId) {
        list.addAll(teacherService.list());

        return studentService.get(stuId);
    }

    /*先查询后修改*/
    @RequestMapping("saveUpdate")
    String edit(Student student) {


        studentService.update(student);

        return "redirect:list";
    }


    @RequestMapping("del")
    String del(int stuId) {


        studentService.delete(stuId);

        return "redirect:list";
    }

}
