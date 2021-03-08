import java.io.File;
import java.util.Scanner;
public class abc
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("% java Numberal count "+args[0]);
      String path = args[0];
      File file = new File(path);
      Scanner input = new Scanner(file);
      int arr[] = new int[10]; //create an array of elements
      while (input.hasNextLine())
      {
        String line = input.nextLine();
        for(int i=0;i<line.length();i++)
        {
          int ascii = line.charAt(i)-'0'; // take the ascii value
          if(ascii>=0 && ascii<=9)
          {
            arr[ascii]++; //increment the count
          }
        }
      }
      input.close();
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(i+": "+arr[i]);
      }
      System.out.println("%");
    } catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
