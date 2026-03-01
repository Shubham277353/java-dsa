import  java.util.Scanner;
public class hello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 1234542;
        int reversed = 0;

        while (num != 0 ){
            int digit = num % 10 ;
            reversed = reversed * 10 + digit;
            num = num /10;
        }
        System.out.println( reversed);





        scan.close();
    }
}
