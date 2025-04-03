package ex_08_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab036_Multilevel_Inheritance {
    public static void main(String[] args) {
        Grandfather1 gf = new Grandfather1();
        gf.gf();
        System.out.println("__________________________");
        Father1 f = new Father1();
        f.f();
        f.gf();
        System.out.println("__________________________");
        Son1 s = new Son1();
        s.s();
        s.f();
        s.gf();
    }
}


