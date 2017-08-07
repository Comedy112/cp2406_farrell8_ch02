/**
 * Created by jc321687 on 30/08/16.
 */
import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        System.out.println("Please enter the number of quarts needed");
        Scanner keyboard = new Scanner(System.in);
        int quartsNeeded = keyboard.nextInt();
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded + " gallons plus " +
                extraQuartsNeeded + " quarts.");
    }
}