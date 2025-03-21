package ex_04_Functions;

public class Lab018_User_Defined_Functions {
    public static void main(String[] args) {
        String n = ret("Hi");
        System.out.println(n);
    }

    public static int ret(int a){
        return 10;
    }
    public static double ret(double a){
        return 10.5;
    }
    public static float ret(float a){
        return 10.5f;
    }
    public static String ret(String a){
        return "Hello";
    }
}
