import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/17/17.
 */
public class TestObjectOrientationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Validator validator = new Validator();
        TestObjectOrientation student;
        List<TestObjectOrientation> studentList = new ArrayList();

        String firstName;
        String lastName;
        int testScore;
        String userContinues;

        do {
            firstName = validator.getRequiredString("Enter Student's first name:");
            lastName = validator.getRequiredString("Enter Student's last name:");
            testScore = validator.getIntWithinRange("Enter Student's test score:", 0, 100);

            student = new TestObjectOrientation(firstName, lastName, testScore);
            studentList.add(student);

            System.out.println("Do you want to add another student? Yes/No");
            userContinues = scan.nextLine();

        } while (userContinues.equalsIgnoreCase("Yes") || userContinues.equalsIgnoreCase("y"));

        System.out.println("=============== Student List ==============");
        System.out.println("Last Name       First Name       Score     ");
        System.out.println("===========================================");

        for (int i = 0; i <studentList.size(); i++) {
            System.out.printf("%-14s %-15s %-21s \n",
                    studentList.get(i).getLastName(),
                    studentList.get(i).getFirstName(),
                    studentList.get(i).getTestScore());
        }

        System.out.println("App ends");

    }
}
