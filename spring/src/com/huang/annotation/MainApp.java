package com.huang.annotation;

import com.huang.setter_based.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class MainApp {
    public static void main(String[] args) {
      //  ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
//        Profile profile = context.getBean("profile123",Profile.class);
//        profile.printAge();
//        profile.printName();
        Student bean = context.getBean(Student.class);
        bean.setAge(10000000);
        bean.setName("hh");
        System.out.println(bean.getAge());
        System.out.println(bean.getName());
        TextEditor bean1 = context.getBean(TextEditor.class);
        bean1.spellCheck();
    }
}
