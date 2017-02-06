package com.sunshine.spring.profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 2:38 PM.
 */
public class ProfileConfigTest {

    @Test
    public void testProfileConfig() {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext();
        //1. 先将活动的Profile 设置为prod
        context.getEnvironment().setActiveProfiles("dev");
        //2. 后置注册Bean 配置类，不然会报Bean 未定义的错误
        context.register(ProfileConfig.class);
        //3. 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
