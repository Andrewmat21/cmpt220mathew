
public class CircleTest 
{

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(2, 2, 5.5);
		System.out.println("The Circle's Area: " + c1.getArea());
		System.out.println("The Circle's Perimeter: " + c1.getPerimeter());
		System.out.println("The Circle contains (3,3): " + c1.contains(3,3));
		System.out.println("The Circle contains Circle(4, 5, 10.5): " + c1.contains(new Circle(4, 5, 10.5)));
		System.out.println("The Circle overlaps Circle(3, 5, 2.3): " + c1.overlaps(new Circle(3, 5, 2.3)));
	}
}
