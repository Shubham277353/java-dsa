
// Leetcode question #217 - Contains Duplicate solved in o(n);
package array;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 56, 1};
        System.out.println(containsDuplicate(arr));
    }
}

