package com.huang.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("爸爸开始是第一");
    }
}
