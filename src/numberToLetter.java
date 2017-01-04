import java.util.Scanner;

/**
 * Created by rubenvarela on 1/4/17.
 */
public class numberToLetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userContinue;
        int grade;
        String message;

        System.out.println("Welcome to the student grading application!");

        do {

            System.out.println("What's is the student's numerical grade?");
            grade = sc.nextInt();

            if (grade >= 88) {
                message = "Student made an A";
            } else if (grade >= 80) {
                message = "Student made a B";
            } else if (grade >= 67) {
                message = "Student made a C";
            } else if (grade >= 60) {
                message = "Student made a D";
            } else {
                message = "Student made a F.";
            }

            System.out.println(message);

            System.out.println("Do you want to grade another student?");
            userContinue = sc.next();

        } while (userContinue.equalsIgnoreCase("Yes"));
    }
}
