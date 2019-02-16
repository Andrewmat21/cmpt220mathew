import java.util.Scanner;

public class Lab2Prob2 
{

	public static void main(String[] args)
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of a month (1-12): ");
	int num = scan.nextInt();
	
	if (num == 1)
		System.out.println("The month is January.");
	else if (num == 2)
		System.out.println("The month is Febuary.");
	else if (num == 3)
		System.out.println("The month is March.");
	else if (num == 4)
		System.out.println("The month is April.");
	else if (num == 5)
		System.out.println("The month is May.");
	else if (num == 6)
		System.out.println("The month is June.");
	else if (num == 7)
		System.out.println("The month is July.");
	else if (num == 8)
		System.out.println("The month is August.");
	else if (num == 9)
		System.out.println("The month is September.");
	else if (num == 10)
		System.out.println("The month is October.");
	else if (num == 11)
		System.out.println("The month is November.");
	else if (num == 12)
		System.out.println("The month is December.");
	else 
		System.out.println("Invalid Response.");
	
	}
}