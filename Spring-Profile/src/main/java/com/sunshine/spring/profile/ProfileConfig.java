package com.sunshine.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Spring-Demos
 * 1. Profile 为在不同环境下使用的配置提供了支持（开发环境下的配置和生产环境下的配置肯定是不同的，例如数据库的配置）
 * 2. 通过设定@Profile 注解类或者方法，达到在不同的情况下选择不同的Bean
 * 3. 可以通过jvm 的spring.profile.active 参数来设置环境
 * 4. Web项目在Servlet 的context parameter中。
 * <p>
 * Created by JasonTang on 1/19/2017 2:33 PM.
 */
@Configuration
public class ProfileConfig {

    /**
     * 当Profile为 dev 时实例化devDemoBean
     */
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        DemoBean bean = new DemoBean();
        bean.setContent("from development profile");
        return bean;
    }

    /**
     * 当Profile为 prod 时实例化prodDemoBean
     */
    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        DemoBean bean = new DemoBean();
        bean.setContent("from production profile");
        return bean;
    }

}
