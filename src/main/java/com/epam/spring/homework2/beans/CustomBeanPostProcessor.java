package com.epam.spring.homework2.beans;

import com.epam.spring.homework2.interfaces.Validator;
import com.epam.spring.homework2.interfaces.Visitor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    private final Visitor visitor;

    public CustomBeanPostProcessor(ValidationVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getSimpleName() + ". Inside BeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getSimpleName() + ". Inside BeanPostProcessor.postProcessAfterInitialization");
        if (bean instanceof Validator) {
            ((Validator) bean).validate(visitor);
        }
        return bean;
    }
}
