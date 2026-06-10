package string;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 1;
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.isEmpty()) {
            return 0;
        }

        for (right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "aab";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
