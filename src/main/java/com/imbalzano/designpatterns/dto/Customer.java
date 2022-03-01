package com.imbalzano.designpatterns.dto;

import com.imbalzano.designpatterns.dto.sport.*;
import com.imbalzano.designpatterns.dto.transport.BusTransport;
import com.imbalzano.designpatterns.dto.transport.CarTransport;
import com.imbalzano.designpatterns.dto.transport.Transport;
import com.imbalzano.designpatterns.strategy.behavior.SportBehavior;
import com.imbalzano.designpatterns.strategy.behavior.TransportBehavior;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Customer implements  TransportBehavior,SportBehavior{

    private String firstname;
    private String surname;
    private String idCardNumber;
    private Date birth;


    public Customer(String firstname, String surname, String idCardNumber, Date birth) {
        this.firstname = firstname;
        this.surname = surname;
        this.idCardNumber = idCardNumber;
        this.birth = birth;
    }

    public Customer(){}

    @Override
    public Sport getSport(Enum<TypologySports> type) {
        switch (type.toString()){
            case "BASKET":
                return new BasketSport();
            case "RUGBY":
                return new RugbySport();
            case "SOCCER":
                return new SoccerSport();
            case "VOLLEYBALL":
                return new VolleyBallSport();
            case "FOOTBALL":
                return new FootBallSport();
        }
        return null;
    }

    @Override
    public Transport getTransport(String transport) {
        switch(transport){
            case "CAR":
                return new CarTransport();
            case "BUS":
                return new BusTransport();
        }
        return null;
    }


    public String toStringObj(Customer c) {
        return "### Customer values: " +
                "firstname: '" + c.getFirstname() + '\'' +
                ", surname: '" + c.getSurname() + '\'' +
                ", idCardNumber: '" + c.getIdCardNumber() + '\'' +
                ", birth: " + c.getBirth() +
                " ###";
    }
}
