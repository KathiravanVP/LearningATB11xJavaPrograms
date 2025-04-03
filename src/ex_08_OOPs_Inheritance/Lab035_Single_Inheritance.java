package ex_08_OOPs_Inheritance;

public class Lab035_Single_Inheritance {
    public static void main(String[] args) {
        Son S = new Son();
        S.house1();
        System.out.println(S.gold1);
        S.house();
        System.out.println(S.gold);
    }
}
class Father{
    int gold = 10000;
    void house(){
        System.out.println("Father's house");
    }
}
class Son extends Father{
    int gold1 = 5000;
    void house1(){
        System.out.println("Son's House");
    }
}
