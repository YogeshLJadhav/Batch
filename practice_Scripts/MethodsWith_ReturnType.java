package practice_Scripts;

public class MethodsWith_ReturnType {
	public int age(int a)
	{
		System.out.println("The age of kid is "+ a);
		return a;
	}
	public boolean Condition (boolean b)
	{
		System.out.println("The statement is false "+ b);
		return b;
	}
	public String colour(String s)
	{
		System.out.println("The dress with "+ s + "looking pretty");
		return s;
	}
	public static void main(String[] args) // main method
	{
		MethodsWith_ReturnType m=new MethodsWith_ReturnType ();
        m.age(12);
        m.Condition(false);
        m.colour("pink ");
	}

}
