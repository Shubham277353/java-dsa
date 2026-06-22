package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapPractice {

    public static Map<Character, Integer> countFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static int firstRepeat(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            } else {
                map.put(num, num);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "ANANDA";
        int[] nums = {2, 7, 3, 5, 2};
//        System.out.println(countFrequency(s));
        System.out.println(firstRepeat(nums));
    }
}


// time complexity of running the loop is O(n).
// space complexity of hashmap and set is  O(n).
