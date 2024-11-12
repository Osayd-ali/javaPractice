//Demonstration of generics where we don't specify any particular data type, it will take any type of data and accept it.
package Generics;

@SuppressWarnings("unchecked")
class genericArray2<T>{
    T A2[] = (T[]) new Object[10]; //We cannot use generic constructor when defining generic array, we have to use Object (God class constructor) and type cast it into generic.
    int length2 = 0;
    public void append2(T y){
        A2[length2++]=y;
    }
    public void display2(){
        for(int i = 0; i<length2; i++){
            System.out.println(A2[i]);
        }
    }
}
public class myarray2 {
    public static void main(String[] args){
        genericArray2 arofstr2 = new genericArray2();
        arofstr2.append2("String 1");
        arofstr2.append2(2);
        arofstr2.append2(2.2);
        arofstr2.append2(true);
        arofstr2.append2(33.33333);
        arofstr2.display2();
    }
}
