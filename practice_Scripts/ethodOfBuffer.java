package practice_Scripts;

public class ethodOfBuffer {

	public static void main(String[] args)
	{
		//length method
		StringBuffer sb=new StringBuffer("Hello Everyone");
		System.out.println( "Length :" +sb.length());

		//delete
		StringBuffer sb1=new StringBuffer("Hello Everyone");
		System.out.println( "delete :" +sb1.delete(5, 8));
		System.out.println( "delete :" +sb1.delete(11, 14));
		System.out.println( "delete :" +sb1.delete(2, 5));

		//insert
		StringBuffer sb2=new StringBuffer("Hello Everyone");
		System.out.println(" insert :" +sb2.insert(6, "To "));

		//replace
		StringBuffer sb3=new StringBuffer("Hello Everyone");
		System.out.println(" replace :" +sb3.replace(6, 14, "world "));

		//deleteCharAT
		StringBuffer sb4=new StringBuffer("Hello world");
		System.out.println(" sindle character delete:" +sb4.deleteCharAt(4));







	}

}
