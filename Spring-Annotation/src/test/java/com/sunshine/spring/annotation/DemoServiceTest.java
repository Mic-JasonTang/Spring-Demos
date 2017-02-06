package com.sunshine.spring.annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 7:22 PM.
 */
public class DemoServiceTest {

    @Test
    public void testDemoService() {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(DemoConfig.class);

        //可以使用Bean的name来获取，首字母小写的方式
//        DemoService demoService = (DemoService) context.getBean("demoService");

        //也可以使用加载类的方式
        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult    ();

        context.close();
    }
}
