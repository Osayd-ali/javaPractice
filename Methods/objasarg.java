//Passing array(i.e object) as an argument to a method, writing a method to change one value from an array.
package Methods;

public class objasarg {
    static void change(int A[],int index, int value){
        A[index] = value;
    }

    public static void main(String args[]){
        int A[] = {2,4,6,8,10};
        for (int x:A){
            System.out.print(x+", ");
        }
        System.out.println("");
        change(A, 2, 18);
        for (int x:A){
            System.out.print(x+", ");
        }
        System.out.println("");
    }
}