//Demonstration of max heap which is implemented by priority queue.
//We can change the priority of insertion from min value which is generally considered to be high priority, but we will make larger numbers have higher priority using comparator.
package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComptr implements Comparator<Integer>{
    public int compare(Integer o1, Integer o2){
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class maxheap {
    public static void main(String[] args){
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyComptr());
        pq2.add(20);
        pq2.add(10);
        pq2.add(30);
        pq2.add(5);
        pq2.add(15);
        pq2.add(3);
        pq2.forEach((x)->System.out.print(x + " "));
        pq2.poll();
        System.out.println("\nAfter removing the head element");
        pq2.forEach((x)->System.out.print(x + " "));
    }
}