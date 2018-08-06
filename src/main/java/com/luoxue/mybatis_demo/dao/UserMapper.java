package com.luoxue.mybatis_demo.dao;

import com.luoxue.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectByPrimaryKey(int id);

    int insert(User user);

    User doLogin(@Param("name") String name, @Param("password")String password);

}