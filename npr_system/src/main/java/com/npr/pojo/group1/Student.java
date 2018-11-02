package com.npr.pojo.group1;

import java.io.Serializable;

/**
 * 用来上传的
 */
public class Student implements Serializable{
    private String name;
    private int sex;
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname() {
        this.cname = "java";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setName() {
        this.name = "hallen";
    }

    public String getName() {
        return name;
    }

}
