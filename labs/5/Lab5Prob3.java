import java.util.Scanner;

public class Lab5Prob3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = scan.nextInt();
		int[] scores = new int[size];
		String[] names = new String[size];
		int[] scores_sort = new int[size];
		String[] names_sort = new String[size];
		
		System.out.println("Enter the name and grade for each student.");
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Name: ");
			names[i] = scan.next();
			
			System.out.print("Grade: ");
			scores[i] = scan.nextInt();
		}
		
		for (int j = 0; j < size - 1; j++)
		{
			for (int i = 0; i < size - 1; i++)
			{
				if (scores[i] > scores[i + 1])
				{
					int temp = scores[i];
					String temp1 = names[i];
					scores[i] = scores[i + 1];
					names[i] = names[i + 1];
					scores[i + 1] = temp;
					names[i + 1] = temp1;
					scores_sort = scores;
					names_sort = names;
				}
			}
		}
		
		for (int i = 0; i < size; i++)
		{
			System.out.println("Name: " + names_sort[i] + "	| Score: " + scores_sort[i]);
		}
	
	}

}
