package com.powernode.controller;

import com.powernode.entity.Teacher;
import com.powernode.model.service.ITeacherService;
import com.powernode.util.Pager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.controller
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/10 20:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    ITeacherService teacherService;
/*    *//*查询*//*
 @RequestMapping("list")
    List<Teacher> list(Teacher teacher) {
        return  teacherService.list(teacher);
    }*/
    /*分页查询*/
 @RequestMapping("list")
    List<Teacher> list(Teacher teacher, Pager pager){
      /* return  teacherService.list(teacher);*/
        return teacherService.list(pager);
    }



    /*查询和编辑放一起*/
    @RequestMapping("edit")
      /* Teacher edit(Integer teaId){//int 必须是数字   Integer 可以是null,也可以是数字


        return teacherService.get(teaId);

    }*/
void  edit(Teacher teacher ,Integer teaId){//int 必须是数字   Integer 可以是null,也可以是数字 包装类
        // teaId.intValue()
        if (teaId!=null){
            Teacher teacherDB = teacherService.get(teaId);
            //source  源（从哪里来），tartet 目标 (往哪里去)
            BeanUtils.copyProperties(teacherDB,teacher);
        }

       /* teacher.setTeaId(teacherDB.getTeaId());
        teacher.setTeaName(teacherDB.getTeaName());
        teacher.setTeaSex(teacherDB.getTeaSex());*/
    }
    /**
     * //修改/新增教师信息
     */
    @RequestMapping("save")
    String save(Teacher teacher){
        if (teacher.getTeaId()!=null){
            //执行修改
            teacherService.update(teacher);
        }else {
            //执行新增
            teacherService.save(teacher);
        }
        return "redirect:list";
    }
    @RequestMapping("delete")
    String delete(int teaId){
        teacherService.delete(teaId);
        return "redirect:list";
    }
    /*批量删除*/
    @RequestMapping("deleteBatch")
    String deleteBatch(Integer[] teaIds){

        teacherService.delete(teaIds);

        return "redirect:list";
    }
}
