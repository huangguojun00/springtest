package com.huang.springevent;

import org.springframework.context.ApplicationEvent;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }


    public String toString(){
        return "我是你爸爸";
    }
}
