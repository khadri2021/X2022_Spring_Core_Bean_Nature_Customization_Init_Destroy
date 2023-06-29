package com.khadri.spring.core;


import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Bean bean = context.getBean("bean", Bean.class);
        System.out.println(bean.getName());
        System.out.println(bean.getColor());

        // This will destroy method before shutdown container
        context.registerShutdownHook();

    }
}