package practice_Scripts;

public class Combination {

	public static void main(String[] args) {

		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch1 "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("catch1 "+e);
		}

		catch(Exception e)
		{
			System.out.println("catch2 "+e);
		}
		finally
		{
			System.out.println("i am finally block");
		}
		System.out.println("rest of the code");
		}

	}


