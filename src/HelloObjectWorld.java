import java.util.Scanner;
/**
 * Created by rubenvarela on 1/6/17.
 */

//Intro to Object Orientation
//        1. Let's create an object-oriented "Hello World!"
//        Create a new java class called Person
//        Person should have firstName, lastName, email properties
//        make a new HelloObjectWorld class
//        w/ the main method that
//        - prompts the user for firstName, lastName, and email
//        - creates a new Person object
//        - Then says hello, like "Hello Justin Reich, we have your email as justin@codeup.com"
//        2. In the same HelloObjectWorld main()
//        - Prompt for 2 more people
//        - Put in two favorite or famous people!
//        - say "Hello" to each of them
//        3.  What happens if you make 2-3 People objects with the same firstName, lastName, and email?
//        - Will Java allow this?
//        - are they the same?
//        - how do we know if they're the same object?
//        4. Let's create an object-oriented dice-roller app! Following the general directions of the Methods exercise with the Dice roller,
//        - Create a class called Die or Dice.java
//        - Create your main class (the class with the main() method) and name id DiceRollingApp.java
//        - Put all your user input on the DiceRollingApp
//        - Your Die class should have the numberOfSides property and the roll() method defined on it

public class HelloObjectWorld {
    public static void main(String[] args) {
        Person user1 = new Person();
        newPerson(user1);
        Person user2 = new Person();
        newPerson(user2);
        Person user3 = new Person();
        newPerson(user3);
    }

    public static void newPerson(Person user) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        user.firstName = sc.nextLine();
        System.out.print("Enter you last name: ");
        user.lastName = sc.nextLine();
        System.out.print("Enter your email: ");
        user.email = sc.nextLine();
        System.out.println("Hello, " + user.firstName + " " + user.lastName + ". We have your email as " + user.email);
    }
}
