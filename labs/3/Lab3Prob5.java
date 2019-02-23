import java.util.Scanner;

public class Lab3Prob5 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers to calculate their average.");
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the third number: ");
		double num3 = scan.nextDouble();
		// TODO Auto-generated method stub
		System.out.println("The average is " + average(num1, num2, num3));
	}

	public static double average(double a, double b, double c)
	{
		double avg = (a + b + c) / 3.0;
		return avg;
	}
	
}
