package com.khadri.spring.core.callbacks.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans_config.xml");

        context.registerShutdownHook();


    }
}
