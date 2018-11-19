package com.huang.setter_based;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }


    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("内部bean注入1");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
