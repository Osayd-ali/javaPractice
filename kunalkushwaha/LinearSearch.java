package kunalkushwaha;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10, 23, 45, 70, 11, 15, 78};
        int target = 15;
        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(arr, target);
        System.out.println(result);
    }

    public int linearSearch(int[] arr, int target){
        // find the target in the array, return index if found else return -1
        // Linear search always starts from beginning of the array, we keep traversing the array n times until we find the target
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){ //if the value at current index is equal to target
                return i; //return the index
            }
        }
        return -1; //target not found
    }
}
