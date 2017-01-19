import java.util.*; // uses all util's
/**
 * Created by rubenvarela on 1/17/17.
 */
public class Maps_StudentInfoApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator();
        List<Map> studentList = new ArrayList();

        System.out.println("Welcome to the Student Info App");

        String anotherStudentToEnter;
        do {
            studentList.add(newStudent(validator));
            System.out.println("Do you want to enter a new student? Yes/No");
            anotherStudentToEnter = scan.nextLine();
        } while (anotherStudentToEnter.equalsIgnoreCase("yes") || anotherStudentToEnter.equalsIgnoreCase("y"));
        System.out.println("Goodbye");
        System.out.println(studentList);
        System.out.println("The last name of the first person you entered is " + studentList.get(0).get("lastName"));
        System.out.println("Number of students entered is " + studentList.size());
        int totalScores = 0;
        for (int i = 0; i < studentList.size(); i++) {
            totalScores += (int) studentList.get(i).get("studentScore");
            System.out.println(totalScores);
        }
        double averageTotalScore = totalScores / studentList.size();
        System.out.println("The average test score of the class is: " + averageTotalScore);

    }

    public static Map newStudent(Validator validator) {
        Map student = new HashMap();
        // key name , value.fromuserinput
        student.put("firstName", validator.getRequiredString("What is the students first name?"));
        student.put("lastName", validator.getRequiredString("What is the students last name?"));
        student.put("studentScore", validator.getInt("What is the students test score?"));
        return student;
    }
}
