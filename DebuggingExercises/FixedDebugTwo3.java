import java.math.*;
public class FixedDebugTwo3
// Demonstrates remainder and output
{
   public static void main(String args[])
   {
      int a = 99, b = 8, result;
      BigInteger c = new BigInteger("7777777777777");
      result = a % b;
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result);
      System.out.print("c is a very large number: ");
      System.out.println(c);
    }
}