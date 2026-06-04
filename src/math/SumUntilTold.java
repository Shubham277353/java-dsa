package math;

import java.util.Scanner;

public class SumUntilTold {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        System.out.print("Enter numbers one by one to add them(0 to stop): ");
        Scanner sc = new Scanner(System.in);
        while (i != 0) {
            i = sc.nextInt();
            if (i == 0) {
                break;
            }
            sum += i;
            System.out.println("Sum: " + sum);
        }
        System.out.println("Total sum = " + sum);
    }
}
