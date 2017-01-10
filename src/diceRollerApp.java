import java.util.Scanner;
/**
 * Created by rubenvarela on 1/9/17.
 */
public class diceRollerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userContinue;

        System.out.println("Welcome to the dice rolling app!");
        do {
            rollDice(sc);

            System.out.println("Would you like to roll again?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));
    }

    public static void rollDice(Scanner sc) {
        int sidesOnDice;

        System.out.println("How many sides would you like the dice to have? ");
        sidesOnDice = sc.nextInt();

        Die firstDie = new Die(sidesOnDice);
        firstDie.roll();

        Die secondDie = new Die(sidesOnDice);
        secondDie.roll();

        System.out.println("Rolling two " + sidesOnDice + " sided dice...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The first die landed on " + firstDie.currentValue + ", the second die landed on " + secondDie.currentValue);
        System.out.println("The total of both dice are: " + (firstDie.currentValue + secondDie.currentValue));
    }
}
