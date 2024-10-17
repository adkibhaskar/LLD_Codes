package com.example;
public class SimpleFactory 
{
    public static void main( String[] args )
    {
        CarFactory carFactory = new CarFactory();
        Car c1 = carFactory.createCar("Scorpio");
        Car c2 = carFactory.createCar("Defender");
        c1.driveCar();
        c2.driveCar();
       
    }
}
