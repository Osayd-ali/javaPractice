//Demonstration of heap data structure which can be implemented using Priority Queue class.
package collections;

import java.util.PriorityQueue;

public class minheap {
    public static void main(String[] args){
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(20);
        pq1.add(10);
        pq1.add(30);
        pq1.add(5);
        pq1.add(15);
        pq1.add(3);
        pq1.forEach((x)->System.out.print(x + " "));
        pq1.poll();
        System.out.println("\nAfter removing the head element");
        pq1.forEach((x)->System.out.print(x + " "));
    }
}