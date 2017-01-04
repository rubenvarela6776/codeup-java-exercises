/**
 * Created by rubenvarela on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {

        System.out.println("<----- While Loop Starting At 5 Counting Up By One Ending at 15 ----->");

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("<----- Do While Loop Starting At 0 Skipping One Number Up To 100 ----->");

        int skipOne = 0;
        do {
            System.out.println(skipOne);
            skipOne += 2;
        } while (skipOne <= 100);

        System.out.println("<----- Do While Loop Starting At 100 Counting Down By 5 Ending at -10 ----->");

        int skipFive = 100;
        do {
            System.out.println(skipFive);
            skipFive -= 5;
        } while (skipFive >= -10);

        System.out.println("<----- Do While Loop Starting At 2 Going To The Second Power Ending At 1000000 ----->");

        long squared = 2;
        do {
            System.out.println(squared);
            squared = squared * squared;
        } while (squared <= 1000000);

        System.out.println("<----- For Loop Starting At 100 Counting Down By 5 Ending at -10 ----->");

        int skipFive2;
        for (skipFive2 = 100; skipFive2 >= -10; skipFive2 -=5) {
            System.out.println(skipFive2);
        }

        System.out.println("<----- For Loop Starting At 2 Going To The Second Power Ending At 1000000 ----->");

        long squared2;
        for (squared2 = 2; squared2 <= 1000000; squared2 *= squared2) {
            System.out.println(squared2);
        }
    }
}
