package ex_07_OOPs;

public class Lab035_Constructor_Overloading {
    public static void main(String[] args) {
        Person P1 = new Person();
        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.phone);
        System.out.println(P1.address);
        System.out.println("-----------------------------------------------");

        Person P2 = new Person("Kathiravan",25);
        System.out.println(P2.name);
        System.out.println(P2.age);
        System.out.println(P2.phone);
        System.out.println(P2.address);
        System.out.println("-----------------------------------------------");

        Person P3 = new Person("Mano",33,978987);
        System.out.println(P3.name);
        System.out.println(P3.age);
        System.out.println(P3.phone);
        System.out.println(P3.address);
        System.out.println("-----------------------------------------------");

        Person P4 = new Person("Alan",50, 7897897, "Chennai");
        System.out.println(P4.name);
        System.out.println(P4.age);
        System.out.println(P4.phone);
        System.out.println(P4.address);

    }
}
class Person {
    String name;
    int age;
    long phone;
    String address;

    //Default Constructor
    Person(){
        name = "No name";
        age = 0;
        phone = 101010;
        address = "No address";
    }
    //Parametrized Constructor
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, int age,long phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    Person(String name, int age,long phone,String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
}