package com.powernode.model.dao;

import com.powernode.entity.Student;
import com.powernode.util.Pager;

import java.util.List;

public interface IStudentDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);
    List<Student>selectAll();

    List<Student>selectByPager(Pager pager);
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}