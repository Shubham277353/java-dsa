package math;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Enter numbers one by one to find the largest number (Enter 0 to stop): ");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        int largestNum = i;
        while (i != 0) {
            if (largestNum < i) {
                largestNum = i;
            }
            i = sc.nextInt();
        }
        System.out.println("Largest Number among the given number is " + largestNum);
    }
}
