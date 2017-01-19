import java.util.Scanner;
/**
 * Created by rubenvarela on 1/17/17.
 */
public class CircleCalculation {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        System.out.println("Welcome to the circle calculation application!");
        String userContinue;

        do {
            String prompt = "Enter the circle's radius:";
            double radius = validator.getDoubleWithinRange(prompt, 1, Double.MAX_VALUE);
            Circle circle = new Circle(radius);
            System.out.println("This is the area: " + circle.getFormattedArea());
            System.out.println("This is the circumference: " + circle.getFormattedCircumference());
            System.out.println("You've calculated " + circle.getObjectCount + " circle(s).");

            System.out.println("Would you like to calculate another circle's area and circumference?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));

        System.out.println(userContinue);
        System.out.println("Thank you for using the circle calculation application! Have a good day!");
    }
}
