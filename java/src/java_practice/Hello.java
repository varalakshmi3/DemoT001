package java_practice;

public class Hello {
	
	public static void main(String args[])
	{
		try {
			
			int i=20/0;
			System.out.println("before catch");
		}
		
		catch(Exception e)
		{
			int b=10/0;
			System.out.println("inside Exception");
			
		}
		
		finally
		{
			System.out.println("inside finally");
		}
	}

}
