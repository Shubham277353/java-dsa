package Patterns.TwoPointers;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxLeft = height[l];
        int maxRight = height[r];
        int totalWater = 0;

        while (l < r) {
            if (maxLeft < maxRight) {
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                totalWater += maxLeft - height[l];
            } else {
                r--;
                maxRight = Math.max(maxRight, height[r]);
                totalWater += maxRight - height[r];
            }

        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(nums));
    }
}

