package rockPaperScissors;

/**
 * Created by rubenvarela on 1/19/17.
 */
public class CPURandom extends Player {
    public String generateRoshambo() {
        int randomNumber = (int) Math.ceil(Math.random() * 3);

        String roshambo;

        if (randomNumber == 1) {
            roshambo = "rock";
        } else if (randomNumber == 2) {
            roshambo = "paper";
        } else if (randomNumber == 3) {
            roshambo = "scissors";
        } else {
            roshambo = null;
        }

        return roshambo;
    }

    public CPURandom(String userName) {
        super(userName);
    }
}
