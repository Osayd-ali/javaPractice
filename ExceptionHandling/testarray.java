package ExceptionHandling;

public class testarray {
    public static void main(String[] args){
        int num = 1;
        int[] a = new int[5];
        for(int i=0; i<a.length; i++){
            a[i] = num++;
        }
        for(int x:a){
            System.out.print(x + " ");
        }
    }
}