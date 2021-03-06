package com.sunshine.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Spring-Demos
 * 1. Spring 的事件（Application Event） 为Bean 与 Bean之间的消息通信提供了支持。
 *    当一个Bean处理完一个任务之后，希望另外一个Bean 知道并能做相应的处理，这是我们就需要
 *    让另外一个一个Bean 监听当前Bean 所发送的事件。
 * 2. Spring 的事件需要遵循如下的流程：
 *    2.1 自定义事件，继承ApplicationEvent
 *    2.2 定义事件监听器，实现ApplicationListener
 *    2.3 使用容器发布事件
 * <p>
 * Created by JasonTang on 1/19/2017 2:59 PM.
 */
public class DemoEvent extends ApplicationEvent{

    private String msg;

    public DemoEvent(Object source, String msg) {
        //这里需要一个super，是因为ApplicationEvent类没有空构造
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
