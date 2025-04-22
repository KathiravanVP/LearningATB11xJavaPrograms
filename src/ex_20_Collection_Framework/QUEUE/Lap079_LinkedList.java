package ex_20_Collection_Framework.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lap079_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(6);
        q.add(9);
        q.add(8);
        q.add(7);
        Iterator<Integer> iterator = q.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
