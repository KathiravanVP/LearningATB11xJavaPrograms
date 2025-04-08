package ex_11_OOPs_Super;

public class Lab042_Super_Keyword {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
class Vehicle{
    public int maxSpeed = 150;

    Vehicle(){
        System.out.println("This is default Constructor");
    }

    Vehicle(int a){
        System.out.println("This is parametrized Constructor");
    }

    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("Parametrized method");
    }

    void display(){
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle{
    private int maxSpeed = 200;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    Car(){
        super();
    }

    Car(int a){
        super(10);
    }
    void display() {

        System.out.println(this.maxSpeed);

        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();
    }
}
