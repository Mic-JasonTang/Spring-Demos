package com.sunshine.spring.async;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 4:07 PM.
 */
@Configuration
@ComponentScan("com.sunshine.spring.async")
@EnableAsync
@RestController
//1. 使用@EnableAsync 注解开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{

    //配置类实现 AsyncConfigurer 接口并重写getAsyncExecutor 方法，并返回一个
    //ThreadPoolTaskExecutor, 这样我们就获得了一个基于线程池TaskExecutor
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();

        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();

        return taskExecutor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
