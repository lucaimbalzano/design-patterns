package com.imbalzano.designpatterns.dto.sport;

import lombok.Getter;

@Getter
public enum TypologySports{
   BASKET("BASKET"),
    SOCCER("SOCCER"),
    VOLLEYBALL("VOLLEYBALL"),
    BASEBALL("BASEBALL"),
    RUGBY("RUGBY"),
    FOOTBALL("FOOTBALL"),
    TENNISTABLE("TENNISTABLE"),
    TENNIS("TENNIS"),
    BOX("BOX"),
    MMA("MMA"),
    DOWNHILL("DOWNHILL"),
    SNOWBOARD("SNOWBOARD");

   private final String sportTypology;

    TypologySports(String sportTypology) {
        this.sportTypology = sportTypology;
    }

    public String getEnum(String sportTypology){
      return sportTypology;
    }

}
