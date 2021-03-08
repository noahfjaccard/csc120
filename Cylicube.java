import java.util.*;
public class Cylicube
{
  public static void main( String[] args )
  {
    double xRadius, xHeight;

    Scanner scan = new Scanner( System.in );

    xRadius = scan.nextDouble();
    xHeight = scan.nextDouble();
    cylinderToCube(xRadius, xHeight);
    System.out.println(cylinderToCube(xRadius, xHeight));

  }
  public static double cylinderToCube(double xRadius, double xHeight)
  {
    final double PI = 3.14;
    double fVol = (PI * Math.pow(xRadius,2.0) * xHeight);
    double cubeLength = (fVol / 3.0);
    return System.out.println(cubeLength);
  }
}
