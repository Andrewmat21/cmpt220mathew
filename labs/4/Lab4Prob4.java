import java.util.Scanner;

public class Lab4Prob4 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = scan.next(); // JA: You have to use nextLine() to read the complete string
		char[] array = st.toCharArray();
	

		for (int i = 0; i < array.length; i++)
		{
			int match = 0;
			for(int j = 0; j < array.length; j++)
			{
				if (array[i] == array[j])
					match++;
			}
			System.out.println(" Occurences of " + array[i] + ": " + match);
		}	
	}
}