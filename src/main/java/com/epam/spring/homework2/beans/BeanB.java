package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.Validator;
import com.epam.spring.homework2.interfaces.Visitor;
import org.springframework.beans.factory.annotation.Value;

public class BeanB implements Validator {

    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanB with a name " + name + " and value " + value;
    }

    private void myInitMethodB() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myInitMethodB");
    }

    private void myDestroyMethodB() {
        System.out.println(this.getClass().getSimpleName() + ". Inside myDestroyMethodB");
    }

    public void otherInitMethod() {
        System.out.println(this.getClass().getSimpleName() + ". Inside BFPPInitMethod");
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean validate(Visitor visitor) {
        System.out.println("Validation result is " + visitor.visitBeanB(this));
        return visitor.visitBeanB(this);
    }
}
