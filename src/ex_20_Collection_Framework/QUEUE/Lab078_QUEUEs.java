package ex_20_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab078_QUEUEs {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Kathir");
        q.add("Anbu");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
