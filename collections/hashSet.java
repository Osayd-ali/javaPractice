//Demonstration of hashset which uses hash table for its implementation.
package collections;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>(20,0.75f);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(20);
        System.out.println(hs);
    }
}