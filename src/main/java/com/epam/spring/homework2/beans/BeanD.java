package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.Validator;
import com.epam.spring.homework2.interfaces.Visitor;
import org.springframework.beans.factory.annotation.Value;

public class BeanD implements Validator {

    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanD with a name " + name + " and value " + value;
    }

    private void myInitMethodD() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myInitMethodD");
    }

    private void myDestroyMethodD() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myDestroyMethodD");
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean validate(Visitor visitor) {
        System.out.println("Validation result is " + visitor.visitBeanD(this));
        return visitor.visitBeanD(this);
    }
}
