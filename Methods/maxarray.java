package Methods;

public class maxarray {
    static int maxOfArray(int A[]){
        int max = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int A[] = {2,3,6,5,9,7};
        System.out.println("The max element is: " + maxOfArray(A));
    }
}