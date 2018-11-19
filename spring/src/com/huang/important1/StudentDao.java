package com.huang.important1;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author Huang Guojun
 * @Date 2018/11/16
 * @Discription
 */
public interface StudentDao {
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age, Integer marks, Integer year);
    public List<StudentMarks> listStudents();

}
