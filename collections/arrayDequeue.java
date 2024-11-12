package collections;

import java.util.ArrayDeque;

public class arrayDequeue {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10); //similar to addLast method but addLast throws exception if nothing to add, but offer last returns null.
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.pollFirst();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.forEach((x)->System.out.println(x));
    }
}