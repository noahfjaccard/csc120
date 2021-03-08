import java.util.*;
public class HW4
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double a, b, c;
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();
    System.out.println(middle(a,b,c));
  }
  public static double middle(double a, double b, double c)
  {
    if(a <= b && a > c || a > b && a <= c)
    {
      return a;
    }
    else if(b <= a && b > c || b > a && b <= c)
    {
      return b;
    }
    else
    {
      return c;
    }
  }
}
