package com.sunshine.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 7:11 PM.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的Bean");
    }
}
