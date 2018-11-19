package com.huang.important1;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription 程序化事务管理
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {

    @Override
    public StudentMarks mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(resultSet.getInt("id"));
        studentMarks.setName(resultSet.getString("name"));
        studentMarks.setAge(resultSet.getInt("age"));
        studentMarks.setSid(resultSet.getInt("sid"));
        studentMarks.setMarks(resultSet.getInt("marks"));
        studentMarks.setYear(resultSet.getInt("year"));
        return studentMarks;
    }
}
