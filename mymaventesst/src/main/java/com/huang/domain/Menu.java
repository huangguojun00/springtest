package com.huang.domain;

import lombok.Data;

import java.util.TreeSet;

/**
 * @Author Huang Guojun
 * @Date 2018/11/9
 * @Discription
 */
@Data
public class Menu implements Comparable<Menu> {
    private String menuId; // id

    private String menuName; // 名字

    private String menuAddr; // 菜单地址

    private String parentId; // 父标签地址

    private TreeSet<Menu> list; // 配合前台数据

    public int compareTo(Menu o) {
        return this.menuId.compareTo(o.menuId);
    }
}
