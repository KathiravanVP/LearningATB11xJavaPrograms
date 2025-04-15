package ex_20_Collection_Framework.SET;

import java.util.HashSet;
import java.util.*;

public class Lab074_Sets {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
    }
}
