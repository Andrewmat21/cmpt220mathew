import java.util.Random;
import java.util.Arrays;

public class ApplicationTest 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Appliance[] ap = new Appliance[40];
		
		for (int i = 0; i < 15; i++)
		{
			ap[i] = new TV((double)rand.nextInt(2000));
		}
			
		for (int i = 15; i < 30; i++)
		{
			ap[i] = new Toaster((double)rand.nextInt(50));
		}
	
		for (int i = 30; i < 40; i++)
		{
			ap[i] = new Telephone((double)rand.nextInt(500));
		}

		Arrays.sort(ap);
		for (int i = 0; i < ap.length; i++)
		{
			System.out.println(ap[i].toString());
		}
	}

}
