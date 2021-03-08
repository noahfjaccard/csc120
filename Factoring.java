import java.util.*;

public class Factoring
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    boolean running = true;

    while(running)
    {
      long theQuotient, theDivisor = 2;
      System.out.println();
      System.out.print("Enter a number => 2: ");
      theQuotient = scan.nextInt();
      if(theQuotient < 2)
      {
        running = false;
      }
      factoring(theQuotient, theDivisor);
    }
  }
  public static void factoring(long q, long d)
  {
    while(q > 1)
    {
      int count;
      if(q % d == 0)
      {
        System.out.print(d);
        if(q > d)
        {
            System.out.print(" * ");
        }
        q = q / d;
      }
      else
      {
        d++;
      }
    }
  }
}
