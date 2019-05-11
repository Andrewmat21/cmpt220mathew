import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class ShoppingWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField txtPressRefreshButton;
	private JTextField txtToViewCurrent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoppingWindow frame = new ShoppingWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShoppingWindow() {
		Cart myCart = new Cart();
		
		Item item1 = new Item("T-Shirt", 50, 1);
		Item item2 = new Item("Socks", 10, 2);
		Item item3 = new Item("Shorts", 25, 3);
		Item item4 = new Item("Baseball Cap", 15, 4);
		Item item5 = new Item("Underwear", 15, 5);
		Item item6 = new Item("Shoes", 90, 6);
		Item item7 = new Item("Designer Bag", 500, 7);
		Item item8 = new Item("Sunglasses", 200, 8);
		
		Item itemList[] = new Item[8];
		itemList[0] = item1;
		itemList[1] = item2;
		itemList[2] = item3;
		itemList[3] = item4;
		itemList[4] = item5;
		itemList[5] = item6;
		itemList[6] = item7;
		itemList[7] = item8;
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 653, 418);
		contentPane.add(tabbedPane);
		
		JPanel invPane = new JPanel();
		tabbedPane.addTab("Inventory", null, invPane, null);
		invPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"T-Shirt", "Socks", "Shorts", "Baseball Cap", "Underwear", "Shoes", "Designer Bag", "Sunglasses"}));
		comboBox.setBounds(110, 65, 192, 22);
		invPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(110, 133, 116, 22);
		invPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Item:");
		lblNewLabel.setBounds(12, 68, 56, 16);
		invPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity:");
		lblNewLabel_1.setBounds(12, 136, 56, 16);
		invPane.add(lblNewLabel_1);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int quantity = new Integer(textField.getText());
				String item = (String)comboBox.getSelectedItem();
				for (Item testItem : itemList) { 
					if (testItem.getName().compareTo(item) == 0) {
						for (int i = 0; i < quantity; i++) {
							myCart.addItem(testItem);
						}
					}
				}
				} catch (Exception ex) {
					System.out.println("Error");
				}
				
			}
		});
		btnAddToCart.setBounds(247, 287, 135, 25);
		invPane.add(btnAddToCart);
		
		JPanel cartPane = new JPanel();
		tabbedPane.addTab("View Cart", null, cartPane, null);
		cartPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 319, 388);
		cartPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(CartTableModel.getModel(myCart));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Total Price: ");
		lblNewLabel_2.setBounds(331, 339, 86, 16);
		cartPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(411, 339, 56, 16);
		cartPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				table.setModel((CartTableModel.getModel(myCart)));
				lblNewLabel_3.setText("$" + myCart.getTotal() + "0");
			}
		});
		btnNewButton.setBounds(331, 4, 97, 25);
		cartPane.add(btnNewButton);
		
		txtPressRefreshButton = new JTextField();
		txtPressRefreshButton.setBackground(SystemColor.menu);
		txtPressRefreshButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPressRefreshButton.setText("Press 'Refresh' button after each purchase");
		txtPressRefreshButton.setBounds(440, 10, 196, 15);
		cartPane.add(txtPressRefreshButton);
		txtPressRefreshButton.setColumns(10);
		
		txtToViewCurrent = new JTextField();
		txtToViewCurrent.setForeground(SystemColor.activeCaptionText);
		txtToViewCurrent.setBackground(SystemColor.menu);
		txtToViewCurrent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtToViewCurrent.setText("to view current updated cart contents.");
		txtToViewCurrent.setBounds(440, 36, 181, 16);
		cartPane.add(txtToViewCurrent);
		txtToViewCurrent.setColumns(10);
		
		
	}
}
