package Practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static Character nonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char ch = 0;

        String str1 = str.toLowerCase();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str1.toCharArray()) {
            if (map.get(c) == 1) {
                ch = c;
                break;
            }
        }
        System.out.println(map);
        return ch;
    }


    public static void main(String[] args) {
        String str = "Hello my name is Shubham";
        System.out.println(nonRepeating(str));
    }
}
