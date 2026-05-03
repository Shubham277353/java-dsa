public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 21,30,99, 4,3,22};

        if( arr.length == 0 ){
            System.out.println("Array is empty.");
            return;
        }

        int maxNum = arr[0] ;


        for(int i = 1 ; i < arr.length; i++){
            if(maxNum < arr[i]){
                maxNum = arr[i];
            }
        }

        System.out.println("Maximum Number is " +  maxNum);
    }
}
