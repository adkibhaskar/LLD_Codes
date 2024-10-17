package com.example;

public class AbstractFactoryPattern 
{
    public static void main( String[] args )
    {
        CarFactory scorpioFactory = new ScorpioFactory();

        Car scorpioN = scorpioFactory.createSUV();
        scorpioN.drive();

        Car scorpioClassic = scorpioFactory.createOffRoad();
        scorpioClassic.drive();

        CarFactory defenderFactory = new DefenderFactory();

        Car defender110 = defenderFactory.createSUV();
        defender110.drive();

        Car defender90 = defenderFactory.createOffRoad();
        defender90.drive();

        
       
    }
}
