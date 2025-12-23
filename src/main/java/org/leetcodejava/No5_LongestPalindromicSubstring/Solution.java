package org.leetcodejava.No5_LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++){
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
        }

        return;
    }
        //racecar
    public int expandFromMiddle(String s, int left, int right){
        if (s == null || left > right) return 0;

        while (left >= 0 || right < s.length() || s.charAt(right) == s.charAt(left)) {
            left--;
            right++;
        }

        return  right - left + 1;
    }
}
