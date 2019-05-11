import javax.swing.table.DefaultTableModel;
import java.util.Collections;
import java.util.ArrayList;

public class CartTableModel 
{

	public static DefaultTableModel getModel(Cart myCart)
	{
		Object[][] tableData = new Object[myCart.getCart().size()][4];
		for (int i = 0; i < myCart.getCart().size(); i++)
		{
			tableData[i][0] = myCart.getCart().get(i).getName();
			tableData[i][1] = new Double(myCart.getCart().get(i).getPrice());
			tableData[i][2] = new Integer(myCart.getCart().get(i).getIdNum());
			
		}
		return new DefaultTableModel(tableData, 
				new String[] 
						{
						"Item", "Price", "Item ID"
					}
				) 
		
		{
					private static final long serialVersionUID = 1L;
					Class[] columnTypes = new Class[] 
					{
						String.class, Double.class, Integer.class
					};
					public Class getColumnClass(int columnIndex) 
					{
						return columnTypes[columnIndex];
					}
			};
			
	}
}
