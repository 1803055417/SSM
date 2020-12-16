package com.powernode.model.dao;

import com.powernode.entity.Teacher;
import com.powernode.util.Pager;

import java.util.List;
/*dao里面方法不能重载*/
public interface TeacherDao {

    int deleteByPrimaryKey(Integer teaId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaId);

    List<Teacher> selectAll();

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
/*DAO里面方法不能重载    批量删除   数组需要先迭代后删除*/
    int deleteBatch(Integer[] teaIds);

    List<Teacher>selectByTeacher(Teacher record);
    List<Teacher>selectByPager(Pager pager);
    int selectTotalCount();
}