package ex_19_Generics;

public class Lab063_Generic_Method {
    public static void main(String[] args) {
        System.out.println(temp_sum(6,9));
        System.out.println(temp_sum(3.1,4.3));
        System.out.println(temp_sum("Gene","rics"));
    }

    static <T> T temp_sum(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
