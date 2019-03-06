import java.util.Scanner;

public class Lab5Prob6 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int size = scan.nextInt();
		double[][] matrix = new double[size][size];
		
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				System.out.print("Row " + (i + 1) + " Column " + (j + 1) + ": ");
				matrix[i][j] = scan.nextDouble();
			}
		}
	
		System.out.print("Enter the column index to calculate its average: ");
		int col = scan.nextInt();
		System.out.print("The average of column " + (col + 1) + " is " + averageRow(matrix, col));
	}

	public static double averageRow(double[][] array, int column)
	{
		double avg = 0.0;
		double sum = 0.0;
		
		for (int i = 0; i < array.length; i++)
		{
			 sum += array[i][column];
		}
	
		avg = sum / (array.length);
		return avg;
	}
}
