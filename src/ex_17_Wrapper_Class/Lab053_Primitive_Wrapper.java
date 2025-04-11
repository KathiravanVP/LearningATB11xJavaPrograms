package ex_17_Wrapper_Class;

public class Lab053_Primitive_Wrapper {
    public static void main(String[] args){
        int a = 10;
        Integer age = 65;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
        System.out.println("-----------------------");
        Integer b = a;
        System.out.println(b);
        System.out.println("-----------------------");
        Integer c = 20;
        int d = c;
        System.out.println(d);
    }
}
