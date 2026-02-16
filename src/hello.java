import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.print("Enter your birth month : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String month = input.toLowerCase();

        switch (month){
            case "january":
                System.out.println("You are lucky.");
                break;
            case "february":
                System.out.println("You are cute.");
                break;
            case "march":
                System.out.println("You are angry.");
                break;
            case "april":
                System.out.println("You are charming.");
                break;
            case "may":
                System.out.println("You are prisoner.");
                break;
            case "june":
                System.out.println("You are alien.");
                break;
            case "july":
                System.out.println("You are camel.");
                break;
            case "august":
                System.out.println("You are free.");
                break;
            case "september":
                System.out.println("You are hero.");
                break;
            case "october":
                System.out.println("You are gandhi.");
                break;
            case "november":
                System.out.println("You are modi.");
                break;
            case "december":
                System.out.println("You are santa.");
                break;
        }
    }
}
