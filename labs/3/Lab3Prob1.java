import java.util.Scanner;

public class Lab3Prob1 
{
	public static void main(String[] args)
	{
		
		int n = 1;
		int count = 0;
		int even = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer, the input ends with a 0: ");
		
		do
		{		
			n = scan.nextInt();
			if (n == 0)
				break;
			if (n % 2 == 0)
				even++;
			sum += n;
			count++;
		} while(n != 0);
		
		double average = sum / count;
		System.out.println("The number of even numbers: " + even);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + average);
	}
}
