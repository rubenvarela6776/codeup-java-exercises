import java.util.Random;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/10/17.
 */
public class highLow {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        String userContinue;

        System.out.println("Welcome to the random number generator!!! You will attempt to guess the random number!!!");

        int min = 1;
        int max = 100;
        int counter = 0;
        int randomNumber = 0;

        do {
            randomNumber = generateRandomNumber(max);
            askForGuess(validator, min, max, randomNumber, counter);
            System.out.println("Would you like to play again?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));
    }

    public static void askForGuess(Validator validator, int min, int max, int randomNumber, int counter) {
        counter++;

        String prompt = "-----\nEnter a number between 1 and 100: ";
        int userGuess = validator.getIntWithinRange(prompt, min, max);

        if(userGuess == randomNumber) {
            System.out.println("-----\nYay!!! You guessed the number champ!!!");
            System.out.println("It took you " + counter + " guesses.\n-----");
        } else if(userGuess < randomNumber) {
            System.out.println("Keep guessing HIGHER...");
            askForGuess(validator, min, max, randomNumber, counter);
        } else if(userGuess > randomNumber) {
            System.out.println("Keep guessing LOWER...");
            askForGuess(validator, min, max, randomNumber, counter);
        }
    }

    public static int generateRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }
}