import java.util.Scanner;

public class Lab2Prob5 
{

	public static void main(String[] args)
	{
	// Prompt user to enter two strings	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two strings to be compared and printed in ascnedning order.");
	System.out.println("Word 1: ");
	String word = scan.next();
	System.out.println("Word 2: ");
	String word2 = scan.next();
	
	// compare strings lexigraphically and print
	if (word.compareTo(word2) > 0)
		System.out.println(word2 + ", " + word);
	
	else if (word.compareTo(word2) < 0)
		System.out.println(word + ", " + word2);
	
	else if (word.compareTo(word2) == 0)
		System.out.println(word + ", " + word2);
	}
}