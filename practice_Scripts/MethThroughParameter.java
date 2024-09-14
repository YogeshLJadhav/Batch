package practice_Scripts;

public class MethThroughParameter {

	public void userdefined(String name, int age,long mobile,double salary)
	{
		System.out.println(name +" "+age+" " +mobile+" " +salary);

	}
	public void userInfo() {
		String name="aaa";
		int age=45;
		long mobile=432156789;
		double salary=78000;
	}

	public int Addition(int a,int b,int c)
	{
	int d=a+b+c;
	System.out.println("add no "+d);
	return d;
	}

	public static int substraction(int a,int b,int c)
	{
		int e=b-c;
		System.out.println("substraction "+e);
		return e;
	}

	public static void main(String[] args) {
		substraction(066, 54, 22);

		MethThroughParameter a=new MethThroughParameter();
		a.userdefined("aaa", 20, 216321442, 55000);
		a.userdefined("bbb", 30, 321453211, 51897);
		a.userdefined("ddd", 25, 2134567892, 234567);
		a.userdefined("mmm", 40, 1234567894, 34569);
		a.Addition(400, 265, 543);

	}

}
