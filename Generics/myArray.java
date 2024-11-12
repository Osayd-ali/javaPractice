//Demonstration of generic array of objects. In this example we will also append the array and store the value.
package Generics;

@SuppressWarnings("unchecked")
class genericArray<T>{
    T A[] = (T[]) new Object[10]; //We cannot use generic constructor when defining generic array, we have to use Object (God class constructor) and type cast it into generic.
    int length = 0;
    public void append(T x){
        A[length++]=x;
    }
    public void display(){
        for(int i = 0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}
public class myArray {
    public static void main(String[] args){
        genericArray<String> arofstr = new genericArray<>();
        arofstr.append("String 1");
        arofstr.append("String 2");
        arofstr.append("String 3");
        arofstr.append("String 4");
        arofstr.append("String 5");
        arofstr.display();
    }
}