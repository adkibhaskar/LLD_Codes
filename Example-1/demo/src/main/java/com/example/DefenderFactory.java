package com.example;
public class DefenderFactory implements CarFactory {
    public Car createSUV(){
        return new Defender110();
    }
    public Car createOffRoad(){
        return new Defender90();

    }
    
}
