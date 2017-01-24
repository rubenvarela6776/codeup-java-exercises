package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/9/17.
 */
public class exceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Welcome to the student finder app!");
        firstName(sc, student);
        lastName(sc, student);
        age(sc, student);

        System.out.println("The student's name is: " + student.getFirstName() + " " + student.getLastName());
        System.out.println(student.getFirstName() + " is " + student.getAge() + " years old.");
    }

    public static void firstName(Scanner sc, Student student) {
        try {
            System.out.println("What's the first name of the student you're looking for?");
            student.setFirstName(sc.nextLine());
        } catch (Exception e) {
            sc.next();
            System.out.println("Sorry, not a valid input.");
            firstName(sc, student);
        }
    }
    public static void lastName(Scanner sc, Student student) {
        try {
            System.out.println("What's the student's last name?");
            student.setLastName(sc.nextLine());
        } catch (Exception e) {
            sc.next();
            System.out.println("Sorry, not a valid input.");
            lastName(sc, student);
        }
    }
    public static void age(Scanner sc, Student student) {
        try {
            System.out.println("What's the student's age?");
            student.setAge(sc.nextInt());
        } catch (Exception e) {
            sc.next();
            System.out.println("Sorry, not a valid input.");
            age(sc, student);
        }
    }
}