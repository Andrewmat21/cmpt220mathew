
public class Rectangle implements Printable
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void print() 
	{
		System.out.println("The rectangle has width: " + width + " and length: " + length);
	}
	
}
