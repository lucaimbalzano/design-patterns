package com.imbalzano.designpatterns;

import com.imbalzano.designpatterns.factory.BaseFactoryBuilder;
import com.imbalzano.designpatterns.factory.CustomerFactory;
import com.imbalzano.designpatterns.factory.EmployerFactory;
import com.imbalzano.designpatterns.factory.IAbstractFactory;
import com.imbalzano.designpatterns.ipojo.ICustomer;
import com.imbalzano.designpatterns.pojo.employer.Employer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        EmployerFactory employerFactory = (EmployerFactory) BaseFactoryBuilder.getFactory("employer");
        Employer employer = employerFactory.create("normal");
        employer.iExist();
        SpringApplication.run(DesignPatternsApplication.class, args);
    }



}
