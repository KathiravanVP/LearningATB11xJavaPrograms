package ex_20_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab070_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Beetroot");
        vegetables.add("Onion");
        System.out.println(vegetables);

        List<String> snacks = new ArrayList<>();
        snacks.add("Chips");
        snacks.add("Puffs");
        snacks.add("Biscuits");
        System.out.println(snacks);

        List eatables = new ArrayList();
        eatables.add(fruits);
        eatables.add(vegetables);
        eatables.add(snacks);
        System.out.println(eatables);

    }
}
