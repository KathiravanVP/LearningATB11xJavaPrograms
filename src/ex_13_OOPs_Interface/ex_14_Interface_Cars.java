package ex_13_OOPs_Interface;

public class ex_14_Interface_Cars {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

interface Engine{
    void startEngine();
    void stopEngine();
}

interface Brake{
    void applyBrake();
}

class Car implements Engine,Brake{

    @Override
    public void applyBrake() {
        System.out.println("Applying brake!!");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine!!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping the engine!!");
    }

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }
}