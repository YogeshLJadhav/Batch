package practice_Scripts;

public class Nested_IfElse {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;

		if(a<b)
		{
			if (c>b)
			{
				System.out.println("print when both condition are true");
			}
			else {
				System.out.println("print when second condition");
			}
		}
		else
		{
		System.out.println("print first condition are false");
	}
	}
}
