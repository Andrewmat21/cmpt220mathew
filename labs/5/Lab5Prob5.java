import java.util.Scanner;

public class Lab5Prob5 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
		int size = scan.nextInt();
		int[][] matrix = new int[size][size];
		
		System.out.println("Enter for the values for the matrix: ");
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				System.out.print("Row " + (i + 1) + " Column " + (j + 1) + ": ");
				matrix[i][j] = scan.nextInt();
			}
		}
	
		int[][] transpose = new int[size][size];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				transpose[j][i] = matrix[i][j];		
			}
		}
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				System.out.print(transpose[i][j] + " ");
				if (j == size - 1)
					System.out.println();
				
			}
		}
	
	
	}
}
