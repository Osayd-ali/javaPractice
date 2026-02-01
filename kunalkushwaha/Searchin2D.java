package kunalkushwaha;

// Searching minimum value in 2D array
public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {5, 15, 25},
            {0, -5, 35}
        };
        Searchin2D obj = new Searchin2D();
        int minValue = obj.searchin2D(arr);
        System.out.println("Minimum value in the 2D array is: " + minValue);
    }
    public int searchin2D(int[][] arr){
        int min = arr[0][0]; //assuming the first element of the first row is minimum
        // Running a for loop to traverse each row
        for(int i=0; i<arr.length; i++){
            // Running a for loop to access each value of the current row
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){ //If the current element of the current row is less than minimum
                    min = arr[i][j]; //Update minimum
                }
            }
        }
        return min; //return minimum value found
    }
}
