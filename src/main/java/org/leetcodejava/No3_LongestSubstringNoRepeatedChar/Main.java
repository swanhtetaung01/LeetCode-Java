package org.leetcodejava.No3_LongestSubstringNoRepeatedChar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s));
    }
}
