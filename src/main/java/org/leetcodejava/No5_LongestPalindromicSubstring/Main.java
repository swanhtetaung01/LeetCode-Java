package org.leetcodejava.No5_LongestPalindromicSubstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        Solution sol = new Solution();
        String output = sol.longestPalindrome(s);
        System.out.println(output);
    }

}
