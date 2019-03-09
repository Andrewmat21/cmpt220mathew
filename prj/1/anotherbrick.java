import java.util.Scanner;

public class anotherbrick 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		int layers = 0;
		int sum = 0;
		System.out.print("Enter the height of the wall: ");
		int height = scan.nextInt();
		System.out.print("Enter the width of the wall: ");
		int width = scan.nextInt();
		System.out.print("Enter the number of bricks: ");
		int numBricks = scan.nextInt();
		int[] bricks = new int[numBricks];
		
		System.out.println("Enter the length of each brick.");
		for (int i = 0; i < numBricks; i++)
		{
			System.out.print("Brick " + (i + 1) + ": ");
			bricks[i] = scan.nextInt();
		}
	
		for (int i = 0; i < bricks.length; i++)
		{
			if (layers < height)
			{
				sum += bricks[i];
			
				if (sum == width)
				{
					layers++;
					sum = 0;
				}		
			
				else if (sum > width)
				{
					layers = height + 1;
				}
			
			}
			
			if (layers == height)
			{
				flag = true;
			}
		}

		if (flag)
			System.out.println("YES");
		
		else if (flag == false)
			System.out.println("NO");
		
	}
}



/*for (int i = 0; layers < height; i++)
{
	if (sum < width)
	{
		if (bricks[i] < (width - sum))
			sum += bricks[i];
		else if (bricks[i] > (width - sum))
		{
			System.out.print("NO");
			break; 
		}		
	}
	if (sum == width)
	{
		sum = 0;
		layers++;
	}
}
if (layers == height)
	System.out.print("YES");

*/


