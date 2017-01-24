package clones;

import java.lang.reflect.Method;

/**
 * Created by rubenvarela on 1/20/17.
 */
public class CountUtil {
    public static void count(Countable c, int maxCount) {
        int i = 0;
        while (i < maxCount) {
            c.incrementCount();
            System.out.println(c.getCountString());
            i++;
        }
        System.out.println();
        c.resetCount();
    }
}
