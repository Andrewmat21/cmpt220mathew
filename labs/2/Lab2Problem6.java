import java.util.Scanner;

public class Lab2Problem6 
{

	public static void main(String[] args)
	{
	System.out.println("This program prints out a random phone number.");
	//Generate and print a random phone number.
	int num1 = ((int)(Math.random() * 300) + 200);
	int num2 = ((int)(Math.random() * 1000) + 100);
	int num3 = ((int)(Math.random() * 9999) + 1000);
		
	System.out.println("Phone #: (" + num1 + ") " + num2 + "-" + num3 + ".");
		
	}
}