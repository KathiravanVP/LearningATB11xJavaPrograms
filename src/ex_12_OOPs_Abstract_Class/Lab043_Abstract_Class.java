package ex_12_OOPs_Abstract_Class;

public class Lab043_Abstract_Class {
    public static void main(String[] args) {
        Child child = new Child();
        child.loan25k();
        child.loan50k();
    }
}
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Father's loan - 25k");
    }
}
class Child extends Father{
    @Override
    void loan50k() {
        System.out.println("Family's loan - 50k");
    }
}