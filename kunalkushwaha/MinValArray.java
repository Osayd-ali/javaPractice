package kunalkushwaha;

public class MinValArray {
    public static void main(String[] args) {
        int[] arr = {10,1,2,3,4,5};
        MinValArray obj = new MinValArray();
        int minValue = obj.minValue(arr);
        System.out.println("Minimum value in the array is: " + minValue);
    }
    public int minValue(int[] arr){
        int min = arr[0]; // assume first element is minimum
        for (int i = 1; i < arr.length; i++){ //Start linear search from index 1
            if(arr[i]<min){ //compare each element with minimum
                min = arr[i]; //update minimum if current element is smaller
            }
        }
        return min; //return minimum value found
    }
}
