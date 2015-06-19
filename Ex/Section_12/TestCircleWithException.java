// Example for PPT page No.14

public class TestCircleWithException
{
	public static void main(String[] args)
	{
		try
		{
			CircleWithException c1=new CircleWithException(5);
			CircleWithException c2=new CircleWithException(-5);
			CircleWithException c3=new CircleWithException(0);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("NUmber of objects created: "+CircleWithException.getNUmberOfObjects());
	}
}