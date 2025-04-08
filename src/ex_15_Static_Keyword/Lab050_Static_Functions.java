package ex_15_Static_Keyword;

public class Lab050_Static_Functions {
    public static void main(String[] args) {
        ABC.commonToAll();
        System.out.println(ABC.b);

        ABC obj1 = new ABC();
        obj1.display();
        System.out.println(obj1.a);

    }
}
class ABC{
    int a = 10;
    static int b = 50;

    void display(){
        System.out.println(b);
        System.out.println("Non static function");
    }

    static void commonToAll(){
        System.out.println("Static function");
    }
}
