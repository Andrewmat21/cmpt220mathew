import java.util.Scanner;

public class Lab4Prob3 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String st = scan.next();
		System.out.println("String is a palindrome: " + isPalindrome(st));
	}

	public static String reverse(String s)
	{
		char[] chars = s.toCharArray();
		int length = chars.length -1;
		for (int i = 0; i < length; i++)
		{
			char temp = chars[i];
			chars[i] = chars[length];
			chars[length--] = temp;
		}

		return new String(chars);
	}

	public static boolean isPalindrome(String s)
	{
		char[] temp1 = s.toCharArray();
		if (new String(temp1).equals(reverse(s)))
			return true;
		else
			return false;
	}
}
