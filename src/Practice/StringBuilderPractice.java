package Practice;

public class StringBuilderPractice {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hello world to all";
        System.out.println(reverseString(s));
        System.out.println(removeSpaces(s));
    }
}
