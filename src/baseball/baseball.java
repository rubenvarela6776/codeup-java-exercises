package baseball;// Bonus
// At the start of the program, prompt the user for the number of batters to enter, then save the statistics in a two-dimensional array.
// The program won’t have to prompt the user whether to enter data for another batter since it will know how many batters are to be
// entered. After all batters have been entered, print a one line summary for each batter.
//     Batter 1 average: 0.357    slugging percentage: 0.650
//     Batter 2 average: 0.238    slugging percentage: 0.540
// Instead of storing an Array of integers, create a class named AtBat and store instances of this class in the array. This class
// should define an enumeration named Result with members OUT, SINGLE, DOUBLE, TRIPLE, and HOMERUN. The class should have a constructor
// that accepts a Result parameter and a method named basesEarned that returns an int representing the number of bases earned for the at bat.
import validator.Validator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/11/17.
 */
public class baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        String userContinue;

        System.out.println("Welcome to the Batter Statistics Application!");

        do {
            askAmountOfAtBats(sc, validator);
            System.out.println("--------------------\nWould you like to run the application again?");
            userContinue = sc.next();
            if(!userContinue.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Batter Statistics Application! Have a good day!");
            }
        } while(userContinue.equalsIgnoreCase("yes"));
    }
    public static void askAmountOfAtBats(Scanner sc, Validator validator) {
        int min = 1;
        int max = Integer.MAX_VALUE;
        String prompt = "--------------------\nHow many at bats did the batter have?";
        int amountOfAtBats = validator.getIntWithinRange(prompt, min, max);
        int[] atBatArray = new int[amountOfAtBats];
        askAmountOfBasesForEachBat(sc, atBatArray, validator);
    }
    public static void askAmountOfBasesForEachBat(Scanner sc, int[] atBatArray, Validator validator) {
        int min = 0;
        int max = 4;
        for (int i = 0; i < atBatArray.length; i++) {
            String prompt = "--------------------\nOn batting attempt " + (i + 1) + ", how many bases were earned?";
            atBatArray[i] = validator.getIntWithinRange(prompt, min, max);
        }
        displayBattingAverage(atBatArray);
    }
    public static void displayBattingAverage(int[] atBatArray) {
        double numberOfHits = 0;
        for(int i = 0; i < atBatArray.length; i++) {
            if (atBatArray[i] > 0) {
                numberOfHits++;
            }
        }
        double battingAverage = numberOfHits / atBatArray.length;
        System.out.println("--------------------\nYou're batting average (average number of hits at each bat) is: " + round(battingAverage, 3));
        displaySluggingPercentage(atBatArray);
    }
    public static void displaySluggingPercentage(int[] atBatArray) {
        double combinedBases = 0;
        for(int i = 0; i < atBatArray.length; i++) {
            combinedBases += atBatArray[i];
        }
        double sluggingPercentage = combinedBases / atBatArray.length;
        System.out.println("You're slugging percentage (average bases earned at each bat) is: " + round(sluggingPercentage, 3));
    }
    public static double round(double value, int places) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}