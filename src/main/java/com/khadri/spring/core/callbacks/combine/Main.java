package com.khadri.spring.core.callbacks.combine;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans_combine.xml");

        context.registerShutdownHook();

    }
}
