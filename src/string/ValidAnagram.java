package string;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
//        Set<Character> set = new HashSet<>();
//
//        for (char c : s.toCharArray()) {
//            set.add(c);
//        }
//        for (char c : t.toCharArray()) {
//            if (!set.contains(c)) {
//                return false;
//            }
//        }
//
//        return true;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (!Objects.equals(map.get(c), map2.get(c))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
