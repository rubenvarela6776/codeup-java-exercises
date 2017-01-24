package dice;

import java.util.Scanner;
/**
 * Created by rubenvarela on 1/6/17.
 */
public class rollDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sidesOnDice;
        String userContinue;

        do {
            System.out.println("How many sides would you like the dice to have?");
            sidesOnDice = sc.nextInt();
            System.out.println("Rolling two " + sidesOnDice + " sided dice...");
            System.out.println("The first die landed on " + randomNumber(sidesOnDice) + ", the second die landed on " + randomNumber(sidesOnDice));

            System.out.println("Would you like to roll again?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));
    }

    public static int randomNumber(int sidesOnDice) {
        return (int) Math.ceil(Math.random() * sidesOnDice);
    }
}
