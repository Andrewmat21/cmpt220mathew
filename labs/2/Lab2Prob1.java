import java.util.Scanner;

public class Lab2Prob1 
{
	public static void main(String[] args)
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	double number1 = scan.nextDouble();
	System.out.println("Enter another number: ");	
	double number2 = scan.nextDouble();
	
	System.out.print(number1 + " is LESS THAN " + number2 + "? ");
	System.out.println(number1 < number2);
	System.out.print(number1 + " is LESS THAN OR EQUAL TO " + number2 + "? ");
	System.out.println(number1 <= number2);
	System.out.print(number1 + " is EQUAL TO " + number2 + "? ");
	System.out.println(number1 == number2);
	System.out.print(number1 + " is NOT EQUAL TO " + number2 + "? ");
	System.out.println(number1 != number2);
	System.out.print(number1 + " is GREATER THAN " + number2 + "? ");
	System.out.println(number1 > number2);
	System.out.print(number1 + " is GREATER THAN OR EQUAL TO " + number2 + "? ");
	System.out.println(number1 >= number2);
	}
}
	
