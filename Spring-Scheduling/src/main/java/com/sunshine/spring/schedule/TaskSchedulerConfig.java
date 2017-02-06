package com.sunshine.spring.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 5:14 PM.
 */
@Configuration
@ComponentScan("con.sunshine.spring.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
