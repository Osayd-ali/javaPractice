package kunalkushwaha;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 11, 13, 15 };
        int target = 11;
        int start = 2;
        int end = 5;
        SearchinRange obj = new SearchinRange();
        int result = obj.searchInRange(arr, target, start, end);
        System.out.println(result);
    }
    public int searchInRange(int[] arr, int target, int start, int end){
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
