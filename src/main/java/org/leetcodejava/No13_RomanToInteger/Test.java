package org.leetcodejava.No13_RomanToInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        roman2integer test = new roman2integer();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int output = test.romanToInt(s);

        System.out.println("output: " + output);
    }
}
