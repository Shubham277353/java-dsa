package string;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = map.getOrDefault(c, 0);
            map.put(c, (num + 1));
        }
        for (int j = 0; j < t.length(); j++) {
            char c2 = t.charAt(j);
            int num2 = map.getOrDefault(c2, 0);
            if (map.containsKey(c2)) {
                map.put(c2, num2 - 1);
            }
            if (map.getOrDefault(c2, 0) == 0) {
                map.remove(c2);
            }
        }
        if (map.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
