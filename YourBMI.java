import java.util.*;
public class YourBMI
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner( System.in );
		String name;
		int age;
		double height, weight, bmi;

		System.out.print( "Enter your name: " );
		name = scan.next();
		System.out.print( "Enter your age: " );
		age = scan.nextInt();
		System.out.print( "Enter your height in inches: " );
		height = scan.nextDouble();
		System.out.print( "Enter your weight in pounds:  " );
		weight = scan.nextDouble();

		bmi = (703 * weight / height / height);

		System.out.println( name + ", you are " + age + " years old and your BMI is " + bmi );
	}
}
