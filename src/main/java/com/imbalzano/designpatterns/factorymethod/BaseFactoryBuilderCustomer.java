package com.imbalzano.designpatterns.factorymethod;

import com.imbalzano.designpatterns.ipojo.ICustomer;

public abstract class BaseFactoryBuilderCustomer {

    public ICustomer buildCustomer(String street){
        ICustomer customerBuilder = createCustomer();
        customerBuilder.printStreet(street);
        return customerBuilder;
    }

    public abstract ICustomer createCustomer();
}
