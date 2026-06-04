package string;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        StringBuilder revStr = new StringBuilder();

        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String newStr = str.toLowerCase();

        for (int i = (newStr.length()) - 1; i >= 0; i--) {
            char c = newStr.charAt(i);
            revStr.append(c);
        }

        String result = revStr.toString();

        if (newStr.equals(result)) {
            System.out.println("String " + str + " is a palindrome.");
        } else {
            System.out.println("String " + str + " is not a palindrome.");
        }
    }
}
