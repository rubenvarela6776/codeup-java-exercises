import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/11/17.
 */
public class serverNameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userContinue;
        String[] adjectives = {"Agreeable", "Brave", "Calm", "Delightful", "Eager", "Faithful", "Gentle", "Happy", "Clumsy", "Cruel"};
        String[] nouns = {"Elbow", "Watch", "Eyelash", "Skin", "Toe", "Frown", "Foot", "Lettuce", "Paper", "Floor"};

        System.out.println("--------------------\nWelcome to the Server Name Generator!");

        do {
            setTimeout(1000);
            System.out.println("--------------------\nGenerating random server name...\n--------------------");
            setTimeout(1000);
            randomElementFromArray(adjectives, nouns);
            setTimeout(1000);
            System.out.println("Would you like to generate another name?");
            userContinue = sc.next();
            if(!userContinue.equalsIgnoreCase("yes")) {
                System.out.println("--------------------\nThanks for playing! Have a good day!\n--------------------");
            }
        } while (userContinue.equalsIgnoreCase("yes"));
    }
    public static void randomElementFromArray(String[] adjectives, String[] nouns) {

        String randomAdjective = adjectives[generateRandomNumber()];
        String randomNoun = nouns[generateRandomNumber()];

        System.out.println("Your random server name is: " + randomAdjective + randomNoun + "\n--------------------");
    }
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
    public static void setTimeout(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
