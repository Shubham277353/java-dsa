
// Leetcode question #217 - Contains Duplicate solved in o(n);
package array;

import java.util.HashSet;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 56, 3};
        System.out.println(containsDuplicate(arr));
    }
}

