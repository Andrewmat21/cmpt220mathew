
public class IllegalTriangleException extends RuntimeException
{
	IllegalTriangleException(String msg)
	{
		super(msg);
	}

	IllegalTriangleException()
	{
		super("sides of the triangle are invalid");
	}
}
