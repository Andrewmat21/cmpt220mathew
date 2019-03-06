import java.util.Scanner;

public class Lab5Prob7 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the matrix: ");
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
		
		System.out.println("The entered matrix is an Upper Triangular Matrix: " + isUpperTriangular(matrix));
	}

	public static boolean isUpperTriangular(double[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				if ((i > j) && array[i][j] != 0)
					return false;
			}
		}
		
		return true;	
	}
}
