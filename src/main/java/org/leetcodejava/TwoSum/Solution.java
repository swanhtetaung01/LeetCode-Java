package org.leetcodejava.TwoSum;

public class Solution {
    int[] numbers;
    int length;
    int target;

    public Solution(int[] numbers, int length, int target){
        this.numbers = numbers;
        this.length = length;
        this.target = target;
    }
    public int[] twoSum(int[] numbers, int length, int target){
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            if(i != 0) {
                if(numbers[i] + numbers[i-1] == target){
                    result[0] = i;
                    result[1] = i - 1;
                }
            }
        }
        return result;

    }
}
