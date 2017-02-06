package com.sunshine.spring.conditional;

/**
 * Spring-Demos
 * <p>
 * Created by JasonTang on 1/19/2017 5:46 PM.
 */
public class LinuxListService implements ListService{

    public String showlistCmd() {
        return "ls";
    }
}
