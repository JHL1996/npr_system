package com.newer.test;

import com.npr.pojo.group1.Student;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        System.out.println("你好，世界");
        Student student = new Student();
        student.setName();
        System.out.println(student.getName());
    }
}
