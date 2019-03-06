import java.util.Scanner;
import java.util.Arrays;

public class Lab5Prob4 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the arrays: ");
		int size = scan.nextInt();
		int[] num1 = new int[size];
		int[] num2 = new int[size];

		System.out.println("Enter the values of each arrays.");
		System.out.print("Enter the first array: ");
		for (int i = 0; i < size; i++)
		{
			num1[i] = scan.nextInt();
		}
	
		System.out.print("Enter the second array: ");
		for (int i = 0; i < size; i++)
		{
			num2[i] = scan.nextInt();
		}

		if (equal(num1, num2))
			System.out.print("The two arrays are identical.");
		else
			System.out.print("The two arrays are different.");
	
	}
	
	public static boolean equal(int[] x, int[] y)
	{
		int count = 0;
		Arrays.parallelSort(x);
		Arrays.sort(y);
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == y[i])
				count++;
		}
	
		if (count == x.length)
			return true;
		else 
			return false;
	}
}
