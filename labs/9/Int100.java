import java.util.Scanner;
import java.util.Random;

public class Int100 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] array = new int[100];
		
		for (int i = 0; i < 100; i++)
		{
			array[i] = rand.nextInt(100);
		}

		System.out.println("Enter an index in the array: ");
		int n = scan.nextInt();
		try 
		{
			System.out.println("The integer at index " + n + " is: " + array[n]);
		} 
		catch(IndexOutOfBoundsException e)
		{ 
			System.out.println("Out of Bounds");			
		}
	
	}

}
