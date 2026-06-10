package string;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 1;
        HashSet<Character> set = new HashSet<>();

        if (s.isEmpty()) {
            return 0;
        }


        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            } else {
                set.add(s.charAt(right));
                if (!set.isEmpty()) {
                    max = Math.max(max, right - left + 1);
                }
                right++;
                System.out.println(set);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
