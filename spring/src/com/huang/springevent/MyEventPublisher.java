package com.huang.springevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class MyEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public void publish(){
        MyEvent myEvent = new MyEvent(this);
        applicationEventPublisher.publishEvent(myEvent);
    }
}
