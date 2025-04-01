package Tasks;

public class Task016_PersonClass_Contructors {
    public static void main(String[] args) {
        Person1 P1 = new Person1();
        P1.printDetails();
        Person1 P2 = new Person1("Kathiravan",25,"Chennai",999999,true);
        P2.eat();
        P2.sleep();
        P2.printDetails();
        Person1 P3 = new Person1("Jhansi",22,false);
        P3.walk();
        P3.doHomeWork();
        P3.printDetails();
    }
}
class Person1{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    Person1(){
        name = "Name missing";
        age = 0;
        address = "Address missing";
        phone = 1010101;
        isMale= true;
    }
    Person1(String name, int age, String address, long phone, boolean isMale){
        this.name = name;
        this.age = age;
        this.address=address;
        this.phone=phone;
        this.isMale=isMale;
    }
    Person1(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale=isMale;
    }

    void eat(){
        System.out.println(name+" is eating");
    }
    void sleep(){
        System.out.println(name+" is sleeping");
    }
    void walk(){
        System.out.println(name+" is walking");
    }
    void doHomeWork(){
        System.out.println(name+" is doing homework");
    }
    void printDetails(){
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
        System.out.println("Address - "+address);
        System.out.println("Phone - "+phone);
        System.out.println("Is Male - "+isMale);
        System.out.println("-----------------------------------------------------------");
    }
}
