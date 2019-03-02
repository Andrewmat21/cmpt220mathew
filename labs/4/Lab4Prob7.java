import java.util.Scanner;

public class Lab4Prob7 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the sequence of numbers for the array.");
		for (int i = 0; i < size; i++)
		{
			System.out.println("Enter: ");
			array[i] = scan.nextInt();
		}
		
		int x = 0;
		int j = 0;
		
		for (x = 0; array[x] != -1; x++)
		{
			for(j = 0; array[j] != -1; j++)
			{
				if (array[x] == array[j] && x != j)
				{
					int c = j;
					while (array[c] != -1)
					{
						array[c] = array[++c];
						array[--c] = -1;
					}
				}
			}
		}
		
		for (int i = 0; array[i] != -1; i++)
		{
			System.out.println(array[i] + " ");
		}
		
	}

}
