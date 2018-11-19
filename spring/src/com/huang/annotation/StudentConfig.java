package com.huang.annotation;

import com.huang.setter_based.SpellChecker;
import com.huang.setter_based.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
@Configuration
public class StudentConfig {
    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public TextEditor textEditor() {
        return new TextEditor();
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
