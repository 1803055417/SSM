package com.powernode.model.service;

import com.powernode.entity.Student;
import com.powernode.model.dao.IStudentDao;
import com.powernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/6 16:49
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentDao studentDao;


    @Override
    public List<Student> list() {
        return studentDao.selectAll();
    }

 @Override
    public List<Student> list(Pager pager) {
        return studentDao.selectByPager(pager);
    }

    @Override
    public Student get(int stuId) {
        return studentDao.selectByPrimaryKey(stuId);
    }

    @Override
    public int save(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.updateByPrimaryKey(student);
    }

    @Override
    public int delete(int stuId) {
        return studentDao.deleteByPrimaryKey(stuId);
    }
}
