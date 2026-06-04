package math;

public class FactorsofaNumber {
    public static void main(String[] args) {
        int n = 36;

        //task : to find the factors of n
        // in this case it would be 14 = 1, 2, 7, 14.
        //factors are numbers which divide the number completely so % will be used.
        // time complexity O(n) as each number is checked once and one loop
        // space complexity O(1) cause variable is only 1 and will remain same no matter the input

//        System.out.println("Factors of " + n + " are:");
//        for(int i = 1 ; i <= n; i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//        }

        // making the program's timecomplexity O(root n) , lets see.

        // first thing to consider how to find square root of the given number ?

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int num = n / i;
                if (num == i) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " " + num + " ");
                }
            }
        }
    }
}
