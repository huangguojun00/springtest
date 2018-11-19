package com.huang.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class Student {
    private Integer age;
    private String name;


    public void setAge(Integer age) {
        System.out.println("我是student类的age");
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    public void setName(String name) {
        System.out.println("我是student类的name");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
