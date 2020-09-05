package com.company;

import com.company.carfactory.AudiA4CarFactory;
import com.company.carfactory.BMWFactory;
import com.company.carfactory.CarFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarFactory audiA4 = new AudiA4CarFactory();
        CarTransport carTransport = new CarTransport(audiA4);
        carTransport.transport();

        CarFactory bmw = new BMWFactory();
        CarTransport carTransport1 = new CarTransport(bmw);
        carTransport1.transport();

    }
}
