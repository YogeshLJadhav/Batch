package practice_Scripts;

public class SwappingTwoNumber {

	public static void main(String[] args) {

int a=10;     ///without third variable swapping two number
int b=20;
int c;
a=b-a;
b=a+b;
a =b-a;
{
	System.out.println( "a " + a);
	System.out.println( "b " + b);
}
c=a;            ///a=20,b=10 output      with third variable
a=b;
b=c;
{
	System.out.println( "a " + a);
	System.out.println( "b " + b);
}


	}

}
