import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers : ");
        num = sc.nextInt();

        if(num <= 0 ){
            return;
        }
        if(num == 1){
            System.out.print(0);
            return;
        }
        if(num == 2){
            System.out.print("0 1");
            return;
        }
        // for example lets say user enters 5 , so we would want there
        // to be the Fibonacci series extending upto 5 numbers.

        // Fibonacci basically is 0 1 1 2 3 , each number getting sum with the number on the left.

        // 0 and 1 default
          int   n1 = 1; // current num
          int   n2 = 0; // previous num

        System.out.print("0 1 ");
        for(int i = 0; i < num - 2 ; i++){
            int sum = n1 + n2;
            int temp = n1;
            n1 = sum;
            n2 = temp;
            System.out.print(n1 + " ");
        }
    }
}
