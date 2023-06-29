package com.khadri.spring.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean, DisposableBean {

    private String name;

    private String color;

    Bean(){
        System.out.println("Zero-arg Bean constructor");
    }

//    Bean(String name,String color){
//        System.out.println("Two-arg Bean constructor");
//        this.name = name;
//        this.color = color;
//    }

    public void setName(String name) {
        System.out.println("name setter injection");
        this.name = name;
    }

    public void setColor(String color) {
        System.out.println("color setter injection");
        this.color = color;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method execution");
        if("green".equals(this.color)){
            System.out.println("Its green");
        }else {
            System.out.println("Its not green");
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() method execution");
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


}

