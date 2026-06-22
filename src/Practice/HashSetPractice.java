package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static Set<Integer> commonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (!set.add(num)) {
                set1.add(num);
            }
        }
        return set1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 52, 6, 32, 5, 25, 66, 32};
        int[] arr2 = {3, 4, 5432, 64, 66, 43, 32, 3, 34, 25, 42, 32};
        System.out.println(commonElements(arr1, arr2));

    }
}
