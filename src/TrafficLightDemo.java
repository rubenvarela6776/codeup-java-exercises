import java.util.Scanner;
/**
 * Created by rubenvarela on 1/12/17.
 */
public class TrafficLightDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        String userContinue;

        do {
            getTrafficLightColor(validator);
            System.out.println("Would you like to run the application again?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));
    }



    public static void getTrafficLightColor(Validator validator) {
        try {
            String prompt = "In terms of a stoplight, what color would you like to know the meaning of?";
            String userInput = validator.getRequiredString(prompt);
            TrafficLightColor color = TrafficLightColor.valueOf(userInput.toUpperCase());
            makeDrivingDecision(color);
        } catch (IllegalArgumentException e) {
            System.out.println("The color you typed is not a valid traffic light color. Try Again.");
            getTrafficLightColor(validator);
        }
    }


    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case GREEN:
                System.out.println("Green means go.");
                break;
            case YELLOW:
                System.out.println("Yellow means to slow down.");
                break;
            case RED:
                System.out.println("Red means to stop.");
                break;
        }
    }
}
