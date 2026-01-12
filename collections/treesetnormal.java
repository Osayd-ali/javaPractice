//Demonstration of normal tree set.
package collections;

import java.util.List;
import java.util.TreeSet;

public class treesetnormal {
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,20));
        ts.add(25);
        System.out.println(ts);
    }
}