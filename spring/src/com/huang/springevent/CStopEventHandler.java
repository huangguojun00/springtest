package com.huang.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class CStopEventHandler
        implements ApplicationListener<ContextStoppedEvent>{

    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
