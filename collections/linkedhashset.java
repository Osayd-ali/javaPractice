//Demonstration of linked hash set.
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("B");
        lhs.add("D");
        lhs.add("C");
        lhs.add("E");
        lhs.forEach((x)->System.out.println(x));

    }
}