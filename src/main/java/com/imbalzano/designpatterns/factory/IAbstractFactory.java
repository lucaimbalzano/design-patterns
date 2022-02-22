package com.imbalzano.designpatterns.factory;

public interface IAbstractFactory<T> {
    T create(String type);
}
