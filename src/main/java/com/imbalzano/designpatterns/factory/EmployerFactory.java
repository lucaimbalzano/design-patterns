package com.imbalzano.designpatterns.factory;

import com.imbalzano.designpatterns.factory.IAbstractFactory;
import com.imbalzano.designpatterns.pojo.employer.Employer;

public class EmployerFactory implements IAbstractFactory<Employer> {

    @Override
    public Employer create(String customer) {
        if(customer.equalsIgnoreCase("normal"))
            return new Employer();
        return null;
    }
}
