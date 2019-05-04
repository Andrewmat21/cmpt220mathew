
public class Telephone extends Appliance
{
	private String brand;
	private int cellId;
	private String carrier;
	
	Telephone()
	{
		
	}

	Telephone(double price)
	{
		super();
		this.setPrice(price);
	}

	public String getBrand() 
	{
		return brand;
	}

	public int getCellId() 
	{
		return cellId;
	}

	public String getCarrier() 
	{
		return carrier;
	}
}
