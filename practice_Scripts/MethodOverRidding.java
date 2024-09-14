package practice_Scripts;

    class A
    {
    	void white()
    	{
    		System.out.println("white class----parent");
    	}
    }

    class B extends A
    {
    	@Override
		@Override
		void white()
    	{
    		System.out.println("white class----child");

    	}
    	void black()
    	{
    		System.out.println("black class----child");
    	}
    }

public class MethodOverRidding      /// runtime polymorphism
{
void white()
{
	System.out.println("white class----child 2");
}
	public static void main(String[] args) {

		A a=new A();
		a.white();

		B b=new B();
		b.black();
		b.white();
	}

}
