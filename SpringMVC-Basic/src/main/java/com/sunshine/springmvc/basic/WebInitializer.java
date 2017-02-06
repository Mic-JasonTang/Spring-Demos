package com.sunshine.springmvc.basic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/20/2017 2:58 PM.
 */

/**
 * WebApplicationInitializer 是Spring提供用来配置Servlet 3.0+配置的接口,
 * 从而实现了代替web.xml 的位置，实现此接口将会自动被SpringServletContainerInitializer
 * （用来启动Servlet 3.0容器）获取到。
  */
public class WebInitializer implements WebApplicationInitializer{

    /**
     * 配置Servlet Filter Listener 和一些需要被Web容器初始化的属性
     */
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new
                AnnotationConfigWebApplicationContext();
        context.register(MvcConfig.class);
        //新建一个WebApplicationContext，注册配置类，并将其和当前servletContext关联
        context.setServletContext(servletContext);

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
