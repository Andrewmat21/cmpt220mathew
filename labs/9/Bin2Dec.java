import java.util.Scanner;
public class Bin2Dec 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a binary string: ");
		String bin = scan.next();
		System.out.println("The decimal number is: " + bin2Dec(bin));
	}

	public static int bin2Dec(String binaryString)
	{
		int sum = 0;
		for (int i = 0; i < binaryString.length(); i++)
		{
			if (binaryString.charAt(i) == '1')
				sum *= 2;
			else if (binaryString.charAt(i) != '0')
				throw new NumberFormatException();
		}		
	
		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}
}