/**
 * Created by jc321687 on 30/08/16.
 */
public class QuartsToGallons
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded + " gallons plus " +
                extraQuartsNeeded + " quarts.");
    }
}
