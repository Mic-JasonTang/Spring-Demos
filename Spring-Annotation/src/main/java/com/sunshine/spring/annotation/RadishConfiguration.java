package com.sunshine.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Spring-Demos
 * 1. 元注解，可以注解到别的注解上的注解，被注解的注解称之为组合注解
 *    组合注解具备元注解的功能。
 * 2. 比如@Configuration 就是一个组合@Component注解，表情这个类其实也是一个Bean
 *
 * 3. 本类是想@Configuration 和@ComponentScan 注解到配置类上
 *    这样@RadishConfiguration 就一个表示上面的2个注解了
 * <p>
 * Created by JasonTang on 1/19/2017 7:04 PM.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//配置@configuration 元注解
@Configuration
//配置@ComponentScan 元注解
@ComponentScan
public @interface RadishConfiguration {
    //覆盖ComponentScan 的value参数
    String[] value() default {};
}
