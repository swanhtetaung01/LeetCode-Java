package org.leetcodejava.No9_PalindromeNumber;

import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();
        if (isPalindrome(x)) {
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + digit;
        }
        if(reverse == original) {
            return true;
        }
        else {
            return false;
        }
    }
}
