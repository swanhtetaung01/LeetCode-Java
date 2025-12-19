package org.leetcodejava.LongestSubstringNoRepeatedChar;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    String s;
    public Solution(String s){
        this.s = s;
    }
    public Solution(){

    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0; // left pointer
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) { // right pointer
            while (charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
