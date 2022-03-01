package com.imbalzano.designpatterns;

import com.imbalzano.designpatterns.dto.Customer;
import com.imbalzano.designpatterns.dto.sport.Sport;
import com.imbalzano.designpatterns.dto.sport.TypologySports;
import com.imbalzano.designpatterns.dto.transport.CarTransport;
import com.imbalzano.designpatterns.strategy.behavior.SportBehavior;
import com.imbalzano.designpatterns.strategy.behavior.TransportBehavior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DesignPatternsApplication {


    /*
     In this way we decide which kind of customer behaviours
     have the customer encapsulating the code
     */
    public static void main(String[] args) {
        System.out.println("### START MAIN ###");

        Customer customerBasketCar = new Customer();
        customerBasketCar.setBirth(new Date(20-20-20));
        customerBasketCar.setFirstname("Frank");
        customerBasketCar.setIdCardNumber("CA7098E5");
        customerBasketCar.setSurname("Gregory");
        System.out.println("### SPORT: "+customerBasketCar.getSport(TypologySports.BASKET)==null ? "Null Value Retrived" : "### "+customerBasketCar.getSport(TypologySports.BASKET)+" ###");
        System.out.println("### TRANSPORT: "+ customerBasketCar.getTransport("CAR")==null ? "Null Value Retrived" :  "### "+customerBasketCar.getTransport("CAR")+" ###");
        System.out.println(customerBasketCar.toStringObj(customerBasketCar));

        System.out.println("### END MAIN ###");
        SpringApplication.run(DesignPatternsApplication.class, args);
    }



}
