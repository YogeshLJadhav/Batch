package practice_Scripts;

public class ConstructorOfStrBuffer {

	public static void main(String[] args)
	{

		StringBuffer sb=new StringBuffer();
		System.out.println( "Default capacity of Buffer :" +sb.capacity());

		StringBuilder sb1=new StringBuilder();
		System.out.println( "Default capacity of Builder :" +sb1.capacity());

		//String constructor
		StringBuffer sb2=new StringBuffer("Welcome to java");
		System.out.println( "Default capacity of Buffer :" +sb2.capacity());

		// int constructor

		StringBuffer sb3=new StringBuffer(100);
		System.out.println( "Default capacity of Buffer :" +sb3.capacity());





	}

}
