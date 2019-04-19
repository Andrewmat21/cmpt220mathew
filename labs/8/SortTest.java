import java.util.ArrayList;
import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Enter #" + (i + 1) + ": ");
			numbers.add(scan.nextInt());
		}
	
		sort(numbers);
		
		System.out.println("Sorted List: ");	
		System.out.println(numbers);
	
	}

	public static void sort(ArrayList<Integer> list)
	{
		
		for (int i = 0; i < list.size() - 1; i++)
		{
			Integer temp = list.get(i);
			int index = i;
			
			for (int j = i + 1; j < list.size(); j++)
			{
				if (temp.intValue() > list.get(j).intValue())
				{
					temp = list.get(j);
					index = j;
				}
			}
			
			if (index != i)
				list.set(index, list.get(i));
				list.set(i, temp);
		}
	}
}