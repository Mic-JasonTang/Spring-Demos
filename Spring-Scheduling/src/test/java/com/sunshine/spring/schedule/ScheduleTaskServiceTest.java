package com.sunshine.spring.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 5:15 PM.
 */
public class ScheduleTaskServiceTest {

    public static void main(String[] args) {
        new ScheduleTaskServiceTest().testScheduleTaskService();
    }

    public void testScheduleTaskService() {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        ScheduledTaskService scheduledTaskService = new ScheduledTaskService();
    }
}
