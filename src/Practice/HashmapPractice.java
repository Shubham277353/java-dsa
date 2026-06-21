package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {

    public static Map<Character, Integer> countFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        String s = "ANANDA";
        System.out.println(countFrequency(s));
    }
}


// time complexity of running the loop is O(n).
// space complexity is also O(n).
