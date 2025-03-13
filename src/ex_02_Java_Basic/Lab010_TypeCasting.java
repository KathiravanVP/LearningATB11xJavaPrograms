package ex_02_Java_Basic;

public class Lab010_TypeCasting {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // Implicit Casting - Widening
        int c = (int)a; // Explicit Casting - Widening( doesn't require)
        System.out.println(c+" "+b);

        int d = 500;
        //byte e = d; Implicit casting - Narrowing - Not allowed
        byte f = (byte)d; // Explicit Casting - Narrowing - Data loss
        System.out.println(f);

        long ph_no = 9876543210l;
        short s = (short) ph_no; // Explicit Casting - Narrowing
        System.out.println(s);

        int course = 100;
        float GST = 18.45f;
        int total1 = course+(int)GST; // Narrow - Explicit
        float total2 = course+GST; // Widening - auto - Implicit
        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);


    }
}
