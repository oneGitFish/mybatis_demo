package com.luoxue.mybatis_demo.service;

import com.luoxue.mybatis_demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: John
 * @since: 2018/7/22
 */
public interface UserService {

    User getUserInfo(int id);

    int insert(User user);

    User doLogin(String name, String password);
}
