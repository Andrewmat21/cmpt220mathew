
public class Square 
{
	double width = 1;
	
	Square()
	{

	}
	
	Square(double side_length)
	{
		this.width = side_length;
	}

	public double getArea()
	{
		double area = 0.0;
		area = this.width * this.width;
		return area;
	}

	public double getPerimeter()
	{
		double perimeter = 0.0;
		perimeter = this.width * 4;
		return perimeter;
	}
}
