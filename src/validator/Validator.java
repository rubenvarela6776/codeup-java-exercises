package validator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/10/17.
 */
public class Validator {
    Scanner sc = new Scanner(System.in);

    String stringInput;

//    public Validator(Scanner sc) {
//        this.sc
//    }
    public int getInt(String prompt) {
        int intInput;
        try {
            System.out.println(prompt);
            intInput = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error! Input must be an integer.");
            sc.nextLine();
            return getInt(prompt);
        }
        return intInput;
    }
    public int getIntWithinRange(String prompt, int min, int max) {
        int intInput = getInt(prompt);
        try {
            if (intInput < min || intInput > max) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            if (intInput < min) {
                System.out.println("Error! Number must be greater than " + min + ".");
            } else if (intInput > max) {
                System.out.println("Error! Number must be less than " + max + ".");
            }
            return getIntWithinRange(prompt, min, max);
        }
        return intInput;
    }
    public double getDouble(String prompt) {
        double doubleInput = 0;
        try {
            System.out.println(prompt);
            doubleInput = sc.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Error! Input must be a number.\n");
            sc.nextLine();
            return getDouble(prompt);
        }
        return doubleInput;
    }
    public double getDoubleWithinRange(String prompt, double min, double max) {
        double doubleInput = getDouble(prompt);
        try {
            if (doubleInput < min || doubleInput > max) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            if (doubleInput < min) {
                System.out.println("Error! Number must be greater than " + min + ".\n");
            } else if (doubleInput > max) {
                System.out.println("Error! Number must be less than " + max + ".\n");
            }
            return getDoubleWithinRange(prompt, min, max);
        }
        return doubleInput;
    }
    public String getRequiredString(String prompt) {
        System.out.println(prompt);
        sc.next();
        return sc.nextLine();
    }
    public void setTimeout(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //method for validator that validates your String input
    public String getAndValidateString(String[] array, String prompt1, String prompt2) {
        System.out.println(prompt1); //prompt that asks for user input
        String userInput = sc.next(); //you can also use an existing getString() method in place of

        boolean validInput = false;

        do {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equalsIgnoreCase(userInput)) {
                    validInput = true;
                    return userInput; //break out of the do while
                }
            }

            //this piece of code will only run if input is invalid
            if (validInput == false) {
                System.out.println(prompt2); //invalid input prompt
                userInput = sc.next();
            }

        } while (!validInput);

        System.out.println(array);
        return userInput;
    }

}
