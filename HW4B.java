import java.util.*;
public class HW4B
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int begin, end;
    System.out.print("Enter begin and end: ");
    begin = scan.nextInt();
    end = scan.nextInt();
    int counter = begin;
    if(begin > end)
    {
      for(int i = begin; i >= end; i--)
      {
        System.out.println(counter);
        counter--;
      }
    }
    else
    {
      for(int i = begin; i <= end; i++)
      {
        System.out.println(counter);
        counter++;
      }
    }
  }
}
