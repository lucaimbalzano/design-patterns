package com.imbalzano.designpatterns.dto.sport;

import com.imbalzano.designpatterns.strategy.behavior.SportBehavior;

public class Sport implements SportBehavior {


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
}
