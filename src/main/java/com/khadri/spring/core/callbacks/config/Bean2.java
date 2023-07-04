package com.khadri.spring.core.callbacks.config;

public class Bean2 {

    private String name;

    private String color;

    Bean2(){
        System.out.println("Bean2 constructor execution");
    }
    public void setColor(String color) {
        System.out.println("Bean2 setColor execution");
        this.color = color;
    }

    public void setName(String name) {
        System.out.println("Bean2 setName execution");
        this.name = name;
    }

    void init(){
        System.out.println("initialization method");
    }

    void destroy(){
        System.out.println("destruction method");
    }
}
