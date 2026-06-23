package Patterns.TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[j] + numbers[k] == target) {
                return new int[]{j + 1, k + 1};
            } else if (numbers[j] + numbers[k] >= target) {
                k--;
            } else {
                j++;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }
}
