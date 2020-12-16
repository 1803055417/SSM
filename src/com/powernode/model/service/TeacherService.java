package com.powernode.model.service;

import com.powernode.entity.Teacher;
import com.powernode.model.dao.TeacherDao;
import com.powernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Paper;
import java.util.List;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.model.service
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/10 19:58
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    TeacherDao teacherDao;

    @Override
    public List<Teacher> list() {
        return teacherDao.selectAll();
    }

    @Override
    public List<Teacher> list(Teacher teacher) {
        return teacherDao.selectByTeacher(teacher);

    }

    @Override
    public List<Teacher> list(Pager pager) {
        //查总记录数
        int count = teacherDao.selectTotalCount();
        pager.setTotalRowCount(count);

        return teacherDao.selectByPager(pager);
    }

  /*  @Override
    public List<Teacher> list(Teacher teacher, Pager pager) {
        teacherDao.searchTotalCount(teacher);
        Paper.setTotalRowCount(count);
        return  teacherDao.searchByPager(teacher,pager);
    }*/

    @Override
    public Teacher get(int teaId) {
        return teacherDao.selectByPrimaryKey(teaId);
    }

    @Override
    public int save(Teacher teacher) {
        return teacherDao.insertSelective(teacher);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherDao.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public int delete(int teaId) {
        return teacherDao.deleteByPrimaryKey(teaId);
    }

    @Override
    public int delete(Integer[] teaIds) {
        return teacherDao.deleteBatch(teaIds);
    }
}
