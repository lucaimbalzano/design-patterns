package com.imbalzano.designpatterns.factorymethod.customer;

import com.imbalzano.designpatterns.factorymethod.BaseFactoryBuilderCustomer;
import com.imbalzano.designpatterns.ipojo.ICustomer;
import com.imbalzano.designpatterns.pojo.LocalCustomer;

public class LocalCustomerFactory extends BaseFactoryBuilderCustomer {
    @Override
    public ICustomer createCustomer() {
        LocalCustomer localCustomer = new LocalCustomer();
        System.out.println("++ LocalCustomerFactory::createCustomer --> position: "+localCustomer.getPosition("3254514325","4325435442"));
        return localCustomer;
    }
}
