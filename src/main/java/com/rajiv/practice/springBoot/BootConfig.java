package com.rajiv.practice.springBoot;

/**
 * Created by Rajiv on 8/1/2016.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class BootConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/").setViewName("home");
        registry.addViewController("/test").setViewName("test");
        registry.addViewController("/login").setViewName("login");
    }

}