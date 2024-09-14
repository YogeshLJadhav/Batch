package practice_Scripts;

class Parent_A01           // single inheritance
{
	void black()
	{
		System.out.println("parent method : black");
	}
}

public class Child_B01 extends Parent_A01
{

	void red()
	{
		System.out.println("child method : red ");
	}

	public static void main(String[] args) {
		 Child_B01 ab=new  Child_B01();
		 ab.red();
		 ab.black();

	}

}
