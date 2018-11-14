package com.huang.constructorbaseddependencyinjiection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor  = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
