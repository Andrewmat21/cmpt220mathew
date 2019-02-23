import java.util.Scanner;

public class Lab3Prob6 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = scan.next();

		System.out.println("The string has " + countVowels(st) + " vowel(s).");
	}

	public static int countVowels(String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a =='A' || a =='E' || a =='I' || a == 'O'|| a == 'U')
			{
				count++;
			}
			
		}
		return count;
	}
}
