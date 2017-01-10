import java.util.Scanner;
/**
 * Created by rubenvarela on 1/6/17.
 */
public class sumUpThoseDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String userInput;
        System.out.println("Welcome, this application will take in a number and add the digits individually.");
        System.out.print("Input a number: ");
        userInput = sc.next();
        sumUpDigits(userInput);
//        System.out.println("Here is the result of of adding your number's digits individually: " + sumUpDigits(userInput));
    }

    public static void sumUpDigits(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));


        }
    }
}
