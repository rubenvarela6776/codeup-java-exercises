import java.util.Scanner;

/**
 * Created by rubenvarela on 1/18/17.
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();
        System.out.println("=====================================\n  Welcome to rock, paper, scissors!\n=====================================");
        System.out.println("=-=-=-=-=-=-=-=-=\nWhat's your name?");
        String userName = sc.nextLine();
        System.out.println("=-=-=-=-=-=-=-=-=\n-------------------\nChoose the gamemode\n-------------------");
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
        UserChoice userChoice = new UserChoice(userName);
        System.out.println("---------------\nInput your move\n---------------");
        String prompt2 = "[1] Rock, [2] Paper, [3] Scissors";
        int userMove = userChoice.getInput(prompt2);



        determineWinner(userMove, cpuMove);
    }
    public static void determineWinner(int userMove, String cpuMove) {

        System.out.println("The CPU chose " + cpuMove);

        int computerMove = 0;
        if (cpuMove.equalsIgnoreCase("rock")) {
            computerMove = 1;
        } else if (cpuMove.equalsIgnoreCase("paper")) {
            computerMove  = 2;
        } else if (cpuMove.equalsIgnoreCase("scissors")) {
            computerMove = 3;
        }

        if (userMove == computerMove) {
            System.out.println("You tied");
        } else if (userMove == 1 && computerMove == 2) {
            System.out.println("Paper beats rock. You lose!");
        } else if (userMove == 1 && computerMove == 3) {
            System.out.println("Rock beats paper. You win!");
        } else if (userMove == 2 && computerMove == 1) {
            System.out.println("Paper beats rock. You win!");
        } else if (userMove == 2 && computerMove == 3) {
            System.out.println("Scissors beats paper. You lose!");
        } else if (userMove == 3 && computerMove == 1) {
            System.out.println("Rock beats scissors. You lose!");
        } else if (userMove == 3 && computerMove == 2) {
            System.out.println("Scissors beat paper. You lose!");
        }

    }
}