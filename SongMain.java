import java.util.*;
import java.io.*;
public class SongMain
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    SongCollection mySongs = new SongCollection();
    boolean running = true;
    int choice = 0;

    do
    {
      System.out.print("========Select action========\n" +
      "0. Quit\n" +
      "1. Get collection size\n" +
      "2. Search for title\n" +
      "3. Search for artist\n" +
      "4. Add from file\n" +
      "5. Save to file\n" +
      "6. Add one song\n" +
      "7. Remove one song\n" +
      "8. Show\n" +
      "Enter choice: ");
      choice = scan.nextInt();

      switch (choice)
      {
        case 0: running = false; break;
        case 1: System.out.println("Size = " + mySongs.size()); break;
        case 2:
          System.out.print("Enter Title Search Key: ");
          String key = scan.next();
          mySongs.searchByTitle(key);
          scan.nextLine();
          break;
        case 3:
          System.out.print("Enter Artist Search Key: ");
          String key2 = scan.next();
          mySongs.searchByArtist(key2);
          scan.nextLine();
          break;
        case 4:
          try
          {
            System.out.print("Enter file name: ");
            String fileName = scan.next();
            File f = new File(fileName);
            mySongs.addFromFile(f);
          }
          catch(FileNotFoundException e)
          {
            System.out.print("No File");
          }
          break;
        case 5:
          try
          {
            System.out.print("Enter file name: ");
            String fileName = scan.next();
            File f = new File(fileName);
            mySongs.writeToFile(f);
          }
          catch(FileNotFoundException e)
          {
            System.out.print("No File");
          }
          break;
        case 6:
          System.out.print("Enter Title: ");
          String t = null;
          scan.nextLine();
          t = scan.nextLine();
          System.out.print("Enter Artist: ");
          String a = null;
          a = scan.nextLine();
          mySongs.addOneSong(t,a);
          break;
        case 7:
          System.out.print("Enter Position: ");
          int pos = scan.nextInt();
          mySongs.delete(pos);
          break;
        case 8:
          int startPos, endPos;
          System.out.print("Enter start position: ");
          startPos = scan.nextInt();
          System.out.print("Enter end position: ");
          endPos = scan.nextInt();
          mySongs.show(startPos,endPos);
          break;
        default: System.out.println("Please type a number 0-8."); break;
      }
    }
    while(running);
  }
}
