import java.util.*;
public class TreasureHunting
{
  public static void main(String[] args)
  {
    //Instant~
    int prevX, prevY, nowX, nowY, trueX, trueY, counter = 1;
    Scanner scan = new Scanner(System.in);

    //Opening Line
    System.out.println("#######################################################");
    System.out.println("# A treasure has been hidden at a location in a 10x10 #");
    System.out.println("#    grid. Guess where it is. You have 10 chances.    #");
    System.out.println("#######################################################");

    //Preround
    nowX = -1;
    nowY = -1;
    prevX = -1;
    prevY = -1;
    trueX = ((int)(Math.random()*((10-1)+1))+1);
    trueY = ((int)(Math.random()*((10-1)+1))+1);

    //Parts
    if(nowX != trueX || nowY != trueY)
    {
      for(int i = 0; i < 10; i++)
      {
        System.out.println("---- Round " + counter + " ----");
        if(counter >= 2)
        {
          show(nowX, nowY, prevX, prevY);
        }
        prevX = nowX;
        prevY = nowY;
        System.out.print("Enter your guess for X, Y: ");
        nowX = scan.nextInt();
        nowY = scan.nextInt();
        checkDistance(nowX, nowY, trueX, trueY);
        if(counter >= 2)
        {
          advise(nowX, nowY, prevX, prevY);
        }
        counter++;
      }
      System.out.println("The treasure was at (" + trueX + "," + trueY + ").");
    }
    System.out.println();
  }
  public static void show(int nowX, int nowY, int prevX, int prevY)
  {
    for(int y = 10; y >= 1; y--)
    {
      for(int x = 1; x <= 10; x++)
      {
        if(x == nowX && y == nowY)
        {
          System.out.print("@");
        }
        else if(x == prevX && y == prevY)
        {
          System.out.print("P");
        }
        else
        {
          System.out.print(".");
        }
      }
      System.out.print(y);
      System.out.println();
    }
    System.out.println("@ = Current, P = Previous");
  }
  public static void checkDistance(int nowX, int nowY, int trueX, int trueY)
  {
    final int CLOSE = 3, FAR = 6;
    if((Math.abs(nowX - trueX)) + (Math.abs(nowY - trueY)) == 0)
    {
      System.out.println("You have found the treasure!");
    }
    else if((Math.abs(nowX - trueX)) + (Math.abs(nowY - trueY)) <= CLOSE)
    {
      System.out.println("The distance is no more than 3.");
    }
    else if(((Math.abs(nowX - trueX)) + (Math.abs(nowY - trueY)) >= CLOSE) && ((Math.abs(nowX - trueX)) + (Math.abs(nowY - trueY)) < FAR))
    {
      System.out.println("The distance is no more than 6.");
    }
    else
    {
      System.out.println("The distance is more than 6.");
    }
  }
  public static void advise(int nowX, int nowY, int prevX, int prevY)
  {
    if(((nowX - prevX) + (nowY - prevY)) == 0)
    {
      System.out.println("The same distance");
    }
    else if(((nowX - prevX) + (nowY - prevY)) > 0)
    {
      System.out.println("You are farther.");
    }
    else
    {
      System.out.println("You are closer.");
    }
  }
}
