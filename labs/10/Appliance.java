
public abstract class Appliance implements Comparable<Appliance>
{
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	Appliance()
	{
		
	}
	
	Appliance(double voltage, String color, String madeIn, double price)
	{
		
	}
	
	public double getVoltage() 
	{
		return voltage;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getMadeIn() 
	{
		return madeIn;
	}
	
	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String toString()
	{
		return " Appliance Type: " + this.getClass() + ", Price: $" + this.getPrice();
	}
	
	public int compareTo(Appliance a)
	{
		if (this.getPrice() < a.getPrice())
			return -1;
		else if (this.getPrice() > a.getPrice())
			return 1;
		else
			return 0;
	}
}