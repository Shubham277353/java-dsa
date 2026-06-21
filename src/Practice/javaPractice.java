package Practice;

public class javaPractice {
    public static void main(String[] args) {
        int[] arr = {110, 20, 30, 43, 23};
        int maxNum = 0;
        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
            if (maxNum <= arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
        System.out.println(sum);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
