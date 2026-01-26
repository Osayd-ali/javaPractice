package Neetcode150;

// Given an array of strings, group anagrams together.
// You can return the answer in any order.
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // First we will do a Brute Force Approach O(n * k log k)
        // where n is the number of strings and k is the maximum length of a string in strs
        // We will sort each string and use a hashmap to group anagrams together
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] strChar = str.toCharArray(); // First converting the current string to char array
            Arrays.sort(strChar); // Sorting the char array // O(k log k) for sorting the char array
            String sortedStr = new String(strChar); // Converting back the sorted char array to string
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new java.util.ArrayList<>()); // If the sorted string is not in the map, add it with an empty list
            }
            map.get(sortedStr).add(str); // Add the original string to the list corresponding to the sorted string // Get the value (list of anagrams) for the sorted string key and add the original string to it
        }
        return new ArrayList<>(map.values()); // Return the values of the map as a list of lists
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams obj = new GroupAnagrams();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}
