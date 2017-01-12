/**
 * Created by rubenvarela on 1/12/17.
 */
public class fibonacciNumberGenerator {
    public static void main(String[] args) {
        Validator validator = new Validator();
        System.out.println("-------------------------------------------\nWelcome to the fibonacci number generator!\n-------------------------------------------");
        validator.setTimeout(1000);
        String prompt = "To what number would you like the sequence to go up to?";
        int goUpTo = validator.getIntWithinRange(prompt, 1, Integer.MAX_VALUE);
        validator.setTimeout(1000);

        System.out.println("--------------------");

        int x = 0, y = 1;

        System.out.println(x);
        for(int i = 0; i <= Integer.MAX_VALUE; i++) {

            System.out.println(y);

            x = x + y;
            y = x + y;

            System.out.println(x);
            if (y >= goUpTo) {
                System.out.println("It takes " + i + " sequence iterations to get to " + goUpTo + ".");
                return;
            }
        }

//        int n1 = 0, n2 = 1, n3, count = 17;
//
//        System.out.println(n1 + "\n" + n2);//printing 0 and 1
//
//        for(int i = 2; i < count; i++) {    //loop starts from 2 because 0 and 1 are already printed
//            n3 = n1 + n2;
//            System.out.println(n3);
//            n1=n2;
//            n2=n3;
//        }
    }
}
