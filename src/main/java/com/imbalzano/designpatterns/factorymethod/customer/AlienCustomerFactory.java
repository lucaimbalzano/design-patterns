package com.imbalzano.designpatterns.factorymethod.customer;

import com.imbalzano.designpatterns.factorymethod.BaseFactoryBuilderCustomer;
import com.imbalzano.designpatterns.ipojo.ICustomer;
import com.imbalzano.designpatterns.pojo.AlienCustomer;

public class AlienCustomerFactory extends BaseFactoryBuilderCustomer {
    @Override
    public ICustomer createCustomer() {
        AlienCustomer alienCustomer = new AlienCustomer("FL");
        System.out.println("++ AlienCustomerFactory::createCustomer --> countryCode: "+alienCustomer.getCountryCode());
        return alienCustomer;
    }
}
