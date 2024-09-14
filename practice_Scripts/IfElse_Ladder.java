package practice_Scripts;

public class IfElse_Ladder {

	public static void main(String[] args) {

		int age=50;

		if (age<20)
		{
			System.out.println("únder age no vaccine required");
		}
		else if(age >45 && age<60)
		{
			System.out.println("eligible for vaccine 1 dose");
		}
		else if(age>60 && age <80)
		{
			System.out.println("eligible for dose 2");
		}
		else
		{
			System.out.println("no vaccine required");
		}

}
}
