import java.util.*;

public class QuadraticFull
{

  public static void main( String[] args)
  {
    //instantializing
    Scanner scan = new Scanner(System.in);
    double a, b, c;

    //nabbing variables
    System.out.print("Enter a, b and c for ax^2 + bx + c: ");
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();

    solve(a, b, c);

    System.out.println();
  }

  public static void solve(double a, double b, double c)
  {
    Boolean aIsntZero = true;
    //Part 1
    if(a == 0)
    {
      aIsntZero = false;
      System.out.println("Invalid because the coefficient a is 0.");
    }
    //Part 2
    else if(a < 0)
    {
      a *= -1;
      b *= -1;
      c *= -1;
    }

    //Part 3a
    double discriminant = (Math.pow(b,2) - (4.0 * a * c));
    //Part 3b
    double denominator = (2.0 * a);
    //Part 3c
    double left = (b * -1.0);
    //Part 3d
    double right = (Math.sqrt(Math.abs(discriminant)));

    //I
    if(discriminant == 0 && aIsntZero)
    {
      System.out.println("There is only one solution: ");
      printFraction(left, denominator);
      System.out.print(".");
    }
    else if(discriminant > 0 && aIsntZero)
    {
      System.out.println("There are two real solutions: ");
      printFraction((left + right), denominator);
      System.out.print(" and ");
      printFraction((left - right), denominator);
      System.out.print(".");
    }
    else
    {
      if(aIsntZero)
      {
        System.out.println("There are two complex solutions: ");
        printFraction(left, denominator);
        System.out.print(" +/- ");
        printFraction(right, denominator);
        System.out.print("i.");
      }
    }
  }

  public static void printFraction(double top, double bottom)
  {
    if( isInteger(top) && isInteger(bottom) )
    {
      int t = (int)top;
      int b = (int)bottom;
      if((top / bottom) > -1 && (top / bottom) < 1)
      {
        System.out.print((t / gcd(t, b)) + "/" + (b / gcd(t, b)));
      }
      else
      {
        System.out.print(t / b);
      }
    }
    else
    {
      System.out.print(top / bottom);
    }

  }

  public static Boolean isInteger(double val)
  {
    if(0 == (val % 1))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static int gcd( int a, int b )
  {
    int p = Math.abs( a );
    int q = Math.abs( b );
    while ( q != 0 )
    {
      int r = p % q;
      p = q;
      q = r;
    }
    return p;
  }
}
