package com.powernode.model.service;

import com.powernode.entity.Teacher;
import com.powernode.util.Pager;

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
public interface ITeacherService {
    //查询全部
    List<Teacher>list();
//根据输入条件查询
    List<Teacher>list(Teacher teacher);
    //分页查询
    List<Teacher>list(Pager pager);
    //用id查询
    Teacher get(int teaId);
    //插入/添加
    int save(Teacher teacher);
    //修改
    int update(Teacher teacher);
    //删除
    int delete(int teaId);

    int delete(Integer[]teaIds);
}
