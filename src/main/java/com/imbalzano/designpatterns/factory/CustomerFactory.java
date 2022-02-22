package com.imbalzano.designpatterns.factory;

import com.imbalzano.designpatterns.factory.IAbstractFactory;
import com.imbalzano.designpatterns.ipojo.ICustomer;
import com.imbalzano.designpatterns.pojo.customer.AlienCustomer;
import com.imbalzano.designpatterns.pojo.customer.LocalCustomer;

public class CustomerFactory implements IAbstractFactory<ICustomer> {

    @Override
    public ICustomer create(String customer) {
        if(customer.equalsIgnoreCase("alien"))
             return new AlienCustomer("SPACE");
        if(customer.equalsIgnoreCase("local"))
            return new LocalCustomer("047594984938748");
        return null;
    }

}
