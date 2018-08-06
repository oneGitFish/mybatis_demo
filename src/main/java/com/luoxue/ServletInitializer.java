package com.luoxue;

import com.luoxue.mybatis_demo.MybatisDemoApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Description:
 * @author: John
 * @since: 2018/8/6
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder MybatisDemoApplication) {
        return MybatisDemoApplication.sources(MybatisDemoApplication.class);
    }
}
