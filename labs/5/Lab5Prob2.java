import java.util.Scanner;

public class Lab5Prob2 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 numbers.");
		double[] array = new double[10];
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Enter: ");
			array[i] = scan.nextDouble();
		}

	}

	public static double deviation(double[] x)
	{
		double avg = mean(x);
		double sum = 0;
		double std = 0.0;
		
		for (int i = 0; i < x.length; i++)
		{
			sum += Math.pow(x[i] - avg, 2);
		}
	
		std = Math.sqrt(sum / (x.length - 1));
		return std;
	
	}

	public static double mean(double[] x)
	{
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}
	
		avg = sum / x.length;
		return avg;
	}



}
