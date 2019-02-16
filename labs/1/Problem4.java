import java.util.Scanner;

public class Problem4 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double c = 299972458;
		
		// ask user for mass
		System.out.print("Enter the mass in kg: ");
		double m = scan.nextDouble();
		
		// calculate and display energy
		double e = m * Math.pow(c, 2);
		System.out.println("The energy is: " + e);
	}

}
