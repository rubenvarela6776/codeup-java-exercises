package rockPaperScissors;

/**
 * Created by rubenvarela on 1/19/17.
 */
public class CPURock extends Player {
    public String generateRoshambo() {
        return "rock";
    }

    public CPURock(String userName) {
        super(userName);
    }
}
