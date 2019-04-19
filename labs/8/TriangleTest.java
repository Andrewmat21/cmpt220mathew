import java.util.Scanner;

public class TriangleTest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the properties of a triangle.");
		System.out.println("Enter the length of side1: ");
		double side1 = scan.nextDouble();
		System.out.println("Enter the length of side2: ");
		double side2 = scan.nextDouble();
		System.out.println("Enter the length of side3: ");
		double side3 = scan.nextDouble();
		System.out.println("Enter the color: ");
		String color = scan.next();
		System.out.println("Is the triangle filled, true or false?: ");
		boolean filled = scan.nextBoolean();
		
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
		System.out.println(t.toString());
	}
}
