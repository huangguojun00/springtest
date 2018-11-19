package com.huang.springevent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class MainApp {
    public static void main(String[] args)  {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        applicationContext.start();
       MyEventPublisher myEventPublisher = (MyEventPublisher) applicationContext.getBean("myEventPublisher");
       myEventPublisher.publish();
       myEventPublisher.publish();
        applicationContext.close();
    }
}
