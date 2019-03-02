import java.util.Scanner;
import java.util.Arrays;

public class lab4Prob6 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();
		int[] array = new int[size];
		int count = 0;
		
		System.out.println("Enter positive numbers (Enter '-1' to end list).");
		for (int i = 0; i < size; i++)
		{
			System.out.println("Enter: ");
			array[i] = scan.nextInt();
			
			count++;
			if (array[i] == -1)
			{
				break;
			}
		
		}
		
		for (int i = 1; i < 11; i++)
		{
			array = Arrays.copyOf(array, array.length + 1); 
			insertEnd(array, i);
		}
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " | ");
			
		}
		
		System.out.println();
		insertAtIndex(array, 10, 3);
		insertAtIndex(array, 100, 7);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " | ");
		}
	
	}

	private static void insertEnd(int[] ar, int val)
	{
		int length = ar.length;
		ar[length - 1] = val;
	}
	
	private static void insertAtIndex(int[] ar, int val, int index)
	{
		ar[index] = val;
	}
}
