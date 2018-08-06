package com.luoxue.mybatis_demo.service.impl;

import com.luoxue.mybatis_demo.dao.UserMapper;
import com.luoxue.mybatis_demo.entity.User;
import com.luoxue.mybatis_demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: John
 * @since: 2018/7/22
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Resource
    UserMapper userMapper;


    public User getUserInfo(int id) {

        try {
            logger.info("通过id查询用户信息！");
            return  userMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            logger.error("通过Id查询用户信息异常!",e);
        }
        return null;
    }

    @Override
    public int insert(User user) {
        try {
            logger.info("插入用户信息");
            return userMapper.insert(user);
        } catch (Exception e) {
            logger.error("插入用户信息异常！",e);
        }
        return 0;
    }

    @Override
    public User doLogin(String name, String password) {
        return userMapper.doLogin(name,password);
    }
}
