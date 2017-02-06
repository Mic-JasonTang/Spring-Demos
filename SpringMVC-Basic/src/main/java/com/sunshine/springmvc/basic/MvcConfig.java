package com.sunshine.springmvc.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/20/2017 2:30 PM.
 */
@Configuration
//1. 发起SpringMVC支持
@EnableWebMvc
@ComponentScan("com.sunshine.springmvc.basic")
//2. 继承WebMvcConfigurerAdapter 类，重写其方法可以对Spring MVC进行配置
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new
                CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(100000);
        return multipartResolver;
    }
    /**
     * 配置视图解析器
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new
                InternalResourceViewResolver();
        //写这个路径，必须放到tomcat容器中手动去部署，运行。
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    /**
     * 静态资源映射
     * 程序中的静态文件需要直接访问，这时我们可以在配置里重写
     * addResourceHandlers 方法来实现
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //3. addResourceHandler 指的是对外暴露的访问路径
        //   addResourceLocations 指的是文件放置的目录
        registry.addResourceHandler("/assets/**").
                addResourceLocations("classpath:/assets/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toUpload").setViewName("/upload");
    }
}
