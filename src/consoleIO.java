import java.util.Scanner;

/**
 * Created by rubenvarela on 1/4/17.
 */
public class consoleIO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInt;
        String userSentence;
        String firstWord;
        String secondWord;
        String thirdWord;
        double length;
        double width;
        double height;
        String userAnswer;

        System.out.print("Input an integer: ");
        userInt= sc.nextInt();
        System.out.println("Here is what you typed: " + userInt);

        // Ensure that the scanner doesn't assign an empty string on next input
        sc.nextLine();

        System.out.print("Input a sentence: ");
        userSentence = sc.nextLine();
        System.out.println("Here is what you typed: " + userSentence);

        System.out.print("Input three words: ");
        firstWord = sc.next();
        secondWord = sc.next();
        thirdWord = sc.next();
        System.out.println("Here is the first word: " + firstWord);
        System.out.println("Here is the second word: " + secondWord);
        System.out.println("Here is the third word: " + thirdWord);

        System.out.println("Now we're going to calculate the perimeter, area, and volume of various classrooms at Codeup based on your input.");

        do {
            System.out.print("Enter the length of the classroom: ");
            length = sc.nextDouble();
            System.out.print("Now, enter the width of the classroom: ");
            width = sc.nextDouble();
            System.out.print("Now, enter the height of the classroom: ");
            height = sc.nextDouble();
            System.out.println("Based on your input here is the perimeter of the classroom: " + 2 * (length + width) + "ft²");
            System.out.println("Based on your input here is the area of the classroom: " + length * width + "ft²");
            System.out.println("Based on your input here is the volume of the classroom: " + (length * width) * height + "ft²");

            System.out.println("Do you wish to continue? Answer Yes or No.");
            userAnswer = sc.next();

            if(userAnswer.equals("Yes")) {
                System.out.println("Thanks, for your answer let's continue!");
            } else if (userAnswer.equals("No")) {
                System.out.println("Thanks and goodbye!");
            } else {
                System.out.println("Oops, your response was not valid. Have a good day!");
            }
        } while (userAnswer.equalsIgnoreCase("Yes"));
    }
}
