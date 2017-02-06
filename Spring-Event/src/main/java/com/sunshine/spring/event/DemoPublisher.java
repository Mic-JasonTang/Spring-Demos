package com.sunshine.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 3:17 PM.
 */
@Component
public class DemoPublisher {

    /**
     * 使用ApplicationContext 用来发布事件
     */
    @Autowired
    ApplicationContext context;

    public void publish(String msg) {
        //使用ApplicationContext 的 publishEvent() 方法来发布
        context.publishEvent(new DemoEvent(this, msg));
    }
}
