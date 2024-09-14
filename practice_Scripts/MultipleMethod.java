package practice_Scripts;

public class MultipleMethod /// class
{
	public void Method_A()      //no return method
	{
	System.out.println("The method A is exicuted");
	}
	public void Method_B() {
		System.out.println("The method B is exicuted");

	}
	public void Method_C() {
		System.out.println("The method c is exicuted");
	}
	public static void main(String args[])    //main method
	{

     MultipleMethod x=new MultipleMethod();    //object created
     x.Method_A();
     x.Method_B();
     x.Method_C();
}
}