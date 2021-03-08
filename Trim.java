import java.util.*;
public class Trim
{
  public static void main(String[] args)
  {
    String input, list, c;
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    list = scan.nextLine();

    System.out.println(myTrim(input, list));
  }
  public static String myTrim(String input, String list)
  {
    for(int i = 0; i < input.length(); i++)
    {
      if(list.indexOf(input.charAt(i)) > -1)
      {
        input = input.substring(0, i).concat(input.substring(i + 1));
        i--;
      }
    }
    return input;
  }
  public static String myTrim2(String input, String list)
  {
    for(int i = 0; i < input.length(); i++)
    {
      if(list.toLowerCase().indexOf(input.toLowerCase().charAt(i)) > -1)
      {
        input = input.substring(0, i).concat(input.substring(i + 1));
        i--;
      }
    }
    return input;
  }
}
