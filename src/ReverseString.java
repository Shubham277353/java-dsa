public class ReverseString {
    public static void main(String[] args) {
        // task : to reverse a string.
        String str = "Hello";
        StringBuilder revStr = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ;i--){
            char c = str.charAt(i);
            revStr.append(c);
        }

        System.out.println("Your reversed string is " + revStr);
    }
}
