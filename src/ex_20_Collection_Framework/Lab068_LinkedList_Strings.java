package ex_20_Collection_Framework;

import java.util.LinkedList;

public class Lab068_LinkedList_Strings {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Goat");
        System.out.println(animals);

        System.out.println("First element: "+animals.getFirst());
        System.out.println("Last element: "+animals.getLast());

        animals.removeFirst();
        animals.removeLast();

        System.out.println("After removal: "+animals);
        System.out.println("Size: "+animals.size());
    }
}
