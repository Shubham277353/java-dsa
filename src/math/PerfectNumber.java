package math;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int divisior = 1;

        System.out.print("Divisors: ");
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int n = num / i;
                System.out.print(" " + i + " " + n);
                divisior += i;
            }
        }
        if (divisior == num) {
            System.out.println("\n" + num + " is a perfect number.");
        } else {
            System.out.println("\n" + num + " is not a perfect number.");
        }
    }
}
