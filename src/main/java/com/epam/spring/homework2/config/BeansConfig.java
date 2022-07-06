package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:beans.properties")
@Import(OtherConfig.class)
public class BeansConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean(initMethod = "myInitMethodB", destroyMethod = "myDestroyMethodB")
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "myInitMethodC", destroyMethod = "myDestroyMethodC")
    @DependsOn({"beanB", "beanD"})
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(initMethod = "myInitMethodD", destroyMethod = "myDestroyMethodD")
    public BeanD beanD() {
        return new BeanD();
    }

    @Bean
    public BeanE beanE() {
        return new BeanE();
    }

    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF();
    }

}
