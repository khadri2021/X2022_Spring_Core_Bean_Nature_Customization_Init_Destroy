package com.khadri.spring.core.callbacks.combine;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean implements InitializingBean, DisposableBean {
    private String name;

    private String color;
    Bean(){
        System.out.println("Zero-arg Bean constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean  destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet method");
    }

    public void custInit(){
        System.out.println("custInit method execution");
    }

    public void custDestroy(){
        System.out.println("custDestroy method execution");
    }


    @PostConstruct
    public void postConstruction(){
        System.out.println("postConstruction method execution");
    }

    @PreDestroy
    public void postDestruction(){
        System.out.println("postDestruction method execution");
    }
}
