import java.util.*;

public class NiftyPrint
{
  public static void main(String[] args)
  {
    String text;
    int width, option;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter width: ");
    width = scan.nextInt();
    System.out.println("Enter formatting option\nLEFT = 0, RIGHT = 1, CENTER = 2: ");
    option = scan.nextInt();
    text = "God is a sister, not a woman. What did you think? She was a woman? Wrong!";

    format(text, width, option);
  }
  public static void format(String text, int width, int option)
  {
    if(!text.endsWith("\n"))
    {
      text += "\n";
    }
    text.replace("\t", " ");
    System.out.print(text);
    StringBuilder wordBuilder = new StringBuilder();
    StringBuilder lineBuilder = new StringBuilder();

    if(option == 0)
    {
      for(int i = 0; i < text.length(); i++)
      {
        if((text.charAt(i) != ' ') && (text.charAt(i) != '\n'))
        {
          wordBuilder.append(text.charAt(i));
        }
        else
        {
          if(wordBuilder.length() > 0)
          {
            if(lineBuilder.length() == 0)
            {
              lineBuilder.append(wordBuilder);
            }
            else if(lineBuilder.length() > 0 && lineBuilder.length() + wordBuilder.length()+1 <= width)
            {
              lineBuilder.append(" ");
              lineBuilder.append(wordBuilder);
            }
            else
            {
              System.out.print(lineBuilder);
              System.out.println();
              flush(lineBuilder, width, option);
              lineBuilder.append(wordBuilder);
            }
          }
          if(text.charAt(i) == '\n')
          {
            System.out.print(lineBuilder);
            System.out.println();
            flush(lineBuilder, width, option);
          }
          flush(wordBuilder, width, option);
        }
      }
    }
    else if(option == 1)
    {
      for(int i = 0; i < text.length(); i++)
      {
        if((text.charAt(i) != ' ') && (text.charAt(i) != '\n'))
        {
          wordBuilder.append(text.charAt(i));
        }
        else
        {
          if(wordBuilder.length() > 0)
          {
            if(lineBuilder.length() == 0)
            {
              lineBuilder.append(wordBuilder);
            }
            else if(lineBuilder.length() > 0 && lineBuilder.length() + wordBuilder.length()+1 <= width)
            {
              lineBuilder.append(" ");
              lineBuilder.append(wordBuilder);
            }
            else
            {
              System.out.print(lineBuilder);
              System.out.println();
              flush(lineBuilder, width, option);
              lineBuilder.append(wordBuilder);
            }
          }
          if(text.charAt(i) == '\n')
          {
            System.out.print(lineBuilder);
            System.out.println();
            flush(lineBuilder, width, option);
          }
          flush(wordBuilder, width, option);
        }
      }
    }
  }
  public static void flush(StringBuilder builder, int width, int option)
  {
    builder.delete(0, builder.length());
  }
}
