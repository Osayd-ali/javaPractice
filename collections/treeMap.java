//Demonstration of a basic tree map. It stores key value pairs and is implemented using red black trees.
package collections;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C"));
        tm.put(4,"D");
        tm.put(5,"E");
        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm.get(3));
        Map.Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());
        System.out.println(tm);
    }
}