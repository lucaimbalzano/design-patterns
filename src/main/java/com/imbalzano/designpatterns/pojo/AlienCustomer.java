package com.imbalzano.designpatterns.pojo;

import com.imbalzano.designpatterns.ipojo.ICustomer;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AlienCustomer implements ICustomer {

    private String countryCode;
    private int latitude;
    private int longitude;

    public AlienCustomer(String countryCode){this.countryCode = countryCode;}

    @Override
    public void setSmile() {
        System.out.println("Remember to smile alien!");
    }

    @Override
    public void printStreet(String address) {
        System.out.println("StreetAlien to print: "+address);
    }

}
