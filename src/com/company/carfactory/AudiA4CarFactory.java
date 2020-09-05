package com.company.carfactory;

public class AudiA4CarFactory implements CarFactory{

    @Override
    public Combi createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public Sedan createSedan() {
        return new AudiA4Sedan();
    }
}
