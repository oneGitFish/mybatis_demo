package com.luoxue.mybatis_demo.controller.user;

import com.luoxue.mybatis_demo.entity.User;
import com.luoxue.mybatis_demo.service.UserService;
import com.luoxue.mybatis_demo.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: John
 * @since: 2018/7/20
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

/*    @RequestMapping("login")
    public Object login(String name, String password){
        return userService.doLogin(name,password);
    }*/

    @RequestMapping("login")
    public ModelAndView login(String name, String password){
        ModelAndView modelAndView = new ModelAndView("redirect:file:///C:/Users/Auser/Desktop/%E6%96%B0%E5%BB%BA%E6%96%87%E4%BB%B6%E5%A4%B9%20(2)/index.html");
        return modelAndView;
    }


    @RequestMapping("/info")
    @CrossOrigin
    public User show(){
        User user = new User();
        user.setName("test2");
        user.setPassword("test2");
        Integer i = 24;
        if(userService.insert(user) > 0){
            return userService.getUserInfo(i);
        }
        return  null;

    }


}
