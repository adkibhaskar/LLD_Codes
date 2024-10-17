public class DefenderFactory implements CarFactory {
    public Car createCar(){
        return new Defender();
    }
    
}
