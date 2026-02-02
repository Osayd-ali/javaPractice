package kunalkushwaha;

// 1672. Richest Customer Wealth
// Given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank, return the wealth that the richest customer has.
public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,5},
            {4,5,6}
        };
        Leetcode1672 obj = new Leetcode1672();
        int richestWealth = obj.search(accounts);
        System.out.println("The richest customer's wealth is: " + richestWealth);
    }
    public int search(int[][] arr){
        int richest = Integer.MIN_VALUE; // Assigning our richest tracker variable to the smallest possible integer value
        // We start accessing each row(customer) of the 2D array(accounts)
        for(int i=0; i<arr.length; i++){
            int sum = 0; // A tracker variable to store the total wealth from different banks for the current customer
            // We access each bank value of the current customer
            for(int j=0; j<arr[i].length; j++){
                sum = sum + arr[i][j]; // Adding each bank value to the sum tracker variable
            }
            if(sum>richest){
                richest = sum; // Updating the richest if current customer's wealth is greater than the richest tracked so far
            }
        }
        return richest; // Returning the richest wealth found
    }
}
