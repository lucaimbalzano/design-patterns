package com.imbalzano.designpatterns.strategy.behavior;

import com.imbalzano.designpatterns.dto.transport.Transport;

public interface TransportBehavior {
    public Transport getTransport(String transport);
}
