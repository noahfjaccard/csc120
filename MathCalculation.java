import java.util.*;
public class MathCalculation
{
  public static void main( String[] args )
  {
    System.out.println(method1( 3, method2(5, 7)) );
    System.out.println(method2( method1(3, 5), 7)) ;

  }
  public static int method1( int a, int b )
  {
    return 2 * a * b;
  }
  public static int method2( int a, int b )
  {
    return 3 * ( a - b );
  }
}
