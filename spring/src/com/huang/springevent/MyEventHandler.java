package com.huang.springevent;

import org.springframework.context.ApplicationListener;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class MyEventHandler  implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println(event.toString());
    }
}
