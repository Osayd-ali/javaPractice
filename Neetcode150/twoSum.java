package Neetcode150;

import java.util.HashMap;

// Two Sum Problem
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        // Brute Force Approach O(n^2)
//        for (int i = 0; i < nums.length; i++) { // O(n)
//            for (int j = i + 1; j < nums.length; j++) { // O(n) = O(n^2)
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1}; // return -1 if no solution found

        // Optimal Approach O(n) (using HashMap O(1) for lookup and O(n) for traversing the array)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterating through the array and computing if the complement (i.ie., target - current number) exists in the map, if it does not then add the current number to the map
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int difference = target - num;

            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i}; // return indices of the two numbers
            }

            map.put(num, i);
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum obj = new twoSum();
        int[] result = obj.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
