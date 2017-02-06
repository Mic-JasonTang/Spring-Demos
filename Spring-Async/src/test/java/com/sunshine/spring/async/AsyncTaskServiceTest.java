package com.sunshine.spring.async;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 4:34 PM.
 */
public class AsyncTaskServiceTest {

    @Test
    public void testAsyncTaskService() throws InterruptedException {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService =
                context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(asyncTaskService);
            //不懂这里为什么需要休眠，或者执行上面的语句，打印那个对象。
            //不过没有这2条语句的话，是看不到打印效果的
//            Thread.sleep(2);
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
