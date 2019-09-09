package com.qs.dao;

import com.qs.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/1 11:51
 */
@Mapper
public interface TestDao {

    @Select("select * from student")
    List<Student> getAll();


}
