    public class ArmstrongNumber {
        public static void main(String[] args) {
            int armNum = 1513;
            int temp = armNum;
            int newNum = 0 ;
            int digitsCounter = 0;
            int sum = 0;

            while(armNum != 0){
                int num = armNum % 10;
                newNum = (newNum + num) * 10;
                armNum = armNum/10;
                digitsCounter++;
            }
            System.out.println(newNum);

            // newNum = 3510;
            while(newNum != 0){
                int num = newNum %10;
                sum = sum + (int) Math.pow(num ,digitsCounter);
                newNum = newNum / 10 ;
            }
            System.out.println(sum);
            if(sum == temp){
                System.out.println("Its an armstrong number.");
            }else{
                System.out.println("It's not an armstrong Number.");
            }
        }
    }
