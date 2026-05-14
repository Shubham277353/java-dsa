public class LcmOfTwoNumbers {

    public static void main(String[] args) {

        int x = 15;
        int y = 24;
        int i = 1;
        int m = 0;
        int n = 0;

        while (true) {
            m = y * i;
            if (m % x == 0) {
            System.out.println(m);
                System.out.println( m + " is the LCM of the given numbers.");
                break;
            }
            i++;
        }


    }
}
