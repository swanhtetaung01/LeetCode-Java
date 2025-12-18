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
            for (int j = 0; j < length; j++) {
                if (i != j ){
                    if (numbers[i] + numbers[j] == target) {
                        result[0] = j;
                        result[1] = i;
                    }
                }
            }
        }
        return result;
    }
}
