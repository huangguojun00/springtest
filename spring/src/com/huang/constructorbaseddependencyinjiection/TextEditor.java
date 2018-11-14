package com.huang.constructorbaseddependencyinjiection;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class TextEditor {
    /**
     * @Author HuangGuojun
     * @Date  2018/11/14
     * @Description  基于构造函数的依赖注入
     */
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker=spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
