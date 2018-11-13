package com.huang.service;

import com.huang.dao.MenuMapper;
import com.huang.domain.Menu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeSet;

/**
 * @Author Huang Guojun
 * @Date 2018/11/9
 * @Discription
 */
public class MenuService {
    public static void main(String[] args) throws IOException, InterruptedException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        TreeSet<Menu> menus = mapper.selectAllM();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
        Thread.sleep(10000);

    }
}
