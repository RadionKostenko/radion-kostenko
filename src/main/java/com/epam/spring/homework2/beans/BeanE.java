package com.epam.spring.homework2.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanE with a name " + name + " and value " + value;
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println(this.getClass().getSimpleName() + ". Inside @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + ". Inside @PreDestroy");
    }

}
