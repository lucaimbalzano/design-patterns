package com.imbalzano.designpatterns;

import com.imbalzano.designpatterns.factorymethod.BaseFactoryBuilderCustomer;
import com.imbalzano.designpatterns.factorymethod.customer.AlienCustomerFactory;
import com.imbalzano.designpatterns.factorymethod.customer.LocalCustomerFactory;
import com.imbalzano.designpatterns.ipojo.ICustomer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        BaseFactoryBuilderCustomer baseFactoryBuilderLocalCustomer = new LocalCustomerFactory();
        ICustomer localCustomerFactory = baseFactoryBuilderLocalCustomer.buildCustomer(" 1234, LocalStreet, Arizona AR");

        BaseFactoryBuilderCustomer baseFactoryBuilderAlienCustomer = new AlienCustomerFactory();
        ICustomer alienCustomerFactory = baseFactoryBuilderAlienCustomer.buildCustomer(" 4321, AlienStreet, Florida FL");

        SpringApplication.run(DesignPatternsApplication.class, args);
    }



}
