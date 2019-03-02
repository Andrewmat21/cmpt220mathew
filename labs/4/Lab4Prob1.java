import java.text.DecimalFormat;

public class Lab4Prob1 
{

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("###.##");
		int j,i;
		System.out.println("in      cm | cm       in");
		System.out.println("-------------------------");
		for (i = 1, j = 1; i < 51; i++, j+= 5)
		{
			System.out.println((i + "	" + String.format("%.2f",(double)(i * 2.54)) + "	| " + j + " 	" + String.format("%.2f",(double)(j/2.54))));
			
		}
	}
}
