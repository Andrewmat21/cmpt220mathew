
public class SquareTestProb1 
{

	public static void main(String[] args) 
	{
		Square sq1 = new Square(40);
		Square sq2 = new Square(39.5);
		
		System.out.println("Square 1's width: " + sq1.width);
		System.out.println("Square 1's area: " + sq1.getArea());
		System.out.println("Square 1's perimeter: " + sq1.getPerimeter());
	
		System.out.println("Square 2's width: " + sq2.width);
		System.out.println("Square 2's area: " + sq2.getArea());
		System.out.println("Square 2's perimeter: " + sq2.getPerimeter());
	
	}

}
