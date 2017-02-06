package com.sunshine.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Spring-Demos
 * 1. 实现ApplicationListener接口，并制定监听的事件类型
 * <p>
 * Created by JasonTang on 1/19/2017 3:14 PM.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    //2. 使用onApplicationEvent 方法对消息进行接收处理
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();

        System.out.println("DemoListener.onApplicationEvent 接收到了 " + msg);
    }
}
