package Patterns.TwoPointers;

import java.util.HashSet;

public class RemoveDuplicatedOfSortedArray {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = l + 1;
        int count = 0;

        while (r != nums.length - 1) {
            if (nums[l] != nums[r]) {
                nums[l + 1] = nums[r];
                l++;
                count++;
            } else {
                r++;
            }
        }
        return count;
    }
}
