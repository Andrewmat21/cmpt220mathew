
public class LabProb2 
{

	public static void main(String[] args) 
	{
		int count = 0;
		for (int i = 100; i <= 500; i++)
		{	
			
			
			if ((i % 5 == 0 && i % 7 != 0) || (i % 7 == 0 && i % 5 != 0))
			{
				System.out.print(i + " ");
				count++;
			}
			if (count == 10)
			{
				System.out.println();
				count = 0;
			}
				
		}

	}

}
