package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.Validator;
import com.epam.spring.homework2.interfaces.Visitor;
import org.springframework.beans.factory.annotation.Value;

public class BeanC implements Validator {

    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanC with a name " + name + " and value " + value;
    }

    private void myInitMethodC() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myInitMethodC");
    }

    private void myDestroyMethodC() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myDestroyMethodC");
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean validate(Visitor visitor) {
        System.out.println("Validation result is " + visitor.visitBeanC(this));
        return visitor.visitBeanC(this);
    }
}
