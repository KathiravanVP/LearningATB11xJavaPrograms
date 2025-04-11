package ex_17_Wrapper_Class;

public class Lab054_Wrapper_Conversion {
    public static void main(String[] args) {
        // String to Wrapper
        String num  = "50";
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------------------");

        // String to Primitive
        int aa = Integer.parseInt(num);
        System.out.println(aa);
        System.out.println("-----------------------");

        // Wrapper to String (toString method)
        System.out.println(a.toString());
        System.out.println("-----------------------");

        // Primitive to String
        int age = 88;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

    }
}
