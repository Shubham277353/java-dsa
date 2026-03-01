import  java.util.Scanner;
public class hello {

    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println("Enter five numbers u wanna add : ");
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i <5;i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for ( int j : arr){
            sum += j ;
        }
        System.out.println("Sum of the array = " + sum);

        int max = arr[0];

        for ( int k : arr){
            if( k > max){
                max = k;
            }
        }
        System.out.println("Largest number in the array is " + max);

        scan.close();
    }
}
