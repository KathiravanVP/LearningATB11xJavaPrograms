package ex_02_Java_Basic;

public class Lab009_Math_Function {
    public static void main(String[] args) {
        int X = 10, Y = 10, Z = 10;
        double Result;
        Result=Math.cbrt(Math.pow(X,2)+Math.pow(Y,2) - Math.abs(Z));
        System.out.println(Result);
    }
}
