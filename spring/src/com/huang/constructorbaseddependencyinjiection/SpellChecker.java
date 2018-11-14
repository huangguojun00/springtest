package com.huang.constructorbaseddependencyinjiection;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor");
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling");
    }
}
