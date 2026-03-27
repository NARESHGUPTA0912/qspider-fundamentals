package CollectionFramework;

import java.util.PriorityQueue;

public class Program5 {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(60);
        pq.add(20);
        pq.add(90);
        pq.add(22);
        pq.add(61);
        pq.add(37);
        System.out.println(pq);
        System.out.println();
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }
}
