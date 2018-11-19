package com.huang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student1");
        student.getAge();
        student.getName();
        student.printThrowException();

    }
}
