package math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int armNum = 153;
        int temp = armNum;
        int newNum = armNum;
        int digitsCounter = 0;
        int sum = 0;

        while (armNum != 0) {
            armNum = armNum / 10;
            digitsCounter++;
        }

        while (temp != 0) {
            int num = temp % 10;
            sum = sum + (int) Math.pow(num, digitsCounter);
            temp = temp / 10;
        }
        System.out.println(sum);
        if (sum == newNum) {
            System.out.println("Its an armstrong number.");
        } else {
            System.out.println("Its not an armstrong number.");

        }
    }
}
