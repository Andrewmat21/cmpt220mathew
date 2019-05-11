import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cart 
{
	private int cartCount;
	private double cartTotalPrice;
	private ArrayList<Item> cart = new ArrayList<>();
	private Item[] itemList = new Item[cart.size()];
	
	public Cart()
	{
		ArrayList<Item> cart = new ArrayList<>();
		cartCount = cart.size();
		cartTotalPrice = 0;
	}

	public String toString()
	{
		String cartCont = "\nCart Contents\n";
		
		for (int i = 0; i < cartCount; i++)
		{
			cartCont += cart.get(i).toString() + "\n";
		}
		return cartCont;
	}

	public ArrayList<Item> getCart()
	{
		return cart;
	}

	public void addItem(Item i)
	{
		cart.add(i);
		cartTotalPrice += i.getPrice();
	}

	public double getTotal()
	{
		return cartTotalPrice;
	}
	
	public int getTypesOfItems() 
	{
		for (int i = 0; i < cart.size(); i++)
		{
			itemList[i] = cart.get(i);
		}
		Arrays.sort(itemList);
		int counter = 1;
		for (int i = 0; i < 50; i++) 
		{
			if (itemList[i].getIdNum() == itemList[i+1].getIdNum()) 
			{
				counter++;			
				continue;
			}
		}
		return counter;
	}
	
	
}
