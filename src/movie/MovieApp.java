package movie;

import movie.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by rubenvarela on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userContinue;

        System.out.println("Welcome to the movie category application!");

        do {
            runApp(sc);
            System.out.println("\nWould you like to search another genre?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("yes"));

        System.out.println("Thank you. Goodbye!");

    }
    public static void runApp(Scanner sc) {

        List<Movie> movieList = new ArrayList();

        for (int i = 1; i <= 100; i++) {
            movieList.add(MovieIO.getMovie(i));
        }

        System.out.println("What genre are you looking for? (Animated, Musical, Comedy, Drama, Horror, SciFi)");
        String category = sc.next();

        boolean validInput = false;

        do {
            for (int i = 0; i < movieList.size(); i++) {
                if (movieList.get(i).getCategory().equalsIgnoreCase(category)) {
                    validInput = true;
                }
            }
            if (validInput) {
                System.out.println("The following is a list of " + category + " movies.");
            } else {
                System.out.println("Enter a valid genre. (Animated, Musical, Comedy, Drama, Horror, SciFi)");
                category = sc.next();
            }
        } while (!validInput);

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getCategory().equalsIgnoreCase(category)) {
                System.out.println(movieList.get(i).getTitle());
                i++;
            }
        }
    }
}