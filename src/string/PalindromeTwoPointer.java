package string;

public class PalindromeTwoPointer {
    public static void main(String[] args) {
        String str = "racercar";

        // we wanna check if this is palindrome or not without creating a seperate reverseString.
        int i = 0;
        int j = str.length() - 1;
        boolean palindrome = true;

        for (int a = 0; a < str.length(); a++) {
            char x = Character.toLowerCase(str.charAt(i));
            char y = Character.toLowerCase(str.charAt(j));
            if (x != y) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (palindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}
