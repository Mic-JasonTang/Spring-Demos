package com.sunshine.spring.event;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 3:21 PM.
 */
public class DemoPublisherTest {

    @Test
    public void testDemoPublisher() {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");

        context.close();
    }
}
