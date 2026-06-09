package array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
//        int[] answer = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int product = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (j == i) {
//                    continue;
//                }
//                product = product * nums[j];
//            }
//            answer[i] = product;
//        }
//        return answer;

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                left[i] = 1;
                continue;
            }
            leftProduct = left[i - 1] * nums[i - 1];
            left[i] = leftProduct;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                right[i] = 1;
                continue;
            }
            rightProduct = right[i + 1] * nums[i + 1];
            right[i] = rightProduct;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return answer;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = productExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }
}
