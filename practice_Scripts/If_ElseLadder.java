package practice_Scripts;

public class If_ElseLadder {

	public static void main(String[] args) {
		int age=65;
		if (age>20)
		{

	System.out.println("under age no vaccine required");
		}
		else if(age>=20 && age<45)
		{
			System.out.println("eligible for dose 1 vaccine");
}
		else if(age>=45 && age <=60)
		{
			System.out.println(" eligible for dose 2");
		}
		else
		{
			System.out.println("no vaccine required");
		}
}}