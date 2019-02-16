import java.util.Scanner;

public class Problem3 
{
	public static void main(String[] args)
	{
		// Read ounces from user
		System.out.print("Enter a value for ounces: ");
		Scanner read = new Scanner(System.in);
		double ounces = read.nextDouble();
		
		// convert ounces to grams
		double gramsConv = ounces * 28.3495;
		
		System.out.println(ounces + " ounces is " + gramsConv);
	}
}
