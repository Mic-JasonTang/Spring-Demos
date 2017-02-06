package com.sunshine.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Spring-Demos
 * 1. 通过配置类注解@EnableScheduling 来开启对计划任务的支持，
 *    然后在要执行计划任务的方法上注解@Scheduled，声明这是一个计划任务
 * 2. Spring通过@Scheduled 支持多种类型的计划任务，包含cron、fixDelay、fixRate等
 * <p>
 * Created by JasonTang on 1/19/2017 5:04 PM.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new
            SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔1s执行一次" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 18 17 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间: " + dateFormat.format(new Date()) + " 执行");
    }
}
