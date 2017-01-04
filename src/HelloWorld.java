import java.util.Scanner;

/**
 * Created by rubenvarela on 1/3/17.
 */
public class HelloWorld {
    public static void main(String[] args) {

        char myChar = '4';
        System.out.println("Here is a char: " + myChar);

        short myShort = 999;
        int myInt = (int) myShort + myChar;
        System.out.println("Here is an int added to a short: " + myInt);

    }
}