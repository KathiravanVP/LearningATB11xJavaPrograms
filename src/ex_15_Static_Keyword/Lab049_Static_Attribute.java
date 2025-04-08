package ex_15_Static_Keyword;

public class Lab049_Static_Attribute {
    public static void main(String[] args) {
        TestClass1 tc1 = new TestClass1(30);
        tc1.displayValue();
        System.out.println(TestClass1.b);

        System.out.println("---------------------------");

        TestClass1 tc2 = new TestClass1(50);
        tc2.displayValue();
        System.out.println(TestClass1.b);
    }
}
class TestClass1{
    int a = 10;
    static int b = 20;

    TestClass1(int a) {
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
    }
}
