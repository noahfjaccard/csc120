import java.util.*;
import java.io.*;
public class RainQuery
{

  public static final String FILENAME = "precipitation.txt";
  public static final int FIRST_YEAR = 1931;
  public static final int LAST_YEAR = 2013;
  public static final int YEAR_SIZE = 12 * 31;
  public static final int N_YEARS = LAST_YEAR - FIRST_YEAR + 1;
  public static final int FULL_SIZE = N_YEARS * YEAR_SIZE;

  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner scan = new Scanner(System.in);

    int total = 0, year1, month1, day1, year2, month2, day2;
    double maxValue = 0.0, minValue = 100.0, value, average = 0.0;
    int selection, count, pos, start, end;

    double[] data = readData();

    selection = 1;
    while(selection != 0)
    {
      System.out.print( "You can query the database\n" +
      "1. Daily value\n" +
      "2. Range statistics\n" +
      "0. Quit\n" +
      "Enter your choice: ");
      selection = scan.nextInt();

      if(selection == 1)
      {
        System.out.print("Enter year, month, day: ");
        year1 = scan.nextInt();
        month1 = scan.nextInt();
        day1 = scan.nextInt();
        System.out.println(data[join(year1, month1, day1)]);
      }
      else if(selection == 2)
      {
        System.out.print("Enter start year, month, day: ");
        year1 = scan.nextInt();
        month1 = scan.nextInt();
        day1 = scan.nextInt();
        System.out.print("Enter end year, month, day: ");
        year2 = scan.nextInt();
        month2 = scan.nextInt();
        day2 = scan.nextInt();

        value = (join(year2, month2, day2)) - (join(year1, month1, day1)) + 1;

        for(int i = (join(year1, month1, day1)); i <= (join(year2, month2, day2)); i++)
        {
          if(data[i] > maxValue)
          {
            maxValue = data[i];
          }
          if(data[i] < minValue && data[i] >= 0)
          {
            minValue = data[i];
          }
          total += data[i];
          average = (total / value);
        }
        System.out.println("Total " + value + " points, average = " + average + ", maximum = " + maxValue + ", minimum = " + minValue + ".");
      }
    }
  }
  public static double[] readData() throws FileNotFoundException
  {
    Scanner scan = new Scanner(new File(FILENAME));

    double[] data = new double[FULL_SIZE];
    int pos = 0;

    for(int i = FIRST_YEAR; i <= LAST_YEAR; i++)
    {
      for(int j = 1; j <12; j++)
      {
        scan.nextInt();
        scan.nextInt();
        for(int k = 1; k <= 31; k++)
        {
          data[pos] = scan.nextDouble();
          pos++;
        }
      }
    }

    scan.close();
    return data;
  }
  public static int join(int year, int month, int day)
  {
    if(year > 2013 || year < 1931 || month > 12 || day > 31)
    {
      return -1;
    }
    int tempYear = year - FIRST_YEAR;
    tempYear = tempYear * YEAR_SIZE;
    tempYear = (month - 1) * 31 + (day - 1) + tempYear;
    return tempYear;
  }
}
