package com.powernode.entity;

import java.io.Serializable;

/**
 * t_student
 * @author 
 */
public class Student implements Serializable {
    private Integer stuId;


    private String stuName;

    private Integer stuSex;

    private Integer stuStatus;
 /*老师id*/
    private  Integer teaId;
    /*因为 逐个写麻烦，所以直接写对象  多的一方（n）引用一方（1）*/
    private Teacher teacher;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private static final long serialVersionUID = 1L;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(Integer stuStatus) {
        this.stuStatus = stuStatus;
    }
}