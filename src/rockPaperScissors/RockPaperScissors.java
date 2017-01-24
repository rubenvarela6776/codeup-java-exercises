package rockPaperScissors;
import java.util.Scanner;
import validator.Validator;
/**
 * Created by rubenvarela on 1/18/17.
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        String userContinue;
        System.out.println("=====================================\n  Welcome to rock, paper, scissors!\n=====================================");
        System.out.println("=-=-=-=-=-=-=-=-=\nWhat's your name?");
        String userName = sc.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=");

        do {
            String cpuMove = chooseGameModeGenerateComputerMove(userName, validator);
            int userMove = getUserMove(userName);
            determineWinner(userMove, cpuMove);

            String[] array = {"yes", "no", "y", "n"}; //array that holds the acceptable inputs
            String prompt1 = "Would you like to play again? (y/n)"; //prompt that asks for user input
            String prompt2 = "Enter valid input: (y/n)"; //invalid input prompt
            userContinue = validator.getAndValidateString(array, prompt1, prompt2);
        } while(userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing, " + userName);
    }

    public static String chooseGameModeGenerateComputerMove(String userName, Validator validator) {

        System.out.println("-------------------\nChoose the gamemode\n-------------------");
        String prompt = "[1] Traditional Gamemode - CPU Will Make It's Choice Randomly\n[2] Rigged Gamemode - CPU Will Always Choose Rock";
        int gameMode = validator.getIntWithinRange(prompt, 1, 2);

        String cpuMove;
        if (gameMode == 1) {
            CPURandom cpu = new CPURandom(userName);
            cpuMove = cpu.generateRoshambo();

        } else if (gameMode == 2) {
            CPURock cpu = new CPURock(userName);
            cpuMove = cpu.generateRoshambo();
        } else {cpuMove = null;}

        return cpuMove;
    }

    public static int getUserMove(String userName) {
        UserChoice userChoice = new UserChoice(userName);
        System.out.println("---------------\nInput your move\n---------------");
        String prompt2 = "[1] Rock, [2] Paper, [3] Scissors";
        return userChoice.getInput(prompt2);
    }

    public static void determineWinner(int userMove, String cpuMove) {

        System.out.println("#######################\nThe CPU chose " + cpuMove + ".");

        if (userMove == 1 && cpuMove.equalsIgnoreCase("paper")) {
            System.out.println("Paper beats rock.\nYou lose!");
        } else if (userMove == 1 && cpuMove.equalsIgnoreCase("scissors")) {
            System.out.println("Rock beats scissors.\nYou win!");
        } else if (userMove == 2 && cpuMove.equalsIgnoreCase("rock")) {
            System.out.println("Paper beats rock.\nYou win!");
        } else if (userMove == 2 && cpuMove.equalsIgnoreCase("scissors")) {
            System.out.println("Scissors beats paper.\nYou lose!");
        } else if (userMove == 3 && cpuMove.equalsIgnoreCase("rock")) {
            System.out.println("Rock beats scissors.\nYou lose!");
        } else if (userMove == 3 && cpuMove.equalsIgnoreCase("paper")) {
            System.out.println("Scissors beats paper.\nYou lose!");
        } else {
            System.out.println("You tied!");
        }
        System.out.println("#######################");
    }
}