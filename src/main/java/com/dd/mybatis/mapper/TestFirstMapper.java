package com.dd.mybatis.mapper;

import com.dd.mybatis.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestFirstMapper {

    @Select("select * from user_info")
    List<User> getAll();

    @Insert("insert into user_info(username,password,email,age,sex,tel,addr,card,married,salary)" +
            "values(#{username},#{password},#{email},#{age},#{sex},#{tel},#{addr},#{card},#{married},#{salary})")
    int insert(User user);
}
