
public class MyLong 
{
	long value;
	
	MyLong(long val)
	{
		this.value = val;
	}

	public long getValue()
	{
		return this.value;
	}
	
	public boolean isEven()
	{
		if (this.value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd()
	{
		if (this.value % 2 == 0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime()
	{
		for(int i = 2; i < this.value; i++) 
		{
	        if (this.value % i==0)
	            return false;
	    }
	    return true;
	}

	
	public static boolean isEven(long val)
	{
		if (val % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(long val)
	{
		if (val % 2 == 0)
			return false;
		else
			return true;
	}

	public static boolean isPrime(long val)
	{
		for(int i = 2; i < val; i++) 
		{
	        if (val % i==0)
	            return false;
	    }
	    return true;
	}

	public static boolean isEven(MyLong val)
	{
		if (val.value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyLong val)
	{
		if (val.value % 2 == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isPrime(MyLong val)
	{
		for(int i = 2; i < val.value; i++) 
		{
	        if (val.value % i == 0)
	            return false;
	    }
	    return true;
	}

	public boolean equals(long val)
	{
		return this.value == val;
	}

	public boolean equals(MyLong val)
	{
		return val.value == this.value;
	}

	public long parseLong(char[] array)
	{
		long sum = 0;
		for (int i = 0, j = array.length - 1; i < array.length; i++)
		{
			if (j != 0)
				sum += Math.pow(10, j) * (array[i] - 0);
			else
				sum += array[i];
		}
		return sum;
	}

	public long parseLong(String st)
	{
		long sum = 0;
		char[] ar = st.toCharArray();
		for (int i = 0, j = ar.length - 1; i < ar.length; i++, j--)
		{
			sum += Math.pow(10, j) * (long)(ar[i] - 0);
		}
		return sum;
	}

}