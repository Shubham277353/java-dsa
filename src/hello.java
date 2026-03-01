import  java.util.Scanner;
public class hello {

    public static void main(String[] args) {
        System.out.println("Enter numbers for an array : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.println(j * 2);
        }
    }
}
