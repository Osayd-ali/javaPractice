package collections;

import java.util.*;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50,60,70,80,90));
        ll1.add(10);
        ll1.add(0,5);
        ll1.addAll(1,ll2);
        System.out.println(ll1.indexOf(60));
        System.out.println(ll1.set(1,70));
        System.out.println(ll1.get(1));
        System.out.println(ll1.contains(10));
        ll1.addFirst(100);
        ll1.addLast(200);
        System.out.println(ll1.peekLast());
        System.out.print(ll1 + "\n");
        for (ListIterator<Integer> it = ll1.listIterator(); it.hasNext();){ //We are using Iterator generic interface to iterate over the elements of array list. it.hasNext() this means the loop will run as long as the next element in list is present.
            System.out.println(it.next()); //Iterator only allows forward direction traversal, but list iterator allows bidirectional traversal.
        }
    }
}