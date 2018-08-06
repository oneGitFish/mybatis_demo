package com.luoxue.mybatis_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @author: John
 * @since: 2018/7/31
 */
@Controller
@RequestMapping("/")
public class DefaultController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
