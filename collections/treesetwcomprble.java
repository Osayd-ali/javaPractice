//Demonstration of a tree set with implementation of comparable interface where we compare and define which of our object is greater.
package collections;

import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(this.x<p.x)
            return -1;
        else if (this.x>p.x) {
            return 1;
        }
        else
            if (this.y<p.y)
                return -1;
            else if (this.y>p.y) {
                return 1;
            }
            else return 0;
    }

    public String toString(){
        return "x=" + x +" y=" +y;
    }
}

public class treesetwcomprble {
    public static void main(String[] args){
        TreeSet<Point> pp = new TreeSet<Point>();
        pp.add(new Point(1,1));
        pp.add(new Point(5,5));
        pp.add(new Point(5,2));
        System.out.println(pp);
    }
}