import java.util.*;
import java.io.*;
public class SongCollection
{
  private Song[] theSongs;

  public SongCollection()
  {
    theSongs = new Song[0];
  }

  public int size()
  {
    return theSongs.length;
  }

  public void addFromFile( File f ) throws FileNotFoundException
  {
    Scanner scan = new Scanner(f);
    int total = scan.nextInt();
    scan.nextLine();
    Song[] merged = Arrays.copyOf(theSongs,(theSongs.length + total));
    for(int i = theSongs.length; i < (theSongs.length + total); i++)
    {
      String tTemp = scan.nextLine();
      String aTemp = scan.nextLine();
      Song sTemp = new Song(tTemp,aTemp);
      merged[i] = sTemp;
    }
    theSongs = merged;
  }

  public void writeToFile( File f ) throws FileNotFoundException
  {
    PrintStream ps = new PrintStream(f);
    ps.println(size());
    for(int i = 0; i < size(); i++){
      ps.println(theSongs[i].getTitle());
      ps.println(theSongs[i].getArtist());
    }
  }

  public void addOneSong( String t, String a )
  {
    Song[] merged = Arrays.copyOf(theSongs,(theSongs.length + 1));
    Song sTemp = new Song(t,a);
    merged[merged.length - 1] = sTemp;
    theSongs = merged;
  }

  public void delete( int pos )
  {
    Song[] merged = Arrays.copyOf(theSongs,theSongs.length - 1);
    if(pos < theSongs.length)
    {
      for(int i = 0; i < theSongs.length; i++)
      {
        if(i < pos - 1)
        {
          merged[i] = theSongs[i];
        }
        else
        {
          merged[i] = theSongs[i+1];
        }
      }
    }
    theSongs = merged;
  }

  public void searchByTitle( String key )
  {
    for(int i = 0; i < theSongs.length; i++)
    {
      String temp = theSongs[i].getTitle();
      if(temp.indexOf(key) > -1)
      {
        System.out.println((i + 1) + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
      }
    }
  }

  public void searchByArtist( String key )
  {
    for(int i = 0; i < theSongs.length; i++)
    {
      String temp = theSongs[i].getArtist();
      if(temp.indexOf(key) > -1)
      {
        System.out.println((i + 1) + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
      }
    }
  }

  public void show( int start, int end )
  {
    for(int i = start; i < end; i++)
    {
      System.out.println(i + ": " + theSongs[i].getTitle() + ", " + theSongs[i].getArtist());
    }
  }
}
