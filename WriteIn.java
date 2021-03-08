import java.util.*;
public class WriteIn
{
  public static void main(String[] args)
  {
    int[] counts = new int[0];
    String[] names = new String[0];
    String name;
    Scanner scan = new Scanner(System.in);

    System.out.println("###########################################\n#   Enter the votes, one vote per line.   #\n# End with either CTRL-C or an empty line.#\n###########################################");

    while(scan.hasNext())
    {
      name = scan.nextLine();
      if(name.equals(""))
      {
        break;
      }
      find(names, name);
    }
  }
  public static int find( String[] names, String name )
  {
    for(int i = 0; i < names.length - 1; i++)
    {
      if(names[i].equals(name))
      {
        return i;
      }
    }
    return -1;
  }
  public static String[] addName( String[] names, String name )
  {
    String[] newNames = new String[(names.length + 1)];
    for(int i = 0; i < names.length; i++)
    {
      newNames[i] = names[i];
    }
    newNames[(names.length + 1)] = name;
    return newNames;
  }
  public static int[] addNewCount( int[] counts )
  {
    int[] newCounts = new int[(counts.length + 1)];
    for(int i = 0; i < counts.length; i++)
    {
      newCounts[i] = counts[i];
    }
    return newCounts;
  }
  public static void findWinner( String[] names, int[] counts )
  {
    for(int i = 0; i < names.length; i++)
    {
      System.out.println(names[i] + " recieved " + counts[i] + " votes.");
    }
  }
}
