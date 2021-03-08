import java.util.*;
public class MathInteract
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double num1, num2;
    String operation;
    Boolean run = true;

    while(run)
    {
      System.out.print("Enter two real numbers: ");
      num1 = scan.nextInt();
      num2 = scan.nextInt();
      System.out.print("Enter an operation: ");
      operation = scan.next();

      switch(operation)
      {
        case "+": System.out.printf("%.8f\n", (num1 + num2)); break;
        case "-": System.out.printf("%.8f\n", (num1 - num2)); break;
        case "*": System.out.printf("%.8f\n", (num1 * num2)); break;
        case "/": System.out.printf("%.8f\n", (num1 / num2)); break;
        case "%": System.out.printf("%.8f\n", (num1 % num2)); break;
        default: run = false;
      }
    }
  }
}
