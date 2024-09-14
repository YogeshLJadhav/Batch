package practice_Scripts;

public class Str_Scripts {

	public static void main(String[] args)
	{
		String s = "Incredible";
		String a ="Akshay";
		String b ="abc123@gmail.com";
		String c ="Welcome";
		String d ="to java";

		// method length

		System.out.println("length : " +s.length());
		System.out.println("length : " +b.length());

		// concat

		System.out.println("adding 2 string data : " +a.concat (c));

		//Trim
		String e="Everyone";
		System.out.println("Before Trim : "+e);
		System.out.println("After Trim :"+e.trim());

		//charAt
		System.out.println("check index value (place value of character):" +b.charAt(9));
		System.out.println("check index value (place value of character):" +c.charAt(6));

		//contains-------true/false
		System.out.println("check whrther given scripts contain words :"+c.contains("come"));

		//Equals
		String name="Yogesh";
		System.out.println("compare string data with givaen data :"+name.equals("Yogesh"));
		System.out.println("compare string data with givaen data :"+name.equals("YogesH"));

		//EqualsEgnoreCases

		System.out.println("compare string data with givaen data (Ignore cases) :"+name.equalsIgnoreCase("Yogesh"));
		System.out.println("compare string data with givaen data (Ignore cases) :"+name.equalsIgnoreCase("YogesH"));


		//Substring
		String z="Birthday";
		System.out.println("Substring :" +z.substring(5,8 ));

		//Replace
		String y="'Happy Birthday";
		System.out.println("Replace word :"+y.replace("Birthday","Journay"));





	}

}

