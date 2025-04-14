package ex_20_Collection_Framework;

import java.util.Stack;

public class Lab072_Stack {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("Kathir");
        s.push("Mano");
        s.push("Abhi");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        s.add("Hari");
        s.add("Hari");
        s.push("Vijay");
        System.out.println(s);
        System.out.println(s.add("Ram"));
        System.out.println(s);
    }
}
