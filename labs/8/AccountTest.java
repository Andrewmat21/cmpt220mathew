
public class AccountTest 
{

	public static void main(String[] args) 
	{
		Account act1 = new Account(001, 1000, 2.5);
		Account act2 = new SavingsAccount();
		Account act3 = new CheckingAccount();
		
		act1.deposit(500);
		act1.withdraw(345);
		
		System.out.println(act1.toString());
		System.out.println(act2.toString());
		System.out.println(act3.toString());

	}

}
