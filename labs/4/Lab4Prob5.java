
public class Lab4Prob5 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int lower = 0;
		int higher = 0;
		int[] matrix = new int[1000];
		
		for (int i = 0; i < matrix.length; i++)
		{
			matrix[i] = (int)(Math.random() * ((1000 - 1) + 1));
			sum += matrix[i];
		}
		
		double average = sum / 1000;
		for (int i = 0; i < matrix.length; i++)
		{
			if (matrix[i] < average)
				lower++;
			else if (matrix[i] > average)
				higher++;
		}
		System.out.println("Average: " + average);
		System.out.println("#'s Lower than average: " + lower);
		System.out.println("#'s Higher than average: " + higher);
	}

}
