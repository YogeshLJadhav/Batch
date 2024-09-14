package practice_Scripts;

class AAA_01         //heratichal inheritance
{
	void black()
	{
		System.out.println("parent class _ black");
	}
}

class BBB_01 extends AAA_01
{
	void pink()
	{
		System.out.println("child class _ pink");
	}
}

class CCC_01 extends AAA_01
{
	void purpal()
	{
		System.out.println("child class _ purpal");
	}
}




public class DDD_0  extends AAA_01
{
	void white()
	{
		System.out.println( "child white");
	}

	public static void main(String[] args) {

        DDD_0 x= new DDD_0();
        x.black();
        x.white();

        BBB_01 m=new BBB_01();
        m.pink();
        m.black();

        CCC_01 n=new CCC_01();
        n.black();
        n.purpal();

	}


}
