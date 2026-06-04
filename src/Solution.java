class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int[] duplicate = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                duplicate[j] = nums[j];
                if (duplicate[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 56, 3, 2, 10, 1};
        System.out.println(containsDuplicate(arr));
    }
}

