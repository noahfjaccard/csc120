import java.util.*;
public class BirthdayParadox
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int nPeople, nReps;
    double ratio;

    System.out.print("Number of people in the room: ");
    nPeople = scan.nextInt();
    System.out.print("Number of repititions: ");
    nReps = scan.nextInt();

    expiriment1(nPeople, nReps);

  }
  public static int[] oneTrial(int nPeople)
  {
    int[] theCounts = new int[365];
    for(int i = 0; i <= nPeople; i++)
    {
      int temp = (int)(Math.random() * 364.0);
      theCounts[temp]++;
    }
    return theCounts;
  }
  public static Boolean hasAHit(int[] theCounts)
  {
    int num;
    for(int i = 0; i < theCounts.length; i++)
    {
      if(theCounts[i] >= 2)
      {
        return true;
      }
    }
    return false;
  }
  public static void expiriment1(int nPeople, int nReps)
  {
    int[] theCounts;
    double hitRate = 0.0;
    for(int i = 0; i < nReps; i++)
    {
      theCounts = oneTrial(nPeople);
      if(hasAHit(theCounts) == true)
      {
        hitRate++;
      }
    }
    hitRate /= nReps;
    System.out.println("Expiriment 1");
    System.out.printf("%.3f\n", hitRate);
  }
}
