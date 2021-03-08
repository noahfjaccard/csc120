import java.util.*;
public class TriangleSingle
{
  public static void generate(int num)
  {
    int len = 1, count = 1;
    for(int n = num; n >= 1; n--)
    {
      if(count > 0)
      {
        System.out.print("*");
        count--;
        if(count == 0)
        {
          System.out.println();
          len++;
          count = len;
        }
      }
      if(count < len && count > 0 && n == 1 )
      {
        for(int counter = count; counter >= 1; counter--)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < 10; i++)
    {
      System.out.print("Enter number: ");
      int num = scan.nextInt();
      if (num <= 0)
      {
        break;
      }
      generate(num);
      System.out.println();
    }
  }
}
