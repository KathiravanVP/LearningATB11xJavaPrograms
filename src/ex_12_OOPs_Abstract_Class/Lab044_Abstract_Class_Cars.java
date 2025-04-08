package ex_12_OOPs_Abstract_Class;

public class Lab044_Abstract_Class_Cars {
    public static void main(String[] args) {
        Car i10 = new Car();
        i10.drive();
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void message(){
        System.out.println("This is an Engine class");
    }
}
class Car extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the Car!!!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Car!!!");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}