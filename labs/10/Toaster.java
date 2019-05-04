
public class Toaster extends Appliance
{
	private String brand;
	private double weight;
	private int power;

	Toaster()
	{
		
	}

	public Toaster(double price)
	{
		super();
		this.setPrice(price);
	}

	public String getBrand() 
	{
		return brand;
	}

	public double getWeight() 
	{
		return weight;
	}

	public int getPower() 
	{
		return power;
	}
	
}
