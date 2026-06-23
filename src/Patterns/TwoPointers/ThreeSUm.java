package Patterns.TwoPointers;

import java.util.*;

public class ThreeSUm {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //sorted array = [-4,-1,-1,0,1,2]
        // we have to find three elements whose sum is equal to 0

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int threeSome = nums[i] + nums[j] + nums[k];

                if (threeSome > 0) {
                    k--;
                } else if (threeSome < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(threeSum(num)));
    }
}
