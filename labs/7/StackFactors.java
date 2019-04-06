
import java.util.Scanner;

public class StackFactors 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int val = scan.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		findFactors(val, stack);
		while (!stack.empty())
		{
			System.out.println(stack.pop() + " ");
		}	
	}

	public static void findFactors(int num, StackOfIntegers st)
	{
		int i = 2; 
		while (num / i != 1)
		{ 
			if (num % i == 0) 
			{
				st.push(i);
				num /= i;
			}
			else
				i++;
		}
		st.push(num);
	}
}
