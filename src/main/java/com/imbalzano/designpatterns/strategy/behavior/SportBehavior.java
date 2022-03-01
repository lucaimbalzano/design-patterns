package com.imbalzano.designpatterns.strategy.behavior;

import com.imbalzano.designpatterns.dto.sport.Sport;
import com.imbalzano.designpatterns.dto.sport.TypologySports;

public interface SportBehavior {
     Sport getSport(Enum<TypologySports> type);
}
