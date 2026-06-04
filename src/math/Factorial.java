package math;

public class Factorial {
    public static void main(String[] args) {
        // task : to find factorial of a given number
        // factorial = 5! => 5 * 4 * 3 * 2 * 1

        int n = 20;
        long product = 1;

        for (int i = n; i > 0; i--) {
            product *= i;
        }
        System.out.println("Fact of " + n + " is " + product);
    }

}
