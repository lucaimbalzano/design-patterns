package com.imbalzano.designpatterns.pojo.customer;

import com.imbalzano.designpatterns.ipojo.ICustomer;
import lombok.Data;
import lombok.ToString;
import org.springframework.cglib.core.CodeGenerationException;

import java.io.Serializable;
import java.lang.invoke.StringConcatFactory;

@Data
@ToString
public class LocalCustomer implements ICustomer {

    private final String UNIQUE_CODE  = "047594984938748";
    private String COVER_CODE;
    private String latitude;
    private String longitude;
    
    public LocalCustomer(String crtf){
        if(!(crtf.equalsIgnoreCase("047594984938748")))
            throw new CodeGenerationException(new Throwable("CODE inserted wrong"));
        this.COVER_CODE = this.UNIQUE_CODE;
    }

    @Override
    public String getCustomer() {
        return "local";
    }

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
