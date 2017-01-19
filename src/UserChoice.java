import java.util.Scanner;
/**
 * Created by rubenvarela on 1/19/17.
 */
class UserChoice extends Player {
    Validator validator = new Validator();
    public int getInput(String prompt) {
        return validator.getIntWithinRange(prompt, 1, 3);
    }

    public UserChoice(String userName) {
        super(userName);
    }
}
