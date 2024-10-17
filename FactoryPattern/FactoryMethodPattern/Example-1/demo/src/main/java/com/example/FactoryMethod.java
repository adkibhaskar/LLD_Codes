public class FactoryMethod {
    public static void main(String[] args) {
        CarFactory scorpioFactory = new ScorpioFactory();
        CarFactory defenderFactory = new DefenderFactory();
        Car scorpio = scorpioFactory.createCar();
        Car defender = defenderFactory.createCar();
        scorpio.drive();
        defender.drive();
        
    }
}