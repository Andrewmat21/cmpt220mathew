
public class TV extends Appliance
{
	private String screenSize;
	private String brand;
	private String colorRange;
	
	TV()
	{
		
	}

	public TV(double price)
	{
		super();
		this.setPrice(price);
	}

	public String getScreenSize() 
	{
		return screenSize;
	}

	public String getBrand() 
	{
		return brand;
	}

	public String getColorRange() 
	{
		return colorRange;
	}
}
