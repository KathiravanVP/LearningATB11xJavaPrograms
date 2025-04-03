package ex_08_OOPs_Inheritance.Multilevel_Inheritance;

import java.sql.SQLOutput;

public class Lab037_Dynamic_Dispatch {
    public static void main(String[] args) {
        Grandfather1 g1 = new Son1();
        g1.gf();
        g1.home();
        System.out.println("___________________________");
        Grandfather1 g2 = new Father1();
        g2.gf();
        g2.home();
        System.out.println("___________________________");
        Father1 f1 = new Son1();
        f1.f();
        f1.home();
    }
}
