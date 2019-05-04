
public class SportCar implements Printable
{
	String name;
	int idNum;
	
	public SportCar(String brand, int idNum)
	{
		this.name = brand;
		this.idNum = idNum;
	}
	
	@Override
	public void print() 
	{
		System.out.println("The car's brand: " + name + " and its id# is: " + idNum);
	}
}
