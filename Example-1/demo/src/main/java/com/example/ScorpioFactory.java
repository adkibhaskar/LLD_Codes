package com.example;
public class ScorpioFactory implements CarFactory {
    public Car createSUV(){
        return new ScorpioN();

    }
   public Car createOffRoad(){
    return new ScorpioClassic();
   }
    
    
}
