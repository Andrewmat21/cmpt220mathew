import java.util.Scanner;
import java.util.Arrays;

public class Lab4Prob8 
{

	public static void main(String[] args) 
	{
		int num = 0;
		Scanner scan = new Scanner(System.in);
		float[] matrix = new float[100];
		
		System.out.println("Enter a list of positive real numbers (Enter '0' to break).");
		for (int i = 0; i < matrix.length; i++)
		{
			System.out.println("Enter: ");
			matrix[i] = scan.nextInt();
			
			if (matrix[i] == 0)
			{
				num = i;
				break;			
			}
				
		}
		
		for (int j = 1; j < num; j++)
		{
			float temp = matrix[j];
			int x = j - 1;
			
			while (x >= 0 && matrix[x] > temp)
			{
				matrix[x + 1] = matrix[x];
				x = x - 1;
			}
			matrix[x + 1] = temp;
		}
		
		System.out.println("In ascending order: ");
		for (int j = 0; j < num; j++)
		{		
			System.out.println(matrix[j] + " ");
		}

	}

}
