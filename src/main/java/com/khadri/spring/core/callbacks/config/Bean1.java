package com.khadri.spring.core.callbacks.config;

public class Bean1 {
    private String name;

    private String color;

    Bean1(){
        System.out.println("Bean1 constructor execution");
    }
    public void setColor(String color) {
        System.out.println("Bean1 setColor execution");
        this.color = color;
    }

    public void setName(String name) {
        System.out.println("Bean1 setName execution");
        this.name = name;
    }

    public void init(){
        System.out.println("init method execution");
        if(name !=null){
            System.out.println(this.name);
        }

        if(color != null){
            System.out.println(this.color);
        }
    }

    public void destroy(){
        System.out.println("destroy method execution");
    }

}
