import java.util.Scanner;

public class anotherbrick 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		// set a flag variable and all height,width, and num
		boolean flag = false;
		int layers = 0;
		int sum = 0;
		int x = 1;
		int brick = 0;
		System.out.print("Enter the height of the wall: ");
		int height = scan.nextInt();
		System.out.print("Enter the width of the wall: ");
		int width = scan.nextInt();
		System.out.print("Enter the number of bricks: ");
		int numBricks = scan.nextInt();
		
	
		while (x != 0)
		{
			x++;
			// get length of brick
			brick = scan.nextInt();
			// check if the current wall height is less than the projected height
			if (layers < height)
			{
				// add current brick to current wall length
				sum += brick;
			
				// if the sum is equal to the desired length reset the wall length and start the new layer
				if (sum == width)
				{
					layers++;
					sum = 0;
				}		
			
				// if the current length is too long, break
				else if (sum > width)
				{
					break;
				}
			
			}
			
			// if the wall is constructed to the desired height, flag turns to true
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
