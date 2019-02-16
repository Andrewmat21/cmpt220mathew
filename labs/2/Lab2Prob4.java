import java.util.Scanner;

public class Lab2Prob4 
{

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);	
	
	// Prompt user to enter two characters.
	System.out.println("Enter a character: ");
	char char1 = scan.next().charAt(0);
	System.out.println("Enter a character: ");
	char char2 = scan.next().charAt(0);
	
	// Add the two chars.
	System.out.println((int)char1 + (int)char2);
	}
}