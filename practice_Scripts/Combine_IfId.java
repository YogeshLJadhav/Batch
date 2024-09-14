package practice_Scripts;

public class Combine_IfId {

	public static void main(String[] args) {

		int age_a=32;

		if(age_a>20)
		{
			if(age_a<30)
			{
			System.out.println("under age no vaccine");
			}
			else if(age_a>20 && age_a<35)
			{
				System.out.println("eligible for dose 1");
			}
			else if(age_a>40 && age_a<60)
			{
				System.out.println(" eligible for dose 2");
			}
			else if(age_a>60 && age_a<80)
			{
				System.out.println("both dose complited");
			}
			else
			{
				System.out.println("no vaccine required");
			}


		}

	}

}
