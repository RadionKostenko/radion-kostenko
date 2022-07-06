package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA with a name " + name + " and value " + value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + ". Inside InitializingBean.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + ". Inside DisposableBean.destroy");
    }
}
