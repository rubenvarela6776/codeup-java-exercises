import java.util.Scanner;

/**
 * Created by rubenvarela on 1/4/17.
 */
public class powers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInput;
        int number = 1;
        int squared;
        int cubed;
        String userContinue;

        System.out.println("Let's make a table that gives us a number, the number squared, and then the number cubed.");

        do {

            System.out.print("Please enter an integer at which you would like the table to stop: ");
            userInput = sc.nextInt();

            System.out.println("   Number   |   Squared   |   Cubed");
            System.out.println("------------------------------------");

            do {
                squared = number * number;
                cubed = number * number * number;
                System.out.println("     " + number + "      |      " + squared + "      |      " + cubed);
                number++;
            } while (number <= userInput);

            number = 1;

            System.out.print("Do you wish to continue? Answer with a Yes or No: ");
            sc.nextLine();
            userContinue = sc.nextLine();

            if (userContinue.equals("Yes")) {
                System.out.println("Thank you, let's play again.");
            } else if (userContinue.equals("No")) {
                System.out.println("Thank you for playing have a good day!");
            } else {
                System.out.println("Oops, your response was not valid. Have a good day.");
            }

        } while (userContinue.equalsIgnoreCase("Yes"));
    }
}
