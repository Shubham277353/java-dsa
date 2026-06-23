package Patterns.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int j = 0;
        int k = height.length - 1;

        while (j < k) {
            int num1 = height[j];
            int num2 = height[k];

            int area = Math.min(num1, num2) * (k - j);
            max = Math.max(max, area);

            if (num1 < num2) {
                j++;
            } else {
                k--;
            }
        }
        return max;
    }
}
