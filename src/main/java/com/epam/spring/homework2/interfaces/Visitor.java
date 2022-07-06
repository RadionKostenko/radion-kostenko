package com.epam.spring.homework2.interfaces;

import com.epam.spring.homework2.beans.BeanB;
import com.epam.spring.homework2.beans.BeanC;
import com.epam.spring.homework2.beans.BeanD;

public interface Visitor {

    boolean visitBeanB(BeanB bean);

    boolean visitBeanC(BeanC bean);

    boolean visitBeanD(BeanD bean);
}
