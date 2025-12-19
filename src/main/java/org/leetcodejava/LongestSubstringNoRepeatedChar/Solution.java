package org.leetcodejava.LongestSubstringNoRepeatedChar;

public class Solution {
    String s;
    public Solution(String s){
        this.s = s;
    }
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(0) != s.charAt(1)){
                length++;
                while (i < s.length()){

                }
            }
        }
    }
}
