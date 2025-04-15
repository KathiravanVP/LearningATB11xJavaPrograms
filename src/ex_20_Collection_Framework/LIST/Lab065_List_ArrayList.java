package ex_20_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab065_List_ArrayList {
    public static void main(String[] args) {
        List fruits = List.of("Apple","Banana","Mango","Orange");
        System.out.println(fruits);

        ArrayList aL = new ArrayList();
        aL.add(1);
        aL.add(2);
        aL.add(3);
        aL.add('a');
        aL.add('b');
        aL.add('c');
        aL.add("A1");
        aL.add("B2");
        aL.add("C3");

        System.out.println(aL);
        System.out.println(aL.size());
        System.out.println(aL.isEmpty());
    }
}
