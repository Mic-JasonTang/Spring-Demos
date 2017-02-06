package com.sunshine.spring.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 5:40 PM.
 */
public class LinuxCondition implements Condition{

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Linux");
    }
}
