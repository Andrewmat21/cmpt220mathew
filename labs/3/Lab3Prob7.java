
public class Lab3Prob7 
{

	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 1; i <= 50; i++)
		{ 
			System.out.print(getPentNumber(i) + " ");
			count++;
			
			if (count == 10)
			{
				System.out.println();
				count = 0;
			}
		
		}
	}
	
	public static int getPentNumber(int x)
	{
		return (3 * (x*x) - x)/2;
	}

}
