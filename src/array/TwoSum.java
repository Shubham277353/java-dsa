package array;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j < nums.length; j++) {
                if (sum != target) {
                    sum = nums[i] + nums[j];
                    System.out.println(sum);
                }
                if (sum == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] index = twoSum(arr, target);
        System.out.println(index[0]);
        System.out.println(index[1]);
    }
}
