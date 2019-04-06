
public class Circle 
{
	double x;
	double y;
	double radius;
	
	Circle()
	{
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	Circle(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea()
	{
		return Math.PI * radius * radius;
	}

	public double getPerimeter()
	{
		return Math.PI * 2 * radius;
	}

	public boolean contains(double x, double y)
	{
		if (Math.sqrt((x * x) + (y * y)) < radius )
			return true;
		else
			return false;
	}

	public boolean contains(Circle c)
	{
		if (Math.sqrt((x * x) + (y * y)) < radius )
		{
			if (c.radius + Math.sqrt((x * x) + (y * y)) < this.radius)
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	public boolean overlaps(Circle c)
	{
		 double distance = Math.sqrt(Math.pow(c.x - x, 2) + (Math.pow(c.y - y, 2)));
	        return distance <= (this.radius + c.radius) && distance >= Math.abs(this.radius - c.radius);
	}
}
