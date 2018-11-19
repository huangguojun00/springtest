package com.huang;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class Student {
    private Integer age;
    private String name;


    public void setAge(Integer age) {
        System.out.println("age:"+age);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    public void setName(String name) {
        System.out.println("name:"+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
