package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.Visitor;
import org.springframework.stereotype.Component;

@Component
public class ValidationVisitor implements Visitor {

    public static final String INSIDE_VALIDATION_METHOD = ". Inside validation method";

    @Override
    public boolean visitBeanB(BeanB bean) {
        System.out.println(bean.getClass().getSimpleName() + INSIDE_VALIDATION_METHOD);
        return FieldsValidator.validate(bean.getName(), bean.getValue());
    }

    @Override
    public boolean visitBeanC(BeanC bean) {
        System.out.println(bean.getClass().getSimpleName() + INSIDE_VALIDATION_METHOD);
        return FieldsValidator.validate(bean.getName(), bean.getValue());
    }

    @Override
    public boolean visitBeanD(BeanD bean) {
        System.out.println(bean.getClass().getSimpleName() + INSIDE_VALIDATION_METHOD);
        return FieldsValidator.validate(bean.getName(), bean.getValue());
    }
}
