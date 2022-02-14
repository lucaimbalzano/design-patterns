package com.imbalzano.designpatterns.pojo;

import com.imbalzano.designpatterns.ipojo.ICustomer;
import lombok.Data;
import lombok.ToString;

import java.lang.invoke.StringConcatFactory;

@Data
@ToString
public class LocalCustomer implements ICustomer {

    private String latitude;
    private String longitude;

    @Override
    public void setSmile() {
        System.out.println("Remember to smile civil!");
    }

    @Override
    public void printStreet(String address) {
        System.out.println("StreetLocal to print: "+address);
    }

    public String getPosition(String lat, String longi){
        System.out.println("Position is: "+lat+" , "+longi);
        String position = lat+","+longi;
        return position;
    }
}
