package com.sunshine.spring.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 4:28 PM.
 */
@Service
public class AsyncTaskService {

    /**
     * 1. 通过@Async注解表名该方法是个异步方法，如果注解在类级别，则
     *    表名该类所有的方法都是异步方法。
     *    而这里的方法自动被注入 使用ThreadPoolTaskExecutor 作为TaskExecutor
     */
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务 + 1 : " + (i+1));
    }

}
