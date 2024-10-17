package com.example;

public class CarFactory {
    public Car createCar(String input){
        if(input.equals("Scorpio")){
            return new Scorpio();
        }
        else if(input.equals("Defender")){
            return new Defender();
        }
        else{
            return null;
        }

    }
}