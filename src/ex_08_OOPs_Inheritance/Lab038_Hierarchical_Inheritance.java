package ex_08_OOPs_Inheritance;

public class Lab038_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.home();
        ch1.c1();
        System.out.println("____________________");

        Child2 ch2 = new Child2();
        ch2.home();
        ch2.c2();
        System.out.println("____________________");

        Child3 ch3 = new Child3();
        ch3.home();
        ch3.c3();

    }
}
class Parent{
    void home(){
        System.out.println("Family home");
    }
}
class Child1 extends Parent{
    void c1(){
        System.out.println("Child 1");
    }
}
class Child2 extends Parent{
    void c2(){
        System.out.println("Child 2");
    }
}
class Child3 extends Parent{
    void c3(){
        System.out.println("Child 3");
    }
}