package com.imbalzano.designpatterns.factory;

public abstract class BaseFactoryBuilder {

    public static IAbstractFactory getFactory(String type){
        if("customer".equalsIgnoreCase(type))
            return new CustomerFactory();
        if("employer".equalsIgnoreCase(type))
            return new EmployerFactory();
        return null;
    }
}
