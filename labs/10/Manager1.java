
public class Manager1 implements Printable
{
	String name;
	int id;
	
	Manager1(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	@Override
	public void print() 
	{
		System.out.println("Manager Name: " + name + " ID: " + id);
	}


}
