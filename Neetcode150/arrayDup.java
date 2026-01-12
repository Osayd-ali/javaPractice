package Neetcode150;

import java.util.HashSet;

// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
public class arrayDup {
    public boolean hasDuplicate(int[] nums) {
        //Brute Force Approach complexity O(n^2) since we have nested loops
        //for(int i=0; i<nums.length; i++){
        //    for(int j = i+1; j<nums.length; j++){
        //        if (nums[j] == nums[i]){
        //        return true;
        //        }
        //    }
        //}
        //return false;
        //Optimal Approach complexity O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // before adding, check if it already exists
            }
            set.add(num); // add the number to the set if it doesn't exist
        }
        return false; // no duplicates found
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        arrayDup obj = new arrayDup();
        System.out.println(obj.hasDuplicate(arr));
    }
}
