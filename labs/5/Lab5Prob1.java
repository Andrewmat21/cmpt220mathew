import java.util.Scanner;

public class Lab5Prob1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 numbers.");
		double[] array = new double[10];
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Enter: ");
			array[i] = scan.nextDouble();
		}

		System.out.println("The largest number in the array is " + max(array));
	}

	public static double max(double[] ar)
	{
		double max = ar[0];
		
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] > max)
				max = ar[i];
		}

		return max;
	}
	
}
