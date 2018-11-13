package com.huang.dao;

import com.huang.domain.Menu;

import java.util.TreeSet;

/**
 * @Author Huang Guojun
 * @Date 2018/11/9
 * @Discription
 */
public interface MenuMapper {
    TreeSet<Menu> selectAllM();
}
