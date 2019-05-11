import java.text.NumberFormat;


public class Item 
{
	private String name;
	private double price;
	private int idNum;

	public Item(String name, double price, int id)
	{
		this.name = name;
		this.price = price;
		this.idNum = id;
	}

	public double getPrice()
	{
		return price;
	}

	public int getIdNum()
	{
		return idNum;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		NumberFormat f = NumberFormat.getCurrencyInstance();
		return (name + "\t" + f.format(price));
	}

	public int compareTo(Item a)
	{
		if (this.getIdNum() < a.getIdNum())
			return -1;
		else if (this.getIdNum() > a.getIdNum())
			return 1;
		else
			return 0;
	}


}
