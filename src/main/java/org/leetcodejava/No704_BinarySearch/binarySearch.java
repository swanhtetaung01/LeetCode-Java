package org.leetcodejava.No704_BinarySearch;

public class binarySearch {
    public int search(int[] nums, int target) {
        if (nums.length < 1 || nums.length > 10000)
            throw new RuntimeException("Length of the array must be > 0 or < 10000");

        if (target > 10000) throw new RuntimeException("Target must be <= 10000");

        int left = 0;
        int right = nums.length;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(target == nums[mid]) return mid;

            if(target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
