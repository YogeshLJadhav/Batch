package practice_Scripts;

import java.io.FileInputStream;

public class Exception_Script2 {


	public static void main(String[] args)  {

		try {

		//risky code
		FileInputStream a= new FileInputStream("d:/Abc.txt");
		}

		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("hello world");

	}

}
