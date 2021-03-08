public class GCD
{
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
