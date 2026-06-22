package Patterns.TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
//        StringBuilder sb = new StringBuilder();
//
//        for (char ch : s.toCharArray()) {
//            if (!Character.isLetter(ch)) {
//                continue;
//            }
//            sb.append(ch);
//        }
//        String s2 = sb.toString();
//        System.out.println(s2);
        String s2 = s.toLowerCase();
        int j = 0;
        int k = s.length() - 1;

        while (j <= k) {
            if (!Character.isLetterOrDigit(s2.charAt(j))) {
                j++;
                continue;
            } else if (!Character.isLetterOrDigit(s2.charAt(k))) {
                k--;
                continue;
            }

            if (Character.toLowerCase(s2.charAt(j)) != Character.toLowerCase(s2.charAt(k))) {
                return false;
            } else {
                j++;
                k--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
