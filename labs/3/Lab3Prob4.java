
public class Lab3Prob4 
{

	public static void main(String[] args)
	{
		int prime = 0;
		int n;
		
		for (n = 15000; n > 0; n--)
		{	
			int fact = 0;
			for (int i = 1; i <= n; i++)
			{
				if (n % i == 0)
					fact += 1;	
			}
			
			if (fact == 2)
			{
				prime = n;
				break;
			}
				
			
		}
		System.out.println("The largest prime number less than 15,000 is " + prime);

	}

}
