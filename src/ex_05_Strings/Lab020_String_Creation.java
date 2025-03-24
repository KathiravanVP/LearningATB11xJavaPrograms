package ex_05_Strings;

public class Lab020_String_Creation {
    public static void main(String[] args) {
        String str1 = "First String"; //JVM storage - String Constant Pool
        String str2 = new String("Second String"); //JVM storage - Heap Area ( Object)
        System.out.println(str1);
        System.out.println(str2);
    }
}
