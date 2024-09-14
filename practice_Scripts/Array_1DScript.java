package practice_Scripts;

public class Array_1DScript {

	private static final int i = 0;

	public static void main(String[] args)
	{
		int age []=new int[5];
		age[0]=40;
		age[1]=25;
		age[2]=43;
		age[3]=36;
		age[4]=28;

		System.out.println("computing value: " +age);
		System.out.println("print the value: " +age[1]);

		System.out.println("----------------------------");

		for(int i=0; i<5; i++);
		{

			//int i=0;
			System.out.println(" print the value :" + age[i]);
		}
		//array literal
		int age1[]= {10,20,30,40,50,60,70,80,90,100,51,61,71,81,91,99};
		for(int i=0;i<16;i++)
		{
			System.out.println("array literal : " +age1[i]);
		}

		int age2[]= {10,20,39,458,44,56,56,66,88,99,33,55,77,44,32,10,80,90,70,60,40,30,10,20,50};
		for (int element : age2) {
			System.out.println("array literal :" +element);
		}
	}



}
