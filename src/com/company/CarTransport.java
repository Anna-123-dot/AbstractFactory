package com.company;

import com.company.carfactory.CarFactory;
import com.company.carfactory.Combi;
import com.company.carfactory.Sedan;

public class CarTransport {
    private CarFactory carFactory;

    public CarTransport(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    public void transport () {
        Sedan sedan = carFactory.createSedan();
        System.out.println("transporting sedan "+sedan.getName());
        Combi combi = carFactory.createCombi();
        System.out.println("transporting combi "+combi.getName());
    }

}
