package com.sunshine.spring.condition;

import com.sunshine.spring.conditional.ConditionConfig;
import com.sunshine.spring.conditional.ListService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 5:51 PM.
 */
public class ConditionTest {

    @Test
    public void testCondition() {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.println(listService.showlistCmd());
    }
}
