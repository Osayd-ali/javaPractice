package Neetcode150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        // Brute force approach: sort both strings and compare
        //if (s.length() != t.length()) { // if lengths are not equal, they cannot be anagrams
        //    return false;
        //}
        // sorting both strings first by converting to char array
        //char[] sArray = s.toCharArray();
        //char[] tArray = t.toCharArray();
        //Arrays.sort(sArray);
        //Arrays.sort(tArray);
        // comparing sorted char arrays
        //return Arrays.equals(sArray, tArray);

        // Optimal approach: use a hash map to count character frequencies
        // Base condition - if lengths differ, cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        validAnagram obj = new validAnagram();
        System.out.println(obj.isAnagram(s, t));
    }
    // Complexity Analysis: for brute force approach
    // Time Complexity: O(n log n) due to the sorting step, where n is the length of the strings.
    // Space Complexity: O(n) for storing the character arrays. O(2n) typically since we create two arrays, but this simplifies to O(n).

    // Complexity Analysis: for optimal approach
    // Time Complexity: O(n) where n is the length of the strings, as we traverse each string once to build the frequency maps.
    // Space Complexity: O(n) in the worst case, where all characters are unique, and we store them in the hash maps.
}
