
public class MyLongTest 
{

	public static void main(String[] args) 
	{
		char[] array = {'3','6','5'}; 
		
		MyLong l = new MyLong(365);
		System.out.println("The value of the long is " + l.getValue());
		System.out.println("The long is even: " + l.isEven());
		System.out.println("The long is even: " + l.isEven(l.value));
		System.out.println("The long is even: " + l.isEven(l));
		System.out.println("The long is odd: " + l.isOdd());
		System.out.println("The long is odd: " + l.isOdd(l.value));
		System.out.println("The long is odd: " + l.isOdd(l));
		System.out.println("The long is prime: " + l.isPrime());
		System.out.println("The long is prime: " + l.isPrime(l.value));
		System.out.println("The long is prime: " + l.isPrime(l));
		System.out.println("The long equals 366: " + l.equals(365));
		System.out.println("The long equals 366: " + l.equals(l.value));
		System.out.println("The long is " + l.parseLong(array));
		System.out.println("The long is: " + l.parseLong("365"));
	}

}
