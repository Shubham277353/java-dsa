package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static List<Integer> reverseList(int[] list) {
        List<Integer> list1 = new ArrayList<>();

        for (int i = list.length - 1; i >= 0; i--) {
            list1.add(list[i]);
        }
        return list1;
    }

    public static List<Integer> getNewList(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
            if (num % 2 == 0) {
                list.remove(Integer.valueOf(num));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("ArrayList: " + getNewList(nums));
        System.out.println("Reversed ArrayList: " + reverseList(nums));
    }
}
