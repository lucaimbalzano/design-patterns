package com.imbalzano.designpatterns.dto.transport;

import com.imbalzano.designpatterns.strategy.behavior.TransportBehavior;

public class Transport implements TransportBehavior {
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
}
