import java.util.Scanner;

public class Lab2Prob3 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a lower limit integer: ");
		int lowerNum = scan.nextInt();
		
		System.out.println("Enter a upper limit integer: ");
		int upperNum = scan.nextInt();
		
		int num1 = ((int)((Math.random() * upperNum) + lowerNum));
		int num2 = ((int)((Math.random() * upperNum) + lowerNum));
		int num3 = ((int)((Math.random() * upperNum) + lowerNum));
		
		System.out.println("Three integers in the range are: " + num1 + ", " + num2 + ", and " +num3);
		
	}
}