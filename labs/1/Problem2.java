
public class Problem2 
{
	public static void main(String[] args)
	{
		// create two variables that approximate pi
		double pi = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0);
		double pi2 = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0);
		
		System.out.println("One approximation for pi is " + pi);
		System.out.println("Another approximation for pi is " + pi2);
	}
	

}
