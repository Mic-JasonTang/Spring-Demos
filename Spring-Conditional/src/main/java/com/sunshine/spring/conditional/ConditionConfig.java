package com.sunshine.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Spring-Demos
 * 1. 通过@Conditional 注解，符合Windows 条件则实例化windowsListService
 *    若符合Linux 条件，则实例化linuxListService
 * <p>
 * Created by JasonTang on 1/19/2017 5:47 PM.
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
