import java.util.Scanner;
/**
 * Created by rubenvarela on 1/5/17.
 */
public class methods {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, choose your operator, would you like to add, subtract, multiply, divide, or modulus?");
        String operator = sc.nextLine();
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        if (operator.equalsIgnoreCase("add")) {
            add(firstNumber, secondNumber);
        } else if (operator.equalsIgnoreCase("subtract")) {
            subtract(firstNumber, secondNumber);
        } else if (operator.equalsIgnoreCase("multiply")) {
            multiply(firstNumber, secondNumber);
        } else if (operator.equalsIgnoreCase("divide")) {
            divide(firstNumber, secondNumber);
        } else if (operator.equalsIgnoreCase("modulus")) {
            modulus(firstNumber, secondNumber);
        } else {
            System.out.println("Oops, your response was not valid.");
        }
    }

    public static void add(int firstNumber, int secondNumber) {
        int answer = firstNumber + secondNumber;
        result(answer);
    }
    public static void subtract(int firstNumber, int secondNumber) {
        int answer = firstNumber - secondNumber;
        result(answer);
    }
    public static void multiply(int firstNumber, int secondNumber) {
        int answer = firstNumber * secondNumber;
        result(answer);
    }
    public static void divide(int firstNumber, int secondNumber) {
        int answer = firstNumber / secondNumber;
        result(answer);
    }
    public static void modulus(int firstNumber, int secondNumber) {
        int answer = firstNumber % secondNumber;
        result(answer);
    }
    public static void result(int result) {
        System.out.println("This is the result: " + result);
    }
}
