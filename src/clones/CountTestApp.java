package clones;

import clones.Alligator;
import clones.CountUtil;

/**
 * Created by rubenvarela on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) {
        Alligator alligator = new Alligator();
        Sheep sheep = new Sheep();


        System.out.println("Counting alligators...\n");

        CountUtil.count(alligator, 3);


        System.out.println("Counting sheep...\n");

        sheep.setName("Blackie");
        CountUtil.count(sheep, 2);

        sheep.setName("Dolly");
        CountUtil.count(sheep, 3);

        sheep.setName("Blackie");
        CountUtil.count(sheep, 1);
    }
}
