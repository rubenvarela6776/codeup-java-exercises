package countries;
import validator.Validator;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by rubenvarela on 1/23/17.
 */
public class CountriesApp {
    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        System.out.println("============\n  Welcome!\n============");
        String prompt = "-------------------------------\nWhat would you like to do?\n[1] Display a list of countries\n[2] Input and save a country\n[3] Exit Application";
        int userChoice = validator.getIntWithinRange(prompt, 1, 3);
        System.out.println("-------------------------------");
        CountriesTextFile countriesTextFile = new CountriesTextFile();
        countriesTextFile.createFile();

        String userCountries = "";
        String inputAnotherCountry;
        do {
            System.out.println("Enter a country");
            userCountries += sc.next();
            String[] array = {"yes, no, y, n"};
            String prompt1 = "Would you like to input another country? (y/n)";
            String prompt2 = "Enter valid input: (y/n)";
            inputAnotherCountry = validator.getAndValidateString(array, prompt1, prompt2);
        } while (inputAnotherCountry.equalsIgnoreCase("yes") || inputAnotherCountry.equalsIgnoreCase("y"));

        countriesTextFile.writeCountries(userCountries);
        countriesTextFile.readCountries();

    }
}
