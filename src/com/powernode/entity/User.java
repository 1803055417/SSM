package com.powernode.entity;

import java.io.Serializable;

/**
 * t_user
 * @author 
 */
public class User implements Serializable {
    private Integer uid;

    private String username;

    private String password;
    private String msg;

    private static final long serialVersionUID = 1L;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}