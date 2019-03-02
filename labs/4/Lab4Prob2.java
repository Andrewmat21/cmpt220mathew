import java.util.Random;

public class Lab4Prob2
{

	public static void main(String[] args)
	{
		char matrix[][] =  new char[5][5];
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				matrix[i][j] = (char)((int)(Math.random() * ((122 - 97) + 1)) + 97);
				
			}
			
		}
		int count = 0;
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
				count++;
				
				if (count == 5)
				{
					System.out.println();
					count = 0;
				}
					
			}
		}
	}

}
