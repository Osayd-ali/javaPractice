//Basic demonstration of hash Map which uses hash table
package collections;

import java.util.Map;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<>(Map.of(1,"A",2,"B",3,"C"));
        hm.put(4,"D");
        hm.put(5,"E");
        System.out.println(hm.get(3));
        System.out.println(hm);
    }
}