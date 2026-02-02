package kunalkushwaha;

// 1295. Find Numbers with Even Number of Digits
// input: nums = [12,345,2,6,7896]
// output: 2
// explanation:
public class Leetcode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        Leetcode1295 obj = new Leetcode1295();
        int result = obj.findNumbers(nums);
        System.out.println("The count of numbers with even digits is: " + result);
    }
    public int findNumbers(int[] nums){
        int numswithEvenDigits = 0;
        for(int i=0; i<nums.length; i++){
            // first get the current number from the array
            // have an empty counter to count digits
            int count = 0;
            int currentNum = nums[i];
            // running while loop as long as currentNum is greater than 0
            while(currentNum > 0){
                // remove the last digit from currentNum and increment the counter
                currentNum = currentNum / 10;
                count++;
            }
            // Once we have the count of digits for this current number, we check it its even and increment our numswithEvenDigits counter
            if(count % 2 == 0){
                numswithEvenDigits++;
            }
        }
        return numswithEvenDigits;
    }
}
