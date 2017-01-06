import java.util.Scanner;
/**
 * Created by rubenvarela on 1/5/17.
 */
public class factorial {
    public static void main(String[] args) {
        long factorial = 1;
        int userInput;
        String userContinue;
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome, I will show you the factorial of a number. ");

        do {
            factorial = 1;
            System.out.print("Enter a number between 1 and 10: ");
            userInput = sc.nextInt();
            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
            System.out.println("Your answer is: " + factorial);

            System.out.println("Do you wish to continue?");
            sc.nextLine();
            userContinue = sc.nextLine();

        } while (userContinue.equalsIgnoreCase("yes"));
    }
}
