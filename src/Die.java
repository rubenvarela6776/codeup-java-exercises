/**
 * Created by rubenvarela on 1/9/17.
 */
public class Die {

    int sidesOnDice;
    int currentValue;

    public Die (int sidesOnDice) {
        this.sidesOnDice = sidesOnDice;
    }

    public int roll() {
        currentValue = (int) Math.ceil(Math.random() * sidesOnDice);
        return currentValue;
    }
}
