
public class Triangle extends GeometricObject
{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle()
	{
		
	}

	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if ((side1 + side2 <= side3) || (side2 + side3 <= side1) || (side3 + side1 <= side2))
		{
			throw new IllegalTriangleException();
		}
	}
	
	public double getSide1()
	{
		return this.side1;
	}
	
	public double getSide2()
	{
		return this.side2;
	}
	
	public double getSide3()
	{
		return this.side3;
	}

	public double getArea()
	{
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
