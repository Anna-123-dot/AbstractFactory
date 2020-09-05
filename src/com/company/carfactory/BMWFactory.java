package com.company.carfactory;

public class BMWFactory implements CarFactory{
    @Override
    public Combi createCombi() {
        return new BMWCombi();
    }

    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }
}
