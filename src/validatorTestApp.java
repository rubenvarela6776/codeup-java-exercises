import java.util.Scanner;
/**
 * Created by rubenvarela on 1/10/17.
// */
public class validatorTestApp {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Validation Tester application \n");
        String userContinue;

        do {
            runApp(validator, sc);
            System.out.println("\nGood job!!! Would you like to continue?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));
        System.out.println("\nThank you for playing!!! Goodbye!!!");
    }

    public static void runApp(Validator validator, Scanner sc) {

        int intMin = 10;
        int intMax = 100;

        System.out.println("INT TEST");
        String intPrompt = "Enter a number between " + intMin + " and " + intMax + ": ";
        validator.getIntWithinRange(intPrompt, intMin, intMax);

        double doubleMin = 10;
        double doubleMax = 100;

        System.out.println("\nDOUBLE TEST");
        String doublePrompt = "Enter a number between " + doubleMin + " and " + doubleMax + ": ";
        validator.getDoubleWithinRange(doublePrompt, doubleMin, doubleMax);
    }
}
