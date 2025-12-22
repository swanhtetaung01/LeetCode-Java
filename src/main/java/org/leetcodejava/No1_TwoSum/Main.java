package org.leetcodejava.No1_TwoSum;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int[] numbers = new int[sc.nextInt()];
        System.out.println("Enter " + numbers.length + " numbers : ");
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        Solution solution = new Solution(numbers, numbers.length, target);
        int[] result = solution.twoSum(numbers, numbers.length,  target);
        System.out.println("The two numbers are : ");
        System.out.println(result[1] + " " + result[0]);
    }
}