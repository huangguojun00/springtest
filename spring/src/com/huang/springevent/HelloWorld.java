package com.huang.springevent;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
