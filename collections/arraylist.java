//Demonstration of array list and all its methods. Array list is a class which extends list interface and it is known for being a resizable array.
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        System.out.println(al1.indexOf(60));
        System.out.println(al1.set(1,70));
        System.out.println(al1.get(1));
        System.out.println(al1.contains(10));
        System.out.print(al1 + "\n");
        for (ListIterator<Integer> it = al1.listIterator(); it.hasNext();){ //We are using Iterator generic interface to iterate over the elements of array list. it.hasNext() this means the loop will run as long as the next element in list is present.
            System.out.println(it.next()); //Iterator only allows forward direction traversal, but list iterator allows bidirectional traversal.
        }
    }
}