//Demonstration of linked hash map which uses double linked list in its hash table.
package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lm = new LinkedHashMap<>(5,0.75f,true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) { // we have to override this method if we want to enforce the limit in our hashtable and if we add elements over the limit then eldest element will be removed respecting the limit.
                return size() > 5;
            }
        };
        lm.put(1,"A");
        lm.put(2,"B");
        lm.put(3,"C"); // least recent access
        lm.put(4,"D");
        lm.put(5,"E");
        String s = lm.get(2);
        s=lm.get(5);
        s=lm.get(1); //Most recent access
        //lm.put(6,"F");
        lm.forEach((k,v)->System.out.println(k+" "+v));
    }
}