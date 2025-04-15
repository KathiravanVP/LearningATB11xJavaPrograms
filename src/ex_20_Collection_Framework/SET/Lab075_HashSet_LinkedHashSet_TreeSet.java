package ex_20_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab075_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("Banana");
        hs.add(null);
        System.out.println(hs);
        for (Object o: hs)
            System.out.println(o);
        System.out.println("---------------------------");

        Set<String> lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Carrot");
        lhs.add("Tomato");
        lhs.add("Onion");
        lhs.add("Carrot");
        lhs.add(null);
        lhs.add(null);
        lhs.add("Potato");
        System.out.println(lhs);
        for (String s : lhs)
            System.out.println(s);
        System.out.println("---------------------------");

        Set<String> ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.
        ts.add("Munch");
        ts.add("KitKat");
        ts.add("Dairy Milk");
        ts.add("KitKat");
        System.out.println(ts);
        for (String s : ts)
            System.out.println(s);
    }
}
